package com.winzfast.controller.user;

import com.winzfast.dto.payload.request.user.RegisterRequest;
import com.winzfast.dto.payload.request.user.ResetPasswordRequest;
import com.winzfast.dto.payload.response.user.RegisterResponse;
import com.winzfast.dto.payload.response.user.ResetPasswordResponse;
import com.winzfast.entity.Role;
import com.winzfast.entity.User;
import com.winzfast.exception.DuplicatedDataException;
import com.winzfast.repository.UserRepository;
import com.winzfast.security.JwtTokenProvider;
import com.winzfast.dto.payload.request.user.LoginRequest;
import com.winzfast.dto.payload.response.user.LoginResponse;
import com.winzfast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author ADMIN
 */

@CrossOrigin(value = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private  JwtTokenProvider tokenProvider;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
        try {
            System.out.println(loginRequest.toString());
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(
                            loginRequest.getUsername(), loginRequest.getPassword()));

            SecurityContextHolder.getContext().setAuthentication(authentication);
            User user= userRepository.findByUsername(authentication.getName());

            Set<Role> roles = user.getRoles();
            List<String> rolez= new ArrayList<>();
            for (Role role: roles){
                rolez.add(role.getName());
            }

            String token = tokenProvider.generateToken(authentication);
            return new ResponseEntity<>(new LoginResponse("Đăng nhập thành công!", token,rolez), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new LoginResponse("Đăng nhập thất bại!", null,null), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(HttpServletRequest request, HttpServletResponse response) {
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if (authentication != null) {
                new SecurityContextLogoutHandler().logout(request, response, authentication);
            }
            return ResponseEntity.ok("Đăng xuất thành công.");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Đăng xuất thất bại.");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest registerRequest) {
        try {
            RegisterResponse registerResponse = userService.register(registerRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(registerResponse.getUsername() + " Register successfully!");
        } catch (DuplicatedDataException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User/Email is already exist!");
        }
    }

    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
        try {
            ResetPasswordResponse resetPasswordResponse = userService.resetPassword(resetPasswordRequest);
            return ResponseEntity.ok(resetPasswordResponse.getMessage());
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input");
        }
    }
}

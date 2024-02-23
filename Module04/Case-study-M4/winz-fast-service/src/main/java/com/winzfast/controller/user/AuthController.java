package com.winzfast.controller.user;

import com.winzfast.entity.Role;
import com.winzfast.entity.User;
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
import org.springframework.web.bind.annotation.*;

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
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenProvider tokenProvider;

    @Autowired
    UserRepository userRepository;

//    @CrossOrigin(origins = "http://localhost:63343")
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
}

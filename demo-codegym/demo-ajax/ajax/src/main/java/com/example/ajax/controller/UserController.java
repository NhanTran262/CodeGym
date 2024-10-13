package com.example.ajax.controller;

import com.example.ajax.confi.PasswordHasher;
import com.example.ajax.dto.request.ForgotPasswordRequestDTO;
import com.example.ajax.dto.request.LoginRequestDTO;
import com.example.ajax.dto.request.RegisterRequestDTO;
import com.example.ajax.dto.response.ForgotPasswordResponseDTO;
import com.example.ajax.dto.response.LoginResponseDTO;
import com.example.ajax.dto.response.RegisterResponseDTO;
import com.example.ajax.entity.User;
import com.example.ajax.exception.DuplicateDataException;
import com.example.ajax.exception.InvalidPasswordException;
import com.example.ajax.repository.UserRepository;
import com.example.ajax.service.UserService;
import com.example.ajax.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author ADMIN
 */
@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class UserController {

    private UserServiceImpl userService;
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO loginRequestDTO) throws InvalidPasswordException {
        String username = loginRequestDTO.getUsername();
        String password = loginRequestDTO.getPassword();

        LoginResponseDTO user = userService.login(loginRequestDTO);

        if (user != null) {
                return new ResponseEntity<>("login success", HttpStatus.OK);
        }
        return new ResponseEntity<>("Login failed. Invalid username or password", HttpStatus.UNAUTHORIZED);
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDTO> register(@RequestBody RegisterRequestDTO registerUserRequestDTO) {
        try {
            RegisterResponseDTO responseDTO = userService.register(registerUserRequestDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
        } catch (DuplicateDataException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @PostMapping("/reset-password")
    public ResponseEntity<ForgotPasswordResponseDTO> resetPassword(@RequestBody ForgotPasswordRequestDTO forgotPasswordRequestDto) {
        try {
            ForgotPasswordResponseDTO responseDto = userService.resetPassword(forgotPasswordRequestDto);
            return ResponseEntity.ok(responseDto);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


}

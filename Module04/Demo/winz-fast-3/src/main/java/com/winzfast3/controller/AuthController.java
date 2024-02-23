package com.winzfast3.controller;

import com.winzfast3.dto.request.LoginRequestDTO;
import com.winzfast3.dto.request.RegisterRequestDTO;
import com.winzfast3.dto.response.LoginResponseDTO;
import com.winzfast3.dto.response.RegisterResponseDTO;
import com.winzfast3.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auths")
@CrossOrigin("*")
@AllArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequestDTO registerRequestDTO) {
        try {
            RegisterResponseDTO registerResponseDTO = userService.register(registerRequestDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(registerResponseDTO.getUsername() + "Register Successfully!");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Create Failed");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        try {
            LoginResponseDTO loginResponseDTO = userService.login(loginRequestDTO);
            return ResponseEntity.status(HttpStatus.OK).body(loginResponseDTO.getFullName() + " Login successfully!");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Login Failed");
        }
    }
}

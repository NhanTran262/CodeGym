package com.winzfast3.converter;

import com.winzfast3.dto.response.RegisterResponseDTO;
import com.winzfast3.model.User;
import org.springframework.stereotype.Component;

@Component
public class RegisterConverter {
    public RegisterResponseDTO registerToDto(User user) {
        RegisterResponseDTO registerResponseDTO = new RegisterResponseDTO();
        registerResponseDTO.setUsername(user.getUsername());
        registerResponseDTO.setPassword(user.getPassword());
        registerResponseDTO.setEmail(user.getEmail());
        registerResponseDTO.setFullName(user.getFullName());
        registerResponseDTO.setPhoneNumber(user.getPhoneNumber());
        return registerResponseDTO;
    }
}

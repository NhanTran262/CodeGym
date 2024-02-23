package com.winzfast3.converter;

import com.winzfast3.dto.response.LoginResponseDTO;
import com.winzfast3.model.User;
import org.springframework.stereotype.Component;

@Component
public class LoginConverter {
    public LoginResponseDTO toDto(User user) {
        LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
        loginResponseDTO.setEmail(user.getEmail());
        loginResponseDTO.setPassword(user.getPassword());
        loginResponseDTO.setFullName(user.getFullName());
        return loginResponseDTO;
    }
}

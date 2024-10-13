package com.example.ajax.converter;

import com.example.ajax.dto.request.LoginRequestDTO;
import com.example.ajax.dto.response.LoginResponseDTO;
import com.example.ajax.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author ADMIN
 */
@Component
public class LoginConverter {
    public static LoginResponseDTO loginEntityToLoginDto(User user){
        LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
        loginResponseDTO.setUsername(user.getUsername());

        return loginResponseDTO;
    }

    public User loginDtoToLoginEntity (LoginRequestDTO loginRequestDTO){
        User user = new User();
        user.setUsername(loginRequestDTO.getUsername());
        user.setPassword(loginRequestDTO.getPassword());

        return user;
    }

}

package com.example.ajax.converter;

import com.example.ajax.dto.response.RegisterResponseDTO;
import com.example.ajax.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author ADMIN
 */
@Component
public class RegisterConverter {

    public RegisterResponseDTO registerUserEntityToRegisterDto (User user){
        RegisterResponseDTO registerResponseDTO = new RegisterResponseDTO();
        registerResponseDTO.setId(user.getId());
        registerResponseDTO.setUsername(user.getUsername());
        registerResponseDTO.setPassword(user.getPassword());
        registerResponseDTO.setFirstName(user.getFirstName());
        registerResponseDTO.setLastName(user.getLastName());
        registerResponseDTO.setCitizenIdentification(user.getCitizenIdentification());
        registerResponseDTO.setDateRange(user.getDateRange());
        registerResponseDTO.setEmail(user.getEmail());
        registerResponseDTO.setNumberPhone(user.getNumberPhone());
        registerResponseDTO.setAddress(user.getAddress());

        return registerResponseDTO;
    }

}

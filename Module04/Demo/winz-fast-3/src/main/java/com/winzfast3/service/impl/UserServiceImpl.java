package com.winzfast3.service.impl;

import com.winzfast3.converter.LoginConverter;
import com.winzfast3.converter.RegisterConverter;
import com.winzfast3.dto.request.LoginRequestDTO;
import com.winzfast3.dto.request.RegisterRequestDTO;
import com.winzfast3.dto.response.LoginResponseDTO;
import com.winzfast3.dto.response.RegisterResponseDTO;
import com.winzfast3.model.User;
import com.winzfast3.repository.UserRepository;
import com.winzfast3.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final RegisterConverter registerConverter;
    private final UserRepository userRepository;
    private final LoginConverter loginConverter;

    @Override
    public RegisterResponseDTO register(RegisterRequestDTO registerRequestDTO) {
        User user = new User();
        user.setUsername(registerRequestDTO.getUsername());
        user.setPassword(registerRequestDTO.getPassword());
        user.setFullName(registerRequestDTO.getFullName());
        user.setPhoneNumber(registerRequestDTO.getPhoneNumber());
        user.setEmail(registerRequestDTO.getEmail());
        userRepository.save(user);
        return registerConverter.registerToDto(user);
    }

    @Override
    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) {
        String password = loginRequestDTO.getPassword();
        if (password != null) {
            User user = userRepository.findByEmail(loginRequestDTO.getEmail());
            if (user != null) {
                if (password.equals(user.getPassword())){
                    return loginConverter.toDto(user);
                }
            }
        }
        return null;
    }

    @Override
    public void logout(Long id) {

    }
}

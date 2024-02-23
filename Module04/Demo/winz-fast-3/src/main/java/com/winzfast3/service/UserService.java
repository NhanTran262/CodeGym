package com.winzfast3.service;

import com.winzfast3.dto.request.LoginRequestDTO;
import com.winzfast3.dto.request.RegisterRequestDTO;
import com.winzfast3.dto.response.LoginResponseDTO;
import com.winzfast3.dto.response.RegisterResponseDTO;

public interface UserService {


     RegisterResponseDTO register(RegisterRequestDTO registerRequestDTO);
     LoginResponseDTO login(LoginRequestDTO loginRequestDTO);
     void logout(Long id);

}

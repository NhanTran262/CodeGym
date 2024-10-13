package com.example.ajax.service;

import com.example.ajax.dto.request.ForgotPasswordRequestDTO;
import com.example.ajax.dto.request.LoginRequestDTO;
import com.example.ajax.dto.request.RegisterRequestDTO;
import com.example.ajax.dto.response.ForgotPasswordResponseDTO;
import com.example.ajax.dto.response.LoginResponseDTO;
import com.example.ajax.dto.response.RegisterResponseDTO;
import com.example.ajax.exception.DuplicateDataException;
import com.example.ajax.exception.InvalidPasswordException;

/**
 * @author ADMIN
 */
public interface UserService {

    LoginResponseDTO login (LoginRequestDTO loginRequestDTO) throws InvalidPasswordException;

    RegisterResponseDTO register(RegisterRequestDTO registerUserRequestDTO) throws DuplicateDataException;

    ForgotPasswordResponseDTO resetPassword(ForgotPasswordRequestDTO forgotPasswordRequestDto);

}

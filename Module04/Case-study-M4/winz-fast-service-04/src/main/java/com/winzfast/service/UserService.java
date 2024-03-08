package com.winzfast.service;

import com.winzfast.dto.UserDTO;
import com.winzfast.dto.payload.request.user.LoginRequest;
import com.winzfast.dto.payload.request.user.RegisterRequest;
import com.winzfast.dto.payload.request.user.ResetPasswordRequest;
import com.winzfast.dto.payload.response.user.LoginResponse;
import com.winzfast.dto.payload.response.user.RegisterResponse;
import com.winzfast.dto.payload.response.user.ResetPasswordResponse;
import com.winzfast.entity.User;
import com.winzfast.exception.DuplicatedDataException;
import com.winzfast.exception.InvalidInputException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

public interface UserService {

    Page<UserDTO> findAll(Pageable pageable);
    List<UserDTO> getUsers();
    List<UserDTO> getUsersByFullName(String fullName);
    UserDTO getUserById(Long userId);
//    Iterable<UserDTO> findAll();
    Optional<UserDTO> findById(Long id);
    void save(UserDTO userDto);
    void remove(Long id);

    RegisterResponse register(RegisterRequest registerRequest) throws DuplicatedDataException;

    ResetPasswordResponse resetPassword(ResetPasswordRequest resetPasswordRequest);

    Iterable<UserDTO> findUser(String input);
}




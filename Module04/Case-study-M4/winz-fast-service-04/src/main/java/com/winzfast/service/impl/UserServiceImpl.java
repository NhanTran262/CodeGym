package com.winzfast.service.impl;


import com.winzfast.converter.user.RegisterConverter;
import com.winzfast.dto.UserDTO;
import com.winzfast.dto.payload.request.user.RegisterRequest;
import com.winzfast.dto.payload.request.user.ResetPasswordRequest;
import com.winzfast.dto.payload.response.user.RegisterResponse;
import com.winzfast.dto.payload.response.user.ResetPasswordResponse;
import com.winzfast.exception.DuplicatedDataException;
import com.winzfast.entity.User;
import com.winzfast.repository.UserRepository;
import com.winzfast.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

//    @Override
//    public Iterable<UserDTO> findAll() {
//        Iterable<User> entities = userRepository.findAll();
//        return StreamSupport.stream(entities.spliterator(), true)
//                .map(entity -> modelMapper.map(entity, UserDTO.class))
//                .collect(Collectors.toList());
//    }

    @Override
    public Page<UserDTO> findAll(Pageable pageable) {
        Page<User> entities = userRepository.findAll(pageable);

        List<UserDTO> dtos = entities.getContent().stream()
                .map(entity -> modelMapper.map(entity, UserDTO.class))
                .collect(Collectors.toList());

        return new PageImpl<>(dtos, pageable, entities.getTotalElements());
    }

    @Override
    public Optional<UserDTO> findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return Optional.ofNullable(modelMapper.map(user, UserDTO.class));
    }

    @Override
    public void save(UserDTO userDto) {
        User user = modelMapper.map(userDto, User.class);
        if (!userDto.getPassword().isEmpty()) {
            String hashedPassword = BCrypt.hashpw(userDto.getPassword(), BCrypt.gensalt(10));
            user.setPassword(hashedPassword);
        }
        userRepository.save(user);
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) throws DuplicatedDataException {

        if (userRepository.existsByUsername(registerRequest.getUsername())) {
            throw new DuplicatedDataException("Username is already exist!");
        } else if (registerRequest.getPassword() == null || registerRequest.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be blank.");
        } else if (userRepository.existsByEmail(registerRequest.getEmail())) {
            throw new DuplicatedDataException("The email already exists in the database");
        }

        User newUser = new User();
        newUser.setUsername(registerRequest.getUsername());
        newUser.setPassword(BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt(12)));
        newUser.setEmail(registerRequest.getEmail());
        newUser.setAddress(registerRequest.getAddress());
        newUser.setPhoneNumber(registerRequest.getPhoneNumber());

        userRepository.save(newUser);
        return RegisterConverter.registerEntityToDto(newUser);
    }

    @Override
    public ResetPasswordResponse resetPassword(ResetPasswordRequest resetPasswordRequest) {
//        String username = resetPasswordRequest.getUsername();
        String email = resetPasswordRequest.getEmail();
        String newPassword = resetPasswordRequest.getNewPassword();
        User user = userRepository.findByEmail(email);

        if (user != null) {
            user.setPassword(BCrypt.hashpw(newPassword, BCrypt.gensalt(12)));
            userRepository.save(user);
            return new ResetPasswordResponse("Reset password successfully!", HttpStatus.OK);
        } else {
            throw new RuntimeException("Invalid email!");
        }
    }




    @Override
    public List<UserDTO> getUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> getUsersByFullName(String fullName) {
        String likeFullName = "%" + fullName + "%";
        List<User> users = userRepository.findByFullName(likeFullName);
        return users.stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public Iterable<UserDTO> findUser(String input) {
        Iterable<User> users = userRepository.findAll();
        List<UserDTO> userDTOS = new ArrayList<>();
        for (User user : users) {
            if (user.getUsername().contains(input)) {
                userDTOS.add(modelMapper.map(user, UserDTO.class));
            }
        }
        return userDTOS;
    }
}



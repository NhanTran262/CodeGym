package com.example.ajax.service.impl;

import com.example.ajax.confi.PasswordHasher;
import com.example.ajax.converter.LoginConverter;
import com.example.ajax.converter.RegisterConverter;
import com.example.ajax.dto.request.ForgotPasswordRequestDTO;
import com.example.ajax.dto.request.LoginRequestDTO;
import com.example.ajax.dto.request.RegisterRequestDTO;
import com.example.ajax.dto.response.ForgotPasswordResponseDTO;
import com.example.ajax.dto.response.LoginResponseDTO;
import com.example.ajax.dto.response.RegisterResponseDTO;
import com.example.ajax.entity.User;
import com.example.ajax.exception.DuplicateDataException;
import com.example.ajax.exception.InvalidPasswordException;
import com.example.ajax.repository.UserRepository;
import com.example.ajax.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * @author ADMIN
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RegisterConverter registerConverter;

    @Override
    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) throws InvalidPasswordException {
        String password = loginRequestDTO.getPassword();
        if(password != null){
            User user = userRepository.findByUsername(loginRequestDTO.getUsername());

            if(user != null){
                String storedHashedPassword = user.getPassword();

                if (PasswordHasher.checkPassword(password, storedHashedPassword)) {
                    LoginResponseDTO loginResponseDTO = LoginConverter.loginEntityToLoginDto(user);
                    loginResponseDTO.setMessage("Logged in successfully!");

                    return loginResponseDTO;
                }else {
                    throw new InvalidPasswordException ("Incorrect password.");
                }
            }
        }
        return null;
    }

    @Override
    public RegisterResponseDTO register(RegisterRequestDTO registerUserRequestDTO) throws DuplicateDataException {
        String password = registerUserRequestDTO.getPassword();

        if(password == null || password.isEmpty()){
            throw new IllegalArgumentException("Password cannot be blank.");
        }
        String hashedPassword = PasswordHasher.hashPassword(null);

        if (userRepository.existsByCitizenIdentification(registerUserRequestDTO.getCitizenIdentification())) {
            throw new DuplicateDataException("CitizenIdentification already exists in the database");
        }

        if (userRepository.existsByEmail(registerUserRequestDTO.getEmail())) {
            throw new DuplicateDataException("The email already exists in the database");
        }

        User user = User.builder().username(registerUserRequestDTO.getUsername())
                .password(hashedPassword)
                .firstName(registerUserRequestDTO.getFirstName())
                .lastName(registerUserRequestDTO.getLastName())
                .citizenIdentification(registerUserRequestDTO.getCitizenIdentification())
                .dateRange(registerUserRequestDTO.getDateRange())
                .email(registerUserRequestDTO.getEmail())
                .numberPhone(registerUserRequestDTO.getNumberPhone())
                .address(registerUserRequestDTO.getAddress())
                .build();

        userRepository.save(user);
        return registerConverter.registerUserEntityToRegisterDto(user);
    }


    @Override
    public ForgotPasswordResponseDTO resetPassword(ForgotPasswordRequestDTO forgotPasswordRequestDto) {
        String username = forgotPasswordRequestDto.getUsername();
        String numberPhone = forgotPasswordRequestDto.getNumberPhone();
        String newPassword = forgotPasswordRequestDto.getNewPassword();
        User existingUser = userRepository.findByUsernameAndNumberPhone(username, numberPhone);


        if (existingUser != null) {
            String hashedPassword = PasswordHasher.hashPassword(newPassword);
            existingUser.setPassword(hashedPassword);
            userRepository.save(existingUser);

            return new ForgotPasswordResponseDTO("Reset password successfully." , HttpStatus.OK);
        } else {
            throw new RuntimeException("Invalid username or phone number.");
        }
    }
}

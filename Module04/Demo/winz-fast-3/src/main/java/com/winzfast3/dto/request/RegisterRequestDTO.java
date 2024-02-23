package com.winzfast3.dto.request;

import lombok.Data;

@Data
public class RegisterRequestDTO {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String fullName;


}

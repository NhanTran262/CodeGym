package com.winzfast3.dto.response;

import lombok.Data;

@Data
public class RegisterResponseDTO {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String fullName;
}

package com.winzfastsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String address;
    private String phone;
    private String avatar;
    private Boolean activated;
    private String rememberToken;
}

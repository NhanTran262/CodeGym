package com.winzfast3.dto;

import lombok.Data;

import java.util.Date;
@Data
public class UserDTO {
    private Long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String avatar;
    private Date dateOfBirth;
    private boolean isDelete;


}

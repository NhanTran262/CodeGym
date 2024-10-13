package com.example.ajax.dto.request;

import lombok.Data;

import java.util.Date;

/**
 * @author ADMIN
 */
@Data
public class RegisterRequestDTO {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String citizenIdentification;
    private Date dateRange;
    private String email;
    private String numberPhone;
    private String address;
}

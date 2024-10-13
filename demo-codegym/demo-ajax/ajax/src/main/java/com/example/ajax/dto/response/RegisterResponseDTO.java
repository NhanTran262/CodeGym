package com.example.ajax.dto.response;

import lombok.Data;

import java.util.Date;

/**
 * @author ADMIN
 */
@Data
public class RegisterResponseDTO {

    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String citizenIdentification;
    private Date dateRange;
    private String email;
    private String numberPhone;
    private String address;
    private String message;

}

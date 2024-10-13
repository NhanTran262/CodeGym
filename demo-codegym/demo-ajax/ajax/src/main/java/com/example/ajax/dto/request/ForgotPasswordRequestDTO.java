package com.example.ajax.dto.request;

import lombok.Data;

/**
 * @author ADMIN
 */
@Data
public class ForgotPasswordRequestDTO {

    private String username;
    private String numberPhone;
    private String newPassword;

}

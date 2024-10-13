package com.example.ajax.dto.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @author ADMIN
 */
@Data
public class ForgotPasswordResponseDTO {

    private String message;

    public ForgotPasswordResponseDTO(String s, HttpStatus httpStatus) {
    }
}

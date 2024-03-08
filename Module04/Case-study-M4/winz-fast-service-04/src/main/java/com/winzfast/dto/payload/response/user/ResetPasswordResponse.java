package com.winzfast.dto.payload.response.user;


import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @author ADMIN
 */
@Data
public class ResetPasswordResponse {

    private String message;

    public ResetPasswordResponse() {
    }

    public ResetPasswordResponse(String message, HttpStatus httpStatus) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

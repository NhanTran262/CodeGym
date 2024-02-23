
package com.winzfast.dto.payload.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ADMIN
 */
    @Data
    public class Response {
        private String message;
        private Object data;
        private int status;

        public Response(String s, Object o, int value, boolean b) {

        }

    public Response(String message, Object data, int status) {
        this.message = message;
        this.data = data;
        this.status = status;
    }

    public Response() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}


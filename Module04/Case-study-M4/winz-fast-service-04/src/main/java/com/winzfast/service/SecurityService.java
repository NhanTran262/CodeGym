package com.winzfast.service;

import org.springframework.stereotype.Service;


public interface SecurityService {
    boolean isAuthenticated();
    boolean isValidToken(String token);
}
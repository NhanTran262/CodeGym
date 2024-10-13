package com.example.ajax.confi;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component

public class PasswordHasher {
    public static String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt(12));
    }

    public static boolean checkPassword(String userInputPassword, String storedHashedPassword) {
        return BCrypt.checkpw(userInputPassword, storedHashedPassword);
    }
}

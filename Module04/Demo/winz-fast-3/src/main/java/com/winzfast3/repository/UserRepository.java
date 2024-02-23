package com.winzfast3.repository;

import com.winzfast3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
User findByEmail(String email);
boolean existsByEmail(String email);
boolean existsByPhoneNumber(String phoneNumber);
boolean existsByUsername(String username);
}

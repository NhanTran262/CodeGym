package com.example.ajax.repository;

import com.example.ajax.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author ADMIN
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);

    Optional<User> findById(Long id);

    User findByUsernameAndNumberPhone  (String username, String numberPhone);

    Optional<Object> findByCitizenIdentification(String citizenIdentification);

    Optional<Object> findByEmail(String email);

    boolean existsByCitizenIdentification(String citizenIdentification);

    boolean existsByEmail(String email);
}

package com.codegym.model.repository;

import com.codegym.model.dto.RoleDto;
import com.codegym.model.entity.AppUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Iterable<AppUser> findAllByRole(RoleDto roleDto);

    AppUser findByUsername(String username);

    Page<AppUser> findAllByNameContaining(String name, Pageable pageable);

    @Query(nativeQuery = true, value = "SELECT r.role_name FROM roles r " +
            "INNER JOIN users u ON r.role_id = u.role_id " +
            "WHERE u.username = :username")
    List<String> findRolesByUsername(@Param("username") String username);
}

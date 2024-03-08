package com.winzfast.service;

import com.winzfast.dto.RoleDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface RoleService {

    Iterable<RoleDTO> findAll();
    Optional<RoleDTO> findById(Long id);
    void save(RoleDTO roleDto);
    void remove(Long id);
}

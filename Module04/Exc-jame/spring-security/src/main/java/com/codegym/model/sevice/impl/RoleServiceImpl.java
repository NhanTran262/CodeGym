package com.codegym.model.sevice.impl;

import com.codegym.model.dto.RoleDto;
import com.codegym.model.repository.RoleRepository;
import com.codegym.model.sevice.IRoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public Iterable<RoleDto> findAll() {
        return null;
    }

    @Override
    public Optional<RoleDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(RoleDto roleDto) {

    }

    @Override
    public void remove(Long id) {

    }
}

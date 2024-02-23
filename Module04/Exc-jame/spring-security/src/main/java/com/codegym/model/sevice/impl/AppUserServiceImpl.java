package com.codegym.model.sevice.impl;

import com.codegym.model.dto.AppUserDto;
import com.codegym.model.dto.RoleDto;
import com.codegym.model.repository.AppUserRepository;
import com.codegym.model.sevice.IAppUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AppUserServiceImpl implements IAppUserService {
    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public Iterable<AppUserDto> findAllByRole(RoleDto roleDto) {
        return null;
    }

    @Override
    public Page<AppUserDto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<AppUserDto> findAllByNameContaining(String name, Pageable pageable) {
        return null;
    }

    @Override
    public boolean isAuthenticated() {
        return false;
    }

    @Override
    public Iterable<AppUserDto> findAll() {
        return null;
    }

    @Override
    public Optional<AppUserDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(AppUserDto appUserDto) {

    }

    @Override
    public void remove(Long id) {

    }
}

package com.codegym.model.sevice;

import com.codegym.model.dto.AppUserDto;
import com.codegym.model.dto.RoleDto;
import com.codegym.model.entity.AppUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAppUserService extends IGeneralService<AppUserDto> {
    Iterable<AppUserDto> findAllByRole(RoleDto roleDto);
    Page<AppUserDto> findAll(Pageable pageable);
    Page<AppUserDto> findAllByNameContaining(String name, Pageable pageable);
    boolean isAuthenticated();
}

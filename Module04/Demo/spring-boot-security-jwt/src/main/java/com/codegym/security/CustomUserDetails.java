package com.codegym.security;

import com.codegym.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class CustomUserDetails implements UserDetails {
    private Long id;
    private String userName;
    @JsonIgnore
    private String password;
    private Date created;
    private boolean status;
    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    //Thông tin User chuyển sang CustomUserDetails
    public static CustomUserDetails mapUserToUserDetails(User user) {
        //Lấy các quyền từ đối tượng user
        List<GrantedAuthority> listAuthorities = user.getListRole().stream()
                .map(role -> new SimpleGrantedAuthority(role.getRoleName().name()))
                .collect(Collectors.toList());

//        List<GrantedAuthority> list = new ArrayList<>();
//        for (Role role : user.getListRole()) {
//            SimpleGrantedAuthority sga = new SimpleGrantedAuthority(role.getRoleName().name());
//            list.add(sga);
//        }
//        listAuthorities = list;

        //Trả về đối tượng CustomUserDetails
        return new CustomUserDetails(
                user.getId(),
                user.getUserName(),
                user.getPassword(),
                user.getCreated(),
                user.isStatus(),
                listAuthorities
        );
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

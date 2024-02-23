package com.example.model.entity.user;

import jakarta.persistence.*;


import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", length = 20, nullable = false)
    private Long id;
    @Column(length = 50, nullable = false)
    private String username;
    @Column(length = 50, nullable = false)
    private String password;
    private boolean isEnable;
    @ManyToMany(mappedBy = "users")
    private List<Roles> roles;


}

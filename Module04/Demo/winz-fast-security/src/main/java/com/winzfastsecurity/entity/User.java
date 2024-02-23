package com.winzfastsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users",
        uniqueConstraints = {@UniqueConstraint(name = "user_uk",
                columnNames = {"email", "phone"})})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Role> roles = new HashSet<>();
    @NotBlank
    @Column(name = "full_name",length = 100,nullable = false)
    private String fullName;
    @NotBlank
    @Column(name = "username",length = 100,nullable = false)
    private String username;
    @NotBlank
    @Column(name = "password",length = 200,nullable = false)
    private String password;
    @NotBlank
    @Column(name = "email",length = 100,nullable = false)
    private String email;
    @NotBlank
    @Column(name = "address",length = 200,nullable = false)
    private String address;
    @NotBlank
    @Column(name = "phone", length = 12,nullable = false)
    private String phone;
    @NotBlank
    @Column(name = "avatar",columnDefinition = "text",nullable = true)
    private String avatar;
    @NotBlank
    @Column(name = "activated",nullable = true)
    private Boolean activated;
    @NotBlank
    @Column(name = "remember_token",length = 200,nullable = true)
    private String rememberToken;
}

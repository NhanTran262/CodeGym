package com.winzfast3.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="full_name", length = 50)
    private String fullName;
    @Column(name = "username",length = 50, nullable = false, unique = true)
    private String username;
    @Column(name = "password",length = 50,nullable = false)
    private String password;
    @Column(name = "email",length = 100,nullable = false,unique = true)
    private String email;
    @Column(name = "phone_number",length = 15,nullable = false,unique = true)
    private String phoneNumber;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "is_deleted")
    private boolean isDelete;


}

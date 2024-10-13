package com.example.ajax.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_NAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "CCCD_CMND")
    private String citizenIdentification;

    @Column(name = "DATE_RANGE")
    private Date dateRange;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NUMBER_PHONE")
    private String numberPhone;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ROLE")
    private String role;

}

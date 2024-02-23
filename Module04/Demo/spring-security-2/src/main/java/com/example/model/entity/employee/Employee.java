package com.example.model.entity.employee;

import com.example.model.entity.user.AppUser;
import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Long id;
    @Column(name = "employee_name", length = 50, nullable = false)
    private String name;
    @Column(name = "date_of_birth", length = 15, nullable = false)
    private String dateOfBirth;
    private boolean gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String address;
    private Level levelId;
    private Position positionId;
    private Department departmentId;
    private double salary;
    private AppUser userId;
    private boolean isEnable;
}

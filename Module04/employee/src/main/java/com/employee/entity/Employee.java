package com.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "employee_code")
    private String employeeCode;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Long age;
    @Column(name = "salary")
    private Double salary;
    @ManyToOne()
    @JoinColumn(name = "branch_id")
    private Branch branch;

}

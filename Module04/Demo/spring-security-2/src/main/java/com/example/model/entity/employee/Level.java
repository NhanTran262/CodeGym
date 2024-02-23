package com.example.model.entity.employee;

import jakarta.persistence.*;

@Entity
@Table(name = "levels")
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "level_id",nullable = false)
    private Long id;
    @Column(name = "level_name", length = 50)
    private String name;
    @Column(name = "is_enable")
    private boolean isEnable;
}

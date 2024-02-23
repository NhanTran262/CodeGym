package com.example.model.entity.employee;

import jakarta.persistence.*;

@Entity
@Table(name = "positions")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id",nullable = false)
    private Long id;
    @Column(name = "position_name",length = 50)
    private String name;
    @Column(name = "is_enable")
    private boolean isEnable;
}

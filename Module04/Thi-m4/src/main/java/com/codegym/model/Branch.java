package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    private Long id;
    @Column(name = "name")
    private String name;

    public Branch(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Branch(String name) {
        this.name = name;
    }

    public Branch() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

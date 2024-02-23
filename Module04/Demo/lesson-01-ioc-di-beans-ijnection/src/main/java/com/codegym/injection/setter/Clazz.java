package com.codegym.injection.setter;

public class Clazz {
private int id;
private String name;
private Student student;

    public Clazz(int id, String name, Student student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public Clazz() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}

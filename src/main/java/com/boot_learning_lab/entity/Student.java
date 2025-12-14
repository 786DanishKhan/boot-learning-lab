package com.boot_learning_lab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String course;

    public Student(String name, String course) {
    this.name = name;
    this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}

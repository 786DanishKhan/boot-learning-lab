package com.boot_learning_lab.model;


public class StudentDto {
    private final String name;
    private  String course;

    public StudentDto(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return this.name;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course){
        this.course = course;
    }
}

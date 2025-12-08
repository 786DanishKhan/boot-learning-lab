package com.boot_learning_lab.service;

import com.boot_learning_lab.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>();

    public List<Student> getAllStudent() {
        return students;
    }

    public void addStudent(Student obj) {
        students.add(obj);
    }

    public void deleteStudent() {

    }
}

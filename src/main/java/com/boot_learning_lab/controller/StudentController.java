package com.boot_learning_lab.controller;

import com.boot_learning_lab.model.Student;
import com.boot_learning_lab.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @GetMapping("/students")
    public List<Student> student() {
        return studentService.getAllStudent();
    }

    @PostMapping("/add-student")
    public List<Student> addStudent(@RequestBody List<Student> obj) {
        studentService.addStudent(obj);
        return obj;
    }

    @DeleteMapping("/delete-student/{name}")
    public String deleteStudent(@PathVariable String name) {
        studentService.deleteStudent(name);
        return name;
    }

    @PutMapping("/update-student")
    public Student updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return student;
    }

    @GetMapping("/count-students")
    public int countStudent() {
        return studentService.countStudent();
    }
}





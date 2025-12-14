package com.boot_learning_lab.controller;

import com.boot_learning_lab.model.StudentDto;
import com.boot_learning_lab.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @GetMapping("/students")
    public List<StudentDto> student() {
        return studentService.getAllStudent();
    }

    @PostMapping("/add-student")
    public List<StudentDto> addStudent(@RequestBody List<StudentDto> obj) {
        studentService.addStudent(obj);
        return obj;
    }

    @DeleteMapping("/delete-student/{name}")
    public String deleteStudent(@PathVariable String name) {
        studentService.deleteStudent(name);
        return name;
    }

    @PutMapping("/update-student")
    public StudentDto updateStudent(@RequestBody StudentDto studentDto) {
        studentService.updateStudent(studentDto);
        return studentDto;
    }

    @GetMapping("/count-students")
    public int countStudent() {
        return studentService.countStudent();
    }
}





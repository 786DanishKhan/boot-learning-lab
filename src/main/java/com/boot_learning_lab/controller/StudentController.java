package com.boot_learning_lab.controller;

import com.boot_learning_lab.model.Student;
import com.boot_learning_lab.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public Student addStudent(@RequestBody Student obj) {
        studentService.addStudent(obj);
        return obj;
    }

    /* *//*  @DeleteMapping("/delete-student/{name}")
    public void deleteStudent(@PathVariable String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                students.remove(s);
            }
        }
    }

    @PutMapping("/update-student")
    public void updateStudent(@RequestBody Student student) {
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                s.setCourse(student.getCourse());
            }
        }*//*


    }*/


}


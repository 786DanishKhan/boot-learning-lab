package com.boot_learning_lab.controller;

import com.boot_learning_lab.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {
    List<Student> students = new ArrayList<>();

    @GetMapping("/student")
    public List<Student> student() {
        //Student student = new Student("Danish", "Engineering");
        // return student;
        return students;
    }

    @PostMapping("/add-student")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @DeleteMapping("/delete-student/{name}")
    public void deleteStudent(@PathVariable String name){
        for(Student s :students ){
            if(s.getName().equals(name)){
                students.remove(s);
            }
        }
    }
    @PutMapping("/update-student")
    public void updateStudent(@RequestBody Student student){
        for (Student s : students){
            if(s.getName().equals(student.getName())){
                s.setCourse(student.getCourse());
            }
        }

    }







    }


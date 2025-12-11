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

    public void addStudent(List<Student> students) {
        for (Student s : students) {
            students.add(s);
        }
    }

    public void deleteStudent(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                students.remove(s);
            }
        }
    }

    public void updateStudent(Student student) {
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                s.setCourse(student.getCourse());
            }
        }
    }

    public int countStudent() {
        return students.size();
    }
}

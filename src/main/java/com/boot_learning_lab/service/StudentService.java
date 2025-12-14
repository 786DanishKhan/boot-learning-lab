package com.boot_learning_lab.service;

import com.boot_learning_lab.entity.Student;
import com.boot_learning_lab.model.StudentDto;
import com.boot_learning_lab.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    List<StudentDto> studentDtos = new ArrayList<>();

    public List<StudentDto> getAllStudent() {
        //return studentDtos;
        List<Student> students = studentRepository.findAll();
        for (Student st : students) {
            StudentDto obj = new StudentDto(st.getName(), st.getCourse());
            studentDtos.add(obj);

        }
        return studentDtos;
    }

    public void addStudent(List<StudentDto> studentDtos) {
        for (StudentDto s : studentDtos) {
            //  students.add(s);
            Student obj = new Student(s.getName(), s.getCourse());
            studentRepository.save(obj);
        }
    }

    public void deleteStudent(String name) {
        for (StudentDto s : studentDtos) {
            if (s.getName().equals(name)) {
                studentDtos.remove(s);
            }
        }
    }

    public void updateStudent(StudentDto studentDto) {
        for (StudentDto s : studentDtos) {
            if (s.getName().equals(studentDto.getName())) {
                s.setCourse(studentDto.getCourse());
            }
        }
    }

    public int countStudent() {
        return studentDtos.size();
    }
}

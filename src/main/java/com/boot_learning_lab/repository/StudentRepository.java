package com.boot_learning_lab.repository;

import com.boot_learning_lab.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}

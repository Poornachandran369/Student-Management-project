package com.poorna.student.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.poorna.student.Management.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> { }


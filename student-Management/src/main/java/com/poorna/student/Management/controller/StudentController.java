package com.poorna.student.Management.controller;

import com.poorna.student.Management.model.Student;
import com.poorna.student.Management.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody Student s){
        System.out.println("hai");
        studentService.addStudent(s);
        return "Operation success";
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentById(@PathVariable long id){
        return studentService.getStudentById(id);
    }

}

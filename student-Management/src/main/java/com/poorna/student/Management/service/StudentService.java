package com.poorna.student.Management.service;

import com.poorna.student.Management.model.Student;
import com.poorna.student.Management.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentById(long id) {
        return studentRepository.findById(id);
    }
    public String deleteStudentById(long id){
         studentRepository.deleteById(id);
        return "Deleted successfully";
    }

}

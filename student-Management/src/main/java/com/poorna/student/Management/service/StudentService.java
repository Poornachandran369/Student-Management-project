package com.poorna.student.Management.service;
import com.poorna.student.Management.Dto.StudentDto;
import com.poorna.student.Management.Mapper.StudentMapper;
import com.poorna.student.Management.exception.StudentNotFoundException;
import com.poorna.student.Management.model.Student;
import com.poorna.student.Management.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public StudentDto getStudentById(long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found"));
        return StudentMapper.toStudentDto(student);
    }

    public String deleteStudentById(long id){
         if(!studentRepository.existsById(id)){
             throw new  StudentNotFoundException("Student not found");
         }
         studentRepository.deleteById(id);
         return "Student ("+ id + ") deleted.";
    }

    public StudentDto UpdateStudent(Long id, Student updatedStudent){

        Student existingStudent  = studentRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Student not found"));

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setDepartment(updatedStudent.getDepartment());
        existingStudent.setDateOfBirth(updatedStudent.getDateOfBirth());
        existingStudent.setGender(updatedStudent.getGender());
        existingStudent.setMobileNum(updatedStudent.getMobileNum());
        existingStudent.setEmail(updatedStudent.getEmail());

        return  StudentMapper.toStudentDto(studentRepository.save(existingStudent));
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}

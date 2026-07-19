package com.poorna.student.Management.Mapper;


import com.poorna.student.Management.Dto.StudentDto;
import com.poorna.student.Management.model.Student;
import java.util.Optional;

public class StudentMapper {

    public static StudentDto toStudentDto(Student student){
        StudentDto studentDto = new StudentDto();

        studentDto.setStudentId(student.getStudentId().toString());
        studentDto.setName(student.getName());
        studentDto.setAge(student.getAge().toString());
        studentDto.setDepartment(student.getDepartment());
        studentDto.setGender(student.getGender());
        studentDto.setDateOfBirth(student.getDateOfBirth().toString());
        studentDto.setMobileNum(student.getMobileNum());
        studentDto.setEmail(student.getEmail());

        return studentDto;
    }
}

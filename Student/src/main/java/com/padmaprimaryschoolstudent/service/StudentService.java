package com.padmaprimaryschoolstudent.service;

import com.padmaprimaryschoolstudent.model.Student;
import com.padmaprimaryschoolstudent.model.dto.StudentDTO;
import com.padmaprimaryschoolstudent.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student createStudent( StudentDTO studentDTO){
        Student newStudent= new Student();
        newStudent.setStudentName(studentDTO.getStudentName());
        newStudent.setStudentFee(studentDTO.getStudentFee());
       return studentRepository.save(newStudent);
    }
}

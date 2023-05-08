package com.padmaprimaryschoolstudent.controller;

import com.padmaprimaryschoolstudent.model.Student;
import com.padmaprimaryschoolstudent.model.dto.StudentDTO;
import com.padmaprimaryschoolstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student-ping")
    public String studentPing() {
        return "Student Ping";
    }

    @PostMapping(value = "/student-create")
    public Student createStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.createStudent(studentDTO);
    }
}

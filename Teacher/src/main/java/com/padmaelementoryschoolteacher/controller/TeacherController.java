package com.padmaelementoryschoolteacher.controller;

import com.padmaelementoryschoolteacher.model.Teacher;
//import com.padmaelementoryschoolteacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    //@Autowired
  //  private TeacherService teacherService;
//    @PostMapping(value = "/teacher")
//    public Teacher createTeacher(@RequestBody Teacher teacher){
//        Teacher savedTeacher=teacherService.createTeacher(teacher);
//        return  savedTeacher;
//    }
    @GetMapping(value = "/ping")
    public String pingTeacher(){
        return "Teacher Ping ";
    }
}

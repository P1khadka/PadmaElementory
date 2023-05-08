//package com.padmaelementoryschoolteacher.service;
//
//import com.padmaelementoryschoolteacher.model.Teacher;
//import com.padmaelementoryschoolteacher.repo.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class TeacherService {
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    public Teacher createTeacher(Teacher teacher){
//        teacher.setTeacherId(teacher.getTeacherId());
//       teacher.setTeacherName(teacher.getTeacherName());
//
//Teacher savedTeacher= teacherRepository.save(teacher);
//        return  savedTeacher;
//
//    }
//}

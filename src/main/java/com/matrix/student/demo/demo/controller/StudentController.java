package com.matrix.student.demo.demo.controller;

import com.matrix.student.demo.demo.model.Student;
import com.matrix.student.demo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("add/{name}")
    Student add(@PathVariable String name){
        Student student = new Student();
        student.setName(name);
        Student dbStudent = studentService.save(student);
        return dbStudent;
    }

    @GetMapping("all")
    List<Student> getAll(){
        return studentService.findAll();
    }
}

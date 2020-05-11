package com.matrix.student.demo.demo.service;

import com.matrix.student.demo.demo.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    Student save(Student student);
}

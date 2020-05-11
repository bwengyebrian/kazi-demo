package com.matrix.student.demo.demo.service.impl;

import com.matrix.student.demo.demo.model.Student;
import com.matrix.student.demo.demo.respository.StudentRepository;
import com.matrix.student.demo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(new Student());
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}

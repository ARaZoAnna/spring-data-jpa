package com.example.springdatajpaexample.service;

import com.example.springdatajpaexample.domain.RoleType;
import com.example.springdatajpaexample.domain.Students;
import com.example.springdatajpaexample.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> selectAllStudent(){
        return studentRepository.findByName("이름");
    }

    public List<Students> selectStudentByName(String studentName){
        return studentRepository.findByName(studentName);
    }

    public Students insertStudent(Students students){
        RoleType.ADMIN.name(); //"ADMIN" 리턴됨 (enum 사용법 참고)
        return studentRepository.save(students);
    }
}

package com.example.springdatajpaexample.service;

import com.example.springdatajpaexample.domain.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void insertTest() {

        Students students = new Students();
        students.setAddress("제주도");
        students.setAge(20);
        students.setName("오르미5");

        studentService.insertStudent(students);
    }
}
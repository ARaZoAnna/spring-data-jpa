package com.example.springdatajpaexample.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long class_id;
    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Students2 students2;
}

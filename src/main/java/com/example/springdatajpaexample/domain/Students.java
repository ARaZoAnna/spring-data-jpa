package com.example.springdatajpaexample.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@NoArgsConstructor
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String address;
// Entity 클래스에서는 값을 입력 받을 때 Setter가 아닌 생성자를 사용한다.
    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

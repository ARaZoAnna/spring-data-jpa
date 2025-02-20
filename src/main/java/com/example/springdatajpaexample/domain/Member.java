package com.example.springdatajpaexample.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String userName;

    @Column(name = "age")
    private Integer age;

    //Enumerated 어노테이션 추가
    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
}

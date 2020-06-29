package com.lht.springboot.repository.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private Integer age;

    private Date birthDay;

    private String email;

    public User(Integer id, String name, Integer age, Date birthDay, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
        this.email = email;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}
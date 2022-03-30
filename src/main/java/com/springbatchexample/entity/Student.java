package com.springbatchexample.entity;

public class Student {

    private Long id;
    private String name;
    private String rollNumber;

    public Student() {

    }

    public Student(Long id, String name, String rollNumber) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

}
package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int age;
    private final School school;

    public Student(School school) {
        System.out.println("New Student registered!");
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public School getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public void getStudentInfo() {
        System.out.println("---> name: " + name + ", age: " + age + ", school: " + school.getName() + ", <------");
    }
}

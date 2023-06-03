package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class School {
    private String name;
    private String address;
    private int staffCount;

    public School() {
        System.out.println("School created!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }
}

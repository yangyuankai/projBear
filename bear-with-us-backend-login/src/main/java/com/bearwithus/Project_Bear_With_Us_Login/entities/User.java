package com.bearwithus.Project_Bear_With_Us_Login.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userData")
public class User {
    public User(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phone = phoneNumber;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    private String name;
    private String email;
    private int phone;


}

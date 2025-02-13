package com.example.userservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users") // Indica que es una colección en MongoDB
public class User {

    @Id
    private String id; // MongoDB usa String como ID por defecto
    private String name;
    private String email;

    // Constructor vacío
    public User() {}

    // Constructor con parámetros
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}

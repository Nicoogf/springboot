package com.crud.Crud_artifact.model;

public class Book {
    private long id;
    private String name;

    // Constructor
    public Book(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
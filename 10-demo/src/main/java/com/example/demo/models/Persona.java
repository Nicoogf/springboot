package com.example.demo.models;

import jakarta.persistence.*;

@Entity(name = "Person")
@Table(name = "Persons" , schema="public")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
    @Id
    @Column(name= "id" , length = 10)
    private String id;

    @Column(name="name", nullable = false )
    private String name;

    @Column(name="genre" , nullable = false , length = 1)
    private String genre ;

    @Column( name ="email" , nullable=false)
    private String email ;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

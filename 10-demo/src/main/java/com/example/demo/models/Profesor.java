package com.example.demo.models;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.util.List;

@Entity(name = "Profesor")
@Table( name = "Profesores")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name="id", foreignKey = @ForeignKey(name ="fk_teacher_person"))

public class Profesor extends Persona implements Serializable {

    private static final long serialVersionUID = 1L ;

    @Column(name = "degree" , nullable = false)
    private String degree ;

    @Column( name = "salary" , nullable = false)
    private Double salary ;

    @OneToMany(mappedBy = "profesor" , fetch = FetchType.LAZY , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Curso> cursos ;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

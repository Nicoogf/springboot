package com.example.demo.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Entity(name = "Curso")
@Table( name = "Cursos" , schema="public")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L ;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "key")
    private Long key ;

    @ManyToOne
    @JoinColumn(
            name= "teacher_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "fk_course_teacher",
                    foreignKeyDefinition = "FOREIGN KEY (id)\n" +
                            "        REFERENCES public.Profesores (id) MATCH SIMPLE\n" +
                            "        ON UPDATE CASCADE\n" +
                            "        ON DELETE CASCADE",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    private Profesor profesor ;

    @Column(name = "name" , nullable = false , unique = true)
    private String name ;

    @Column(name = "start_date" ,nullable = false , columnDefinition = "date DEFAULT 'now()'")
    private LocalDate start_date = ZonedDateTime.now(ZoneId.of("America/Guayaquil")).toLocalDate();

    @Column(name = "ending_date" ,nullable = false)
    private LocalDate ending_date ;

    @ManyToMany(mappedBy = "curso_inscrito", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<Estudiante> alumnos_inscriptos;

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnding_date() {
        return ending_date;
    }

    public void setEnding_date(LocalDate ending_date) {
        this.ending_date = ending_date;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getAlumnos_inscriptos() {
        return alumnos_inscriptos;
    }

    public void setAlumnos_inscriptos(List<Estudiante> alumnos_inscriptos) {
        this.alumnos_inscriptos = alumnos_inscriptos;
    }
}

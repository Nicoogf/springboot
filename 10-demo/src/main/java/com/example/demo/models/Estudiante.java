package com.example.demo.models;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.util.List;

@Entity(name="Estudiante")
@Table(name="Estudiantes" , schema= "public")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(
        name = "id",
        foreignKey = @ForeignKey(
             name = "fk_student_persona")
)

public class Estudiante extends Persona implements Serializable {

    private static final long serialVersionUID = 1L ;

    @Column(name="esBecado" , columnDefinition = "boolean DEFAULT 'false'")
    private Boolean esBecado = false ;

    @Column(name ="state" , columnDefinition= "integer DEFAULT '1'")
    private Integer state = 1;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "StudentCourse",
            joinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "id",
                    foreignKey = @ForeignKey(
                            name = "fk_student_course",
                            foreignKeyDefinition = "FOREIGN KEY (student_id) REFERENCES public.Estudiante (id) ON UPDATE CASCADE ON DELETE CASCADE",
                            value = ConstraintMode.CONSTRAINT
                    )
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "course_key",
                    referencedColumnName = "key",
                    foreignKey = @ForeignKey(
                            name = "fk_course_key",
                            foreignKeyDefinition = "FOREIGN KEY (course_key) REFERENCES public.Cursos (key) ON UPDATE CASCADE ON DELETE CASCADE",
                            value = ConstraintMode.CONSTRAINT
                    )
            ),
            uniqueConstraints = @UniqueConstraint(name = "composite_key", columnNames = {"student_id", "course_key"})
    )
    private List<Curso> curso_inscrito;

    public Boolean getEsBecado() {
        return esBecado;
    }

    public void setEsBecado(Boolean esBecado) {
        this.esBecado = esBecado;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}

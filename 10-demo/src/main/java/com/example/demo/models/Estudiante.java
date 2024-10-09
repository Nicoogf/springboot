package com.example.demo.models;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity(name="Estudiante")
@Table(name="Estudiantes" , schema= "public")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(
        name = "id",
        foreignKey = @ForeignKey(name = "fk_student_persona",
        foreignKeyDefinition = "FOREIGN KEY (id) REFERENCES persons(id) ON DELETE CASCADE")
)

public class Estudiante extends Persona{

    private static final long serialVersionUID = 1L ;

    @Column(name="esBecado" , columnDefinition = "boolean DEFAULT 'false'")
    private Boolean esBecado = false ;

    @Column(name ="state" , columnDefinition= "integer DEFAULT '1'")
    private Integer state = 1;

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

package com.api.crud.models.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "cliente")

public class Cliente implements Serializable {

    @Id
    @Column(name= "id cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id ;

    @Column(name = "nombre")
    private String nombre ;

    @Column(name = "apellido")
    private String apellido ;

    @Column( name = "correo")
    private String correo ;

    @Column(name = "fecha_registro")
    private Date fechaRegistro ;

}

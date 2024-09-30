package com.example.demo.controllers;

import com.example.demo.models.Alumno;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/users")

public class AlumnoController {

    public List<Alumno> planillaDeAlumnos = new ArrayList<>(Arrays.asList(
            new Alumno(1,"Nicolas" , "nicolas@gmail.com" ) ,
            new Alumno(2,"Carlos" , "carlos@gmail.com" ),
            new Alumno(3,"Juan" , "juan@gmail.com" )
    )) ;

    @GetMapping
    public List<Alumno> getListado () {
        return planillaDeAlumnos ;
    }

    @GetMapping("/{id}")
    public Alumno getAlumnoById (@PathVariable int id) {
        for( Alumno a : planillaDeAlumnos){
            if( a.getId() == id ) {
                return a ;
            }
        }
        return null ;
    }

    @PostMapping
    public Alumno createNewAlumno(@RequestBody Alumno alumnoCreado ){
        planillaDeAlumnos.add(alumnoCreado) ;
        return alumnoCreado ;
    }

    @PutMapping
    public Alumno changeAlumno(@RequestBody Alumno alumnoEditado) {
        for( Alumno a : planillaDeAlumnos){
            if( a.getId() == alumnoEditado.getId()) {
                a.setNombre(alumnoEditado.getNombre());
                a.setEmail(alumnoEditado.getEmail());
                return a ;
            }
        }
        return null ;
    }

    @PatchMapping
    public Alumno editAlumno(@RequestBody Alumno alumnoEditado) {
        for ( Alumno a : planillaDeAlumnos) {
            if( alumnoEditado.getEmail() != null) {
                a.setEmail(alumnoEditado.getEmail());
            }
            if( alumnoEditado.getNombre() != null) {
                a.setEmail(alumnoEditado.getNombre());
            }
            planillaDeAlumnos.add(alumnoEditado) ;
            return alumnoEditado ;
        }
        return null ;
    }

    @DeleteMapping
    public String deleteAlumno(@RequestBody Alumno alumnoEliminado) {
        for( Alumno a : planillaDeAlumnos) {
            if( a.getId() == alumnoEliminado.getId()) {
                planillaDeAlumnos.remove( a ) ;
                return "Usuario eliminado" ;
            }
        }
        return "No se encontro Alumno" ;
    }
}

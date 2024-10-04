package com.example.demo.controllers;

import com.example.demo.models.Alumno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    public ResponseEntity<List<Alumno>> getListado () {
        return ResponseEntity.ok(planillaDeAlumnos) ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAlumnoById (@PathVariable int id) {
        for( Alumno a : planillaDeAlumnos){
            if( a.getId() == id ) {
                return ResponseEntity.ok(a) ;
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro informacion del usuario con id  : " + id) ;
    }

    @PostMapping
    public ResponseEntity<?> createNewAlumno(@RequestBody Alumno alumnoCreado ){
        planillaDeAlumnos.add(alumnoCreado);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(alumnoCreado.getId())
                .toUri();

        // return ResponseEntity.created(location).build() ;

        return ResponseEntity.created(location).body(alumnoCreado) ;
    }

    @PutMapping
    public ResponseEntity<?> changeAlumno(@RequestBody Alumno alumnoEditado) {
        for( Alumno a : planillaDeAlumnos){
            if( a.getId() == alumnoEditado.getId()) {
                a.setNombre(alumnoEditado.getNombre());
                a.setEmail(alumnoEditado.getEmail());
                return ResponseEntity.noContent().build() ;
            }
        }
        return ResponseEntity.noContent().build() ;
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
    public ResponseEntity<String> deleteAlumno(@RequestBody Alumno alumnoEliminado) {
        for( Alumno a : planillaDeAlumnos) {
            if( a.getId() == alumnoEliminado.getId()) {
                planillaDeAlumnos.remove( a ) ;
                return ResponseEntity.noContent().build();


            }
        }
        return ResponseEntity.notFound().build() ;
    }
}

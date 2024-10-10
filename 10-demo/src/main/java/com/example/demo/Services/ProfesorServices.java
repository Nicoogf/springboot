package com.example.demo.Services;

import com.example.demo.Repository.IProfesorRepository;
import com.example.demo.models.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServices {

    @Autowired
    private IProfesorRepository iProfesorRepository;

    // Guarda un profesor
    public Profesor guardarProfesor(Profesor profesor) {
        return iProfesorRepository.save(profesor);
    }

    // Obtiene todos los profesores
    public List<Profesor> obtenerTodosLosProfesores() {
        return iProfesorRepository.findAll();
    }
}

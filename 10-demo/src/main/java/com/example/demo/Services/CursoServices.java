package com.example.demo.Services;

import com.example.demo.Repository.ICursoRepository;
import com.example.demo.models.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class CursoServices {

    @Autowired
    private ICursoRepository iCourseRepository ;

    public Curso SaveCourse(Curso curso) {
        return ICursoRepository.save(curso);
    }
}

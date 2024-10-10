package com.example.demo.Services;


import com.example.demo.Repository.IStudentRepository;
import com.example.demo.models.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository iStudentRepository ;

    public Estudiante saveStudent ( Estudiante estudiante ){
        return iStudentRepository.save(estudiante) ;
    }

    public List<Estudiante> getAllStudent(){
        return iStudentRepository.findAll() ;
    }


}

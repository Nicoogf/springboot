package com.cursojava.cruso.controllers;
import com.cursojava.cruso.models.Usuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UsuarioController {

    @CrossOrigin(origins = "http://localhost:5173")


    @RequestMapping(value = "/user")
    public List<Usuario> getUsuario(){
        List<Usuario> Listado = new ArrayList<>(Arrays.asList(
                new Usuario(465L, "Nicolas" , "Gonzales" , "nicolas@gmail.com" , "232455874" , "123456"),
                new Usuario(466L, "Juan" , "Rodriguez" , "juan@gmail.com" , "232455875" , "123456"),
                new Usuario(467L, "Pedro" , "Martinez" , "pedro@gmail.com" , "232455876" , "123456")
        )) ;
        return Listado ;

    }
}

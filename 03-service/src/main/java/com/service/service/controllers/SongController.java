package com.service.service.controllers;
import com.service.service.models.Song;
import com.service.service.services.SongService;
import com.service.service.services.SongServicesImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/song")
public class SongController {
    SongService serviciosCancion = new SongServicesImpl() ;


    @GetMapping
    public ResponseEntity<?> getSongs(){
        List<Song> playlist =  serviciosCancion.getSongs() ;
        return ResponseEntity.ok(playlist) ;
    }

}

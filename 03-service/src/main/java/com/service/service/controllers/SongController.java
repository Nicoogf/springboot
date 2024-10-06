package com.service.service.controllers;
import com.service.service.models.Song;
import com.service.service.services.SongService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/song")
public class SongController {

    SongService serviciosCancion = new SongService() {
        @Override
        public List<Song> getSongs() {
            return List.of();
        }
    } ;


    @GetMapping
    public ResponseEntity<?> getSongs(){
        List<Song> playlist =  serviciosCancion.getSongs() ;
        return ResponseEntity.ok(playlist) ;
    }

}

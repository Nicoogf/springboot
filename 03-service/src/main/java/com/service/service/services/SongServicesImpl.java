package com.service.service.services;
import com.service.service.models.Song;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SongServicesImpl implements SongService{

    private List<Song> playlist = new ArrayList<>(Arrays.asList(
            new Song ("Los redondos" , 1 , "Preso en mi ciudad"),
            new Song ( "La Mono Trio" , 2 , "No te duermas")
    )) ;

    @Override
    public List<Song> getSongs() {
        return playlist ;
    }
}

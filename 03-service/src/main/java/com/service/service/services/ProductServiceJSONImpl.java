package com.service.service.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.service.models.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Primary
@Service
public class ProductServiceJSONImpl implements  SongService{

    @Override
    public List<Song> getSongs() {
        List<Song> playlist ;
        try{
            playlist = new ObjectMapper()
                    .readValue(this.getClass().getResourceAsStream("/product.json"),
                            new TypeReference<List<Song>>() {}) ;
            return playlist ;
        }
        catch ( IOException e){
            throw new RuntimeException(e);
        }

    }


}

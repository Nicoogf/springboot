package com.service.service.models;

public class Song {

    private String name ;
    private String artist ;
    private Integer id ;


    public Song(){

    }

    public Song(String artist, Integer id, String name) {
        this.artist = artist;
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }





}

package com.window.chosung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.window.chosung.entity.Song;
import com.window.chosung.repository.SongRepository;


@RestController
@RequestMapping("/song-api")
public class SongController {

    @Autowired
    SongRepository sr;
    
    @GetMapping("/song")
    public Song getSong(){

        return null;
    }

    @GetMapping("/song-chosung")
    public Song getSongByChosung(){

        return null;
    }

    @PostMapping("/song")
    public String postSong(@RequestBody Song song) {
        System.out.println(song.toString());
        song.setChosung(song.getTitle());
        sr.save(song);
        return "save";
    }
    
}

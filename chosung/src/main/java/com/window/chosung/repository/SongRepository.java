package com.window.chosung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.window.chosung.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song,Integer>{
    
}

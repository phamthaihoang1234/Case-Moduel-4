package com.codegym.music.service;


import com.codegym.music.model.Album;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AlbumService extends IService<Album> {

    Page<Album> findAllByNameContains(String name, Pageable pageable);

    Page<Album> findAll(Pageable pageable);

}

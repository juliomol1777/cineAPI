package com.codeM.aplicacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeM.aplicacion.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}

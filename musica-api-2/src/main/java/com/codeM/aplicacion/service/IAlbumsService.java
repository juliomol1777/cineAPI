package com.codeM.aplicacion.service;

import java.util.List;

import com.codeM.aplicacion.entity.Album;

public interface IAlbumsService {
	
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);

}

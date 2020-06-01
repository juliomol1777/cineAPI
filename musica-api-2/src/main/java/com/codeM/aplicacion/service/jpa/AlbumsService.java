package com.codeM.aplicacion.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeM.aplicacion.entity.Album;
import com.codeM.aplicacion.repository.AlbumsRepository;
import com.codeM.aplicacion.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {
	
	@Autowired
	AlbumsRepository albumsRepo;

	@Override
	public List<Album> buscarTodos() {
		
		return albumsRepo.findAll();
	}

	@Override
	public void guardar(Album album) {
		albumsRepo.save(album);
		
	}

	@Override
	public void eliminar(int idAlbum) {
		albumsRepo.deleteById(idAlbum);
		
	}
	
	

}

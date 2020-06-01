package com.codeM.aplicacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeM.aplicacion.entity.Album;
import com.codeM.aplicacion.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController {

	@Autowired
	private IAlbumsService serviceAlbumns;
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		return serviceAlbumns.buscarTodos();
	}
	
	//por convencion se usa post en rest, uso requestbody en rest
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		serviceAlbumns.guardar(album);
		return album;
	}
	
	@PutMapping("/albums")
	public Album modificar(@RequestBody Album album) {
		serviceAlbumns.guardar(album);
		return album;
	}
	
	@DeleteMapping("/albums/{id}")
	public String eliminar(@PathVariable("id") int idAlbum) {
		serviceAlbumns.eliminar(idAlbum);
		return "Registro Eliminado";
		
	}
}

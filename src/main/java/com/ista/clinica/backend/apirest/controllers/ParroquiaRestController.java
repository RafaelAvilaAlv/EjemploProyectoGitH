package com.ista.clinica.backend.apirest.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.ista.clinica.backend.apirest.models.entity.Parroquia;
import com.ista.clinica.backend.apirest.models.services.IParroquiaService;

@RestController
@RequestMapping("/api")
public class ParroquiaRestController {
	
	@Autowired
	private IParroquiaService parroquiaService;

	// listar todos los cantones
	@GetMapping("/parroquia")
	public List<Parroquia> index() {
		return parroquiaService.findAll();
	}

	// buscar canton por id
	@GetMapping("/parroquia/{id}")
	public Parroquia show(@PathVariable Long id) {
		return parroquiaService.findById(id);
	}

	// guardar un canton
	@PostMapping("/parroquia")
	@ResponseStatus(HttpStatus.CREATED)
	public Parroquia create(@RequestBody Parroquia parroquia) {
		return parroquiaService.save(parroquia);
	}

	// editar una provincia
	@PutMapping("/parroquia/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Parroquia update(@RequestBody Parroquia parroquia, @PathVariable Long id) {
		Parroquia parroquiaActual = parroquiaService.findById(id);
		parroquiaActual.setNombreParroquia(parroquia.getNombreParroquia());

		return parroquiaService.save(parroquiaActual);
	}

	// eliminar canton
	@DeleteMapping("/parroquia/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		parroquiaService.delete(id);
	}
		
}

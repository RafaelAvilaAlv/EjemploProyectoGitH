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

import com.ista.clinica.backend.apirest.models.entity.Canton;
import com.ista.clinica.backend.apirest.models.services.ICantonService;

@RestController
@RequestMapping("/api")
public class CantonRestController {

	@Autowired
	private ICantonService cantonService;

	// listar todos los cantones
	@GetMapping("/canton")
	public List<Canton> index() {
		return cantonService.findAll();
	}

	// buscar canton por id
	@GetMapping("/canton/{id}")
	public Canton show(@PathVariable Long id) {
		return cantonService.findById(id);
	}

	// guardar un canton
	@PostMapping("/canton")
	@ResponseStatus(HttpStatus.CREATED)
	public Canton create(@RequestBody Canton canton) {
		return cantonService.save(canton);
	}

	// editar una provincia
	@PutMapping("/canton/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Canton update(@RequestBody Canton canton, @PathVariable Long id) {
		Canton cantonActual = cantonService.findById(id);
		cantonActual.setNombreCanton(canton.getNombreCanton());

		return cantonService.save(cantonActual);
	}
	
	
	//eliminar canton
		@DeleteMapping("/canton/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			cantonService.delete(id);
		}
		
	
}

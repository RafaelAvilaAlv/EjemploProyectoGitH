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


import com.ista.clinica.backend.apirest.models.entity.Provincia;
import com.ista.clinica.backend.apirest.models.services.IProvinciaService;


@RestController
@RequestMapping("/api")
public class ProvinciaRestController {
	
	@Autowired 
	private IProvinciaService provinciaService;
	
	//listar todos las provincias
	@GetMapping("/provincia")
	public List<Provincia> index(){
		
		return provinciaService.findAll();
	}

	//buscar un cliente por id
	@GetMapping("/provincia/{id}")
	public Provincia show(@PathVariable Long id) {
		return provinciaService.findById(id);
	}
	
	//guardar una provincia
	@PostMapping("/provincia")
	@ResponseStatus(HttpStatus.CREATED)
	public Provincia create(@RequestBody Provincia provincia) {
		return provinciaService.save(provincia);
	}
	
	
	//editar una  provincia
	@PutMapping("/provincia/{id}") 
	@ResponseStatus(HttpStatus.CREATED)
	public Provincia update(@RequestBody Provincia provincia, @PathVariable Long id) {
		Provincia provinciaActual = provinciaService.findById(id);
		provinciaActual.setNombre(provincia.getNombre());
		
		return provinciaService.save(provinciaActual);
	}
	
	//eliminar cliente
	@DeleteMapping("/provincia/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		provinciaService.delete(id);
	}
	
}

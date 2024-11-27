package com.ista.clinica.backend.apirest.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.clinica.backend.apirest.models.entity.Area;
import com.ista.clinica.backend.apirest.models.services.IAreaService;
 


@RestController
@RequestMapping("/api")
public class AreaRestController {
	
	@Autowired
	private IAreaService areaService;
	
	// listar todos los cantones
		@GetMapping("/area")
		public List<Area> index() {
			return areaService.findAll();
		}

		// buscar canton por id
		@GetMapping("/area/{id}")
		public Area show(@PathVariable Long id) {
			return areaService.findfById(id);
		}
		
		// guardar un canton
		@PostMapping("/area")
		@ResponseStatus(HttpStatus.CREATED)
		public Area create(@RequestBody Area area) {
			return areaService.save(area);
		}
		
		//eliminar cliente
		@DeleteMapping("/area/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			areaService.delete(id);
		}
		
}

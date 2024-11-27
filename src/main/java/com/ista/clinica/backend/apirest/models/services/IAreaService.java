package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import com.ista.clinica.backend.apirest.models.entity.Area;

public interface IAreaService {

	public List<Area> findAll();
	
	public Area save (Area area);
	
	public Area findfById(Long id);
	
	public void delete (Long id);
	
}

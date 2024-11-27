package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import com.ista.clinica.backend.apirest.models.entity.Canton;
 

public interface ICantonService {
	
	public List<Canton> findAll();
	
	public Canton save(Canton canton);
	
	public Canton findById(Long id);
	
	public void delete (Long id);

}

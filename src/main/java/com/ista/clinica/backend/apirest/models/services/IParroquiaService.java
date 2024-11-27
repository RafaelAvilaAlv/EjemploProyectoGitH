package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import com.ista.clinica.backend.apirest.models.entity.Parroquia;

public interface IParroquiaService {
	
	
	public List<Parroquia> findAll();
	
	public Parroquia save (Parroquia parroquia);
	
	public Parroquia findById(Long id);
	
	public void delete(Long id);
	

}

package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import com.ista.clinica.backend.apirest.models.entity.Provincia;

public interface IProvinciaService {
	
	public List<Provincia> findAll();
	
	public Provincia save(Provincia provincia);
	
	public Provincia findById(Long provincia);
	
	public void delete (Long id);
	
	
	

}

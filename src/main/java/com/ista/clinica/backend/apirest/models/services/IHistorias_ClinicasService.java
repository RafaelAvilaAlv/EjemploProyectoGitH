package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import com.ista.clinica.backend.apirest.models.entity.Historias_Clinicas;

public interface IHistorias_ClinicasService {
	
	public List<Historias_Clinicas> findAll();
	
	public Historias_Clinicas save (Historias_Clinicas historias_Clinicas);
	
	public Historias_Clinicas findById (Long id);
	
	public void delete(Long id);

}

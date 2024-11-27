package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import com.ista.clinica.backend.apirest.models.entity.Registro_Parte_Diario;

public interface IRegistro_Parte_DiarioService {
	
	List<Registro_Parte_Diario> findAll();
	
	Registro_Parte_Diario save(Registro_Parte_Diario registro_Parte_Diario);
	
	Registro_Parte_Diario findById(Long id);
	
	void delete(Long id);

	// Métodos adicionales para manejar las relaciones
	List<Registro_Parte_Diario> findByCedulaNroHistoriaClinica(Long cedulaNroHistoriaClinica);

	List<Registro_Parte_Diario> findByUnidadOperativaCodigo(Long unidadOperativaCodigo);
}
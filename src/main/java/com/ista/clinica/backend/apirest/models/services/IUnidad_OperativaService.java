package com.ista.clinica.backend.apirest.models.services;
import java.util.List;

import com.ista.clinica.backend.apirest.models.entity.Unidad_Operativa;

public interface IUnidad_OperativaService {
	
	public List<Unidad_Operativa> findAll();
	
	public Unidad_Operativa save (Unidad_Operativa unidad_Operativa);
	
	public Unidad_Operativa findById(Long Id);
	
	public void delete(Long Id);

	 

}

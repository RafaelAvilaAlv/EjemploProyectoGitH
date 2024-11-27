package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.clinica.backend.apirest.models.dao.IRegistro_Parte_DiarioDao;

import com.ista.clinica.backend.apirest.models.entity.Registro_Parte_Diario;


@Service
public class Registro_Parte_DiarioServiceImpl implements IRegistro_Parte_DiarioService {
	
	@Autowired
	private IRegistro_Parte_DiarioDao registroParteDiarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Registro_Parte_Diario> findAll() {
		return (List<Registro_Parte_Diario>) registroParteDiarioDao.findAll();
	}

	@Override
	@Transactional
	public Registro_Parte_Diario save(Registro_Parte_Diario registro_Parte_Diario) {
		return registroParteDiarioDao.save(registro_Parte_Diario);
	}

	@Override
	@Transactional(readOnly = true)
	public Registro_Parte_Diario findById(Long id) {
		return registroParteDiarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		registroParteDiarioDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Registro_Parte_Diario> findByCedulaNroHistoriaClinica(Long cedulaNroHistoriaClinica) {
		// Implementa la lógica para buscar por cédula de historia clínica
		// ...
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Registro_Parte_Diario> findByUnidadOperativaCodigo(Long unidadOperativaCodigo) {
		// Implementa la lógica para buscar por código de unidad operativa
		// ...
		return null;
	}
}

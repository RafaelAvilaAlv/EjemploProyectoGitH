package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.clinica.backend.apirest.models.dao.IProvinciaDao;
import com.ista.clinica.backend.apirest.models.entity.Provincia;

@Service
public class ProvinciaServiceImpl implements IProvinciaService {
	
	@Autowired
	private IProvinciaDao provinciaDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Provincia> findAll() {
		
		return (List<Provincia>) provinciaDao.findAll();
	}

	
	@Override
	@Transactional (readOnly = true)
	public Provincia findById(Long id) {
		
		return provinciaDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Provincia save(Provincia provincia) {
		
		return provinciaDao.save(provincia);
	}
	
	
	@Override
	@Transactional
	public void delete(Long id) {
	   provinciaDao.deleteById(id);
	}
	
	
	
	
	
}

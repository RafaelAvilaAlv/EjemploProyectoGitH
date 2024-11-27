package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.clinica.backend.apirest.models.dao.IParroquiaDao;
import com.ista.clinica.backend.apirest.models.entity.Parroquia;

@Service
public class ParroquiaServiceImpl implements IParroquiaService {

	@Autowired
	private IParroquiaDao parroquiaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Parroquia> findAll() {
		// TODO Auto-generated method stub
		return (List<Parroquia>) parroquiaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Parroquia findById(Long id) {

		return parroquiaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Parroquia save(Parroquia parroquia) {
		
		return parroquiaDao.save(parroquia);
	}
	

	@Override
	@Transactional
	public void delete(Long id) {
	   parroquiaDao.deleteById(id);
	}
	
	

}

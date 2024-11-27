package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.clinica.backend.apirest.models.dao.ICantonDao;
import com.ista.clinica.backend.apirest.models.entity.Canton;

@Service
public class CantonServiceImpl implements ICantonService{

	@Autowired 
	private ICantonDao cantonDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Canton> findAll(){
		
		return (List<Canton>) cantonDao.findAll();
	}
	
	@Override
	@Transactional (readOnly = true)
	public Canton findById(Long id) {
		
		return cantonDao.findById(id).orElse(null);
	}
	
	
    @Override
    @Transactional
    public Canton save (Canton canton) {
    	
    	return cantonDao.save(canton);
    }
    
    @Override
    @Transactional
    public void delete(Long id) {
    	cantonDao.deleteById(id); 
    }
}

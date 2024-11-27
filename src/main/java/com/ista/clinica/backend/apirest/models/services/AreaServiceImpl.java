package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.clinica.backend.apirest.models.dao.IAreaDao;
import com.ista.clinica.backend.apirest.models.entity.Area;
 

@Service
public class AreaServiceImpl implements IAreaService {

	@Autowired
	private IAreaDao areaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Area> findAll() {
		// TODO Auto-generated method stub
		return (List<Area>) areaDao.findAll();
	}

	@Override
	@Transactional
	public Area save(Area area) {
		// TODO Auto-generated method stub
		return areaDao.save(area);
	}

	@Override
	@Transactional(readOnly = true)
	public Area findfById(Long id) {
		// TODO Auto-generated method stub
		return areaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		 areaDao.deleteById(id);
		
	}

}

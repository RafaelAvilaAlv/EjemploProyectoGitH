 
package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.clinica.backend.apirest.models.dao.IUnidad_OperativaDao;
import com.ista.clinica.backend.apirest.models.entity.Unidad_Operativa;

@Service
public class Unidad_OperativaServiceImpl implements IUnidad_OperativaService {

    @Autowired
    private IUnidad_OperativaDao unidadOperativaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Unidad_Operativa> findAll() {
        return (List<Unidad_Operativa>) unidadOperativaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Unidad_Operativa findById(Long id) {
        return unidadOperativaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Unidad_Operativa save(Unidad_Operativa unidadOperativa) {
        return unidadOperativaDao.save(unidadOperativa);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        unidadOperativaDao.deleteById(id);
    }
}


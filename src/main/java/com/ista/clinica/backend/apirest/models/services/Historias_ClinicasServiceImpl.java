package com.ista.clinica.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.clinica.backend.apirest.models.dao.IHistorias_ClinicasDao;
import com.ista.clinica.backend.apirest.models.entity.Historias_Clinicas;

@Service
public class Historias_ClinicasServiceImpl implements IHistorias_ClinicasService {

    @Autowired
    private IHistorias_ClinicasDao historiasClinicasDao;

    @Override
    @Transactional(readOnly = true)
    public List<Historias_Clinicas> findAll() {
        return (List<Historias_Clinicas>) historiasClinicasDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Historias_Clinicas findById(Long cedulaNroHistoriaClinica) {
        return historiasClinicasDao.findById(cedulaNroHistoriaClinica).orElse(null);
    }

    @Override
    @Transactional
    public Historias_Clinicas save(Historias_Clinicas historiasClinicas) {
        return historiasClinicasDao.save(historiasClinicas);
    }

    @Override
    @Transactional
    public void delete(Long cedulaNroHistoriaClinica) {
        historiasClinicasDao.deleteById(cedulaNroHistoriaClinica);
    }

}
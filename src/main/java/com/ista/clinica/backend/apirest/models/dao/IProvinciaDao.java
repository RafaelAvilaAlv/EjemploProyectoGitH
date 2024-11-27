package com.ista.clinica.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.clinica.backend.apirest.models.entity.Provincia;

public interface IProvinciaDao extends CrudRepository<Provincia, Long> {

}

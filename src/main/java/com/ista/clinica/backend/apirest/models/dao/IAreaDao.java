package com.ista.clinica.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.clinica.backend.apirest.models.entity.Area;

public interface IAreaDao extends CrudRepository<Area , Long> {

}

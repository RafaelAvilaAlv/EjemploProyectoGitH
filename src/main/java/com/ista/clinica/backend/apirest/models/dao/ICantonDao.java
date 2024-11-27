package com.ista.clinica.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.clinica.backend.apirest.models.entity.Canton;

public interface ICantonDao extends CrudRepository<Canton, Long> {

}

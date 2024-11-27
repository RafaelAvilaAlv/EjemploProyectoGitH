package com.ista.clinica.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ista.clinica.backend.apirest.models.entity.Unidad_Operativa;
import com.ista.clinica.backend.apirest.models.services.IUnidad_OperativaService;

@RestController
@RequestMapping("/api")
public class Unidad_OperativaRestController {

    @Autowired
    private IUnidad_OperativaService unidadOperativaService;

    // Listar todas las unidades operativas
    @GetMapping("/unidad_operativa")
    public List<Unidad_Operativa> index() {
        return unidadOperativaService.findAll();
    }

    // Buscar unidad operativa por id
    @GetMapping("/unidad_operativa/{id}")
    public Unidad_Operativa show(@PathVariable Long id) {
        return unidadOperativaService.findById(id);
    }

    // Guardar una unidad operativa
    @PostMapping("/unidad_operativa")
    @ResponseStatus(HttpStatus.CREATED)
    public Unidad_Operativa create(@RequestBody Unidad_Operativa unidadOperativa) {
        return unidadOperativaService.save(unidadOperativa);
    }

    // Eliminar unidad operativa
    @DeleteMapping("/unidad_operativa/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        unidadOperativaService.delete(id);
    }
}
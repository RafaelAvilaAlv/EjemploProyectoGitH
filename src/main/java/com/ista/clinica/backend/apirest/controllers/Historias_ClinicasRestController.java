package com.ista.clinica.backend.apirest.controllers;

import com.ista.clinica.backend.apirest.models.entity.Historias_Clinicas;
import com.ista.clinica.backend.apirest.models.services.IHistorias_ClinicasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Historias_ClinicasRestController {

    @Autowired
    private IHistorias_ClinicasService historiasClinicasService;

    // Listar todas las historias clínicas
    @GetMapping("/historias-clinicas")
    public List<Historias_Clinicas> index() {
        return historiasClinicasService.findAll();
    }

    // Buscar historia clínica por cédula/nroHistoriaClinica
    @GetMapping("/historias-clinicas/{cedulaNroHistoriaClinica}")
    public Historias_Clinicas show(@PathVariable Long cedulaNroHistoriaClinica) {
        return historiasClinicasService.findById(cedulaNroHistoriaClinica);
    }

    // Crear una nueva historia clínica
    @PostMapping("/historias-clinicas")
    @ResponseStatus(HttpStatus.CREATED)
    public Historias_Clinicas create(@RequestBody Historias_Clinicas historiasClinicas) {
        return historiasClinicasService.save(historiasClinicas);
    }

    // Actualizar historia clínica
    @PutMapping("/historias-clinicas/{cedulaNroHistoriaClinica}")
    public Historias_Clinicas update(@PathVariable Long cedulaNroHistoriaClinica, @RequestBody Historias_Clinicas historiasClinicas) {
        // Aquí deberías implementar la lógica para realizar la actualización, utilizando el servicio correspondiente
        // ...

        return historiasClinicas; // Devuelve la historia clínica actualizada
    }

    // Eliminar historia clínica
    @DeleteMapping("/historias-clinicas/{cedulaNroHistoriaClinica}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long cedulaNroHistoriaClinica) {
        historiasClinicasService.delete(cedulaNroHistoriaClinica);
    }
}
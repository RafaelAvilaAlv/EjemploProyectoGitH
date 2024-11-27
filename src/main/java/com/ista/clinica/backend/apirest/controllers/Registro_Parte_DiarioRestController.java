package com.ista.clinica.backend.apirest.controllers;

import com.ista.clinica.backend.apirest.models.entity.Historias_Clinicas;
import com.ista.clinica.backend.apirest.models.entity.Registro_Parte_Diario;
import com.ista.clinica.backend.apirest.models.entity.Unidad_Operativa;
import com.ista.clinica.backend.apirest.models.services.IRegistro_Parte_DiarioService;
import com.ista.clinica.backend.apirest.models.services.IUnidad_OperativaService;
import com.ista.clinica.backend.apirest.models.services.IHistorias_ClinicasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Registro_Parte_DiarioRestController {

    @Autowired
    private IRegistro_Parte_DiarioService parteDiarioService;

    @Autowired
    private IUnidad_OperativaService unidadOperativaService;

    @Autowired
    private IHistorias_ClinicasService historiaClinicaService;

    // Listar todos los registros de parte diario
    @GetMapping("/parte-diario")
    public List<Registro_Parte_Diario> index() {
        return parteDiarioService.findAll();
    }

    // Buscar registro de parte diario por id
    @GetMapping("/parte-diario/{id}")
    public Registro_Parte_Diario show(@PathVariable Long id) {
        return parteDiarioService.findById(id);
    }

    // Crear un nuevo registro de parte diario
    @PostMapping("/parte-diario")
    @ResponseStatus(HttpStatus.CREATED)
    public Registro_Parte_Diario create(@RequestBody Registro_Parte_Diario parteDiario) {
        // Verificar si la Unidad Operativa existe
        Long codigoUnidadOperativa = parteDiario.getUnidadOperativa().getCodigo();
        Unidad_Operativa unidadOperativa = unidadOperativaService.findById(codigoUnidadOperativa);

        if (unidadOperativa == null) {
            // Manejar el caso cuando la Unidad Operativa no existe
            // Puedes lanzar una excepción, retornar un mensaje de error, etc.
        }

        // Verificar si la Historia Clínica existe
        Long cedulaNroHistoriaClinica = parteDiario.getHistoriasClinicas().getCedulaNroHistoriaClinica();
        Historias_Clinicas historiaClinica = historiaClinicaService.findById(cedulaNroHistoriaClinica);

        if (historiaClinica == null) {
            // Manejar el caso cuando la Historia Clínica no existe
            // Puedes lanzar una excepción, retornar un mensaje de error, etc.
        }

        // Asignar las relaciones
        parteDiario.setUnidadOperativa(unidadOperativa);
        parteDiario.setHistoriasClinicas(historiaClinica);

        // Guardar el registro de parte diario
        return parteDiarioService.save(parteDiario);
    }

    // Eliminar registro de parte diario por id
    @DeleteMapping("/parte-diario/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        parteDiarioService.delete(id);
    }
}

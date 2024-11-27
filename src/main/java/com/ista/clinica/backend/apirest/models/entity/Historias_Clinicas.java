package com.ista.clinica.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Historias_Clinicas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cedulaNroHistoriaClinica;

    private String nombrePaciente;

    @Temporal(TemporalType.DATE)
    private Date fechaNacimientoPaciente;

    // Constructor, getters y setters

    public Historias_Clinicas() {
        // Constructor por defecto
    }

    public Historias_Clinicas(String nombrePaciente, Date fechaNacimientoPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }

    public Long getCedulaNroHistoriaClinica() {
        return cedulaNroHistoriaClinica;
    }

    public void setCedulaNroHistoriaClinica(Long cedulaNroHistoriaClinica) {
        this.cedulaNroHistoriaClinica = cedulaNroHistoriaClinica;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Date getFechaNacimientoPaciente() {
        return fechaNacimientoPaciente;
    }

    public void setFechaNacimientoPaciente(Date fechaNacimientoPaciente) {
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }

    @Override
    public String toString() {
        return "HistoriasClinicas{" +
                "cedulaNroHistoriaClinica=" + cedulaNroHistoriaClinica +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", fechaNacimientoPaciente=" + fechaNacimientoPaciente +
                '}';
    }
}

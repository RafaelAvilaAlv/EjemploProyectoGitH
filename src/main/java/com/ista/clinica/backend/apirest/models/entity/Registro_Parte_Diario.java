package com.ista.clinica.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Registro_Parte_Diario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParteDiario;

    @ManyToOne
    @JoinColumn(name = "cedula_nro_historia_clinica")
    private Historias_Clinicas historiasClinicas;

    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "codigo")
    private Unidad_Operativa unidadOperativa;

    private String numeroVista;
    private Double pesoPaciente;
    private Double tallaPaciente;
 

    public Long getIdParteDiario() {
        return idParteDiario;
    }

    public void setIdParteDiario(Long idParteDiario) {
        this.idParteDiario = idParteDiario;
    }

    public Historias_Clinicas getHistoriasClinicas() {
        return historiasClinicas;
    }

    public void setHistoriasClinicas(Historias_Clinicas historiasClinicas) {
        this.historiasClinicas = historiasClinicas;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Unidad_Operativa getUnidadOperativa() {
        return unidadOperativa;
    }

    public void setUnidadOperativa(Unidad_Operativa unidadOperativa) {
        this.unidadOperativa = unidadOperativa;
    }

    public String getNumeroVista() {
        return numeroVista;
    }

    public void setNumeroVista(String numeroVista) {
        this.numeroVista = numeroVista;
    }

    public Double getPesoPaciente() {
        return pesoPaciente;
    }

    public void setPesoPaciente(Double pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }

    public Double getTallaPaciente() {
        return tallaPaciente;
    }

    public void setTallaPaciente(Double tallaPaciente) {
        this.tallaPaciente = tallaPaciente;
    }

    @Override
    public String toString() {
        return "ParteDiario{" +
                "idParteDiario=" + idParteDiario +
                ", historiasClinicas=" + historiasClinicas +
                ", fechaRegistro=" + fechaRegistro +
                ", unidadOperativa=" + unidadOperativa +
                ", numeroVista='" + numeroVista + '\'' +
                ", pesoPaciente=" + pesoPaciente +
                ", tallaPaciente=" + tallaPaciente +
                '}';
    }
}

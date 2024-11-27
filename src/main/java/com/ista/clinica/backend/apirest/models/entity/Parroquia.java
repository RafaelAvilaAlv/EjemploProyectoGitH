package com.ista.clinica.backend.apirest.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "parroquia")
public class Parroquia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParroquia;

    @ManyToOne
    @JoinColumn(name = "id_canton")
    private Canton canton;

    private String nombreParroquia;

    // Constructores, getters y setters

    // Constructor vacío
    public Parroquia() {
    }

    // Constructor con parámetros
    public Parroquia(Canton canton, String nombreParroquia) {
        this.canton = canton;
        this.nombreParroquia = nombreParroquia;
    }

    // Getters y setters
    public Long getIdParroquia() {
        return idParroquia;
    }

    public void setIdParroquia(Long idParroquia) {
        this.idParroquia = idParroquia;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public String getNombreParroquia() {
        return nombreParroquia;
    }

    public void setNombreParroquia(String nombreParroquia) {
        this.nombreParroquia = nombreParroquia;
    }
}
 
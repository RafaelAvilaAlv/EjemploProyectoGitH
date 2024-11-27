package com.ista.clinica.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Unidad_Operativa implements Serializable {

  
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "id_area")
    private Area area;

    private String nombreUnidadOperativa;

    // Constructor vacío
    public Unidad_Operativa() {
    }

    // Constructor con parámetros
    public Unidad_Operativa(Area area, String nombreUnidadOperativa) {
        this.area = area;
        this.nombreUnidadOperativa = nombreUnidadOperativa;
    }

    // Getters y Setters

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getNombreUnidadOperativa() {
        return nombreUnidadOperativa;
    }

    public void setNombreUnidadOperativa(String nombreUnidadOperativa) {
        this.nombreUnidadOperativa = nombreUnidadOperativa;
    }

    // Método toString para facilitar la depuración y la visualización

    @Override
    public String toString() {
        return "UnidadOperativa{" +
                "codigo=" + codigo +
                ", area=" + area +
                ", nombreUnidadOperativa='" + nombreUnidadOperativa + '\'' +
                '}';
    }
}
 
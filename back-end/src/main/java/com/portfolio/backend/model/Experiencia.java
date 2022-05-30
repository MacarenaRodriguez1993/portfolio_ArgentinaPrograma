
package com.portfolio.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;





/**
 *
 * @author macab
 */

@Entity
public class Experiencia{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long experiencia_id;
        
    @NotNull
    private String experiencia_nombre;
        
        
    private String experiencia_fecha;
        
    @Column(nullable=false,length=300)
    private String experiencia_descripcion;

    public Experiencia() {
    }

    public Experiencia(Long experiencia_id, String experiencia_nombre, String experiencia_fecha, String experiencia_descripcion) {
        this.experiencia_id = experiencia_id;
        this.experiencia_nombre = experiencia_nombre;
        this.experiencia_fecha = experiencia_fecha;
        this.experiencia_descripcion = experiencia_descripcion;
    }

    public Long getExperiencia_id() {
        return experiencia_id;
    }

    public void setExperiencia_id(Long experiencia_id) {
        this.experiencia_id = experiencia_id;
    }

    public String getExperiencia_nombre() {
        return experiencia_nombre;
    }

    public void setExperiencia_nombre(String experiencia_nombre) {
        this.experiencia_nombre = experiencia_nombre;
    }

    public String getExperiencia_fecha() {
        return experiencia_fecha;
    }

    public void setExperiencia_fecha(String experiencia_fecha) {
        this.experiencia_fecha = experiencia_fecha;
    }

    public String getExperiencia_descripcion() {
        return experiencia_descripcion;
    }

    public void setExperiencia_descripcion(String experiencia_descripcion) {
        this.experiencia_descripcion = experiencia_descripcion;
    }
}

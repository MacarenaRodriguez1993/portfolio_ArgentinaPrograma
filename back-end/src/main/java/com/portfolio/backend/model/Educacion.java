
package com.portfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Macarena Rodriguez
 */
@Entity
public class Educacion {
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        private String establecimiento;
        private String nombre;
        private int año;
        private String descripcion;

    public Educacion() {
    }

    public Educacion(Long id, String establecimiento, String nombre, int año, String descripcion) {
        this.id = id;
        this.establecimiento = establecimiento;
        this.nombre = nombre;
        this.año = año;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
        
        
}


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
public class Experiencias {
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        private String nombre;
        private String años;
        private String descripcion;

    public Experiencias() {
    }

    public Experiencias(Long id, String nombre, String años, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.años = años;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
        
}

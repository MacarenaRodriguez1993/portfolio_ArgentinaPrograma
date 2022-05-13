
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
public class Proyectos {
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        private String nombre;
        private String fecha;
        private String url;
        private String descripcion;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String fecha, String url, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.url = url;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
        
}

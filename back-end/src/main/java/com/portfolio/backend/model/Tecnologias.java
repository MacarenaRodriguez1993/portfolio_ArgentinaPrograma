
package com.portfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GeneratorType;

/**
 *
 * @author Macarena Rodriguez
 */
@Entity
public class Tecnologias {
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        private String nombre;
        private int nivel;

    public Tecnologias() {
    }

    public Tecnologias(Long id, String nombre, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
        
        
    
}

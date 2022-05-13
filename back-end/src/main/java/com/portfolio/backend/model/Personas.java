
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
public class Personas {
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        private String nombre;
        private String apellido;
        private String mail;

    public Personas() {
    }

    public Personas(Long id, String nombre, String apellido, String mail) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
        
        
        
}

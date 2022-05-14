
package com.portfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author macab
 */
@Entity
public class Tecnologia {
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        
        @NotNull
        private String nombre;
        @NotNull
        private int nivel;
        
        @ManyToOne(fetch=FetchType.LAZY, optional = false)
        @JoinColumn(name="persona_id" , nullable=false)
        @OnDelete(action = OnDeleteAction.CASCADE)
        private Persona persona;

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre, int nivel, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.persona = persona;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
        
        
}


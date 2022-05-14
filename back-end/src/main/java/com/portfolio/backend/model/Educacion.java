
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
public class Educacion {
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        
        @NotNull
        private String establecimiento;
        @NotNull
        private String nombre;
        private int año;
        
        @NotNull
        private String descripcion;
        
        
        @ManyToOne(fetch=FetchType.LAZY, optional = false)
        @JoinColumn(name="persona_id", nullable=false)
        @OnDelete(action = OnDeleteAction.CASCADE)
        private Persona persona;

    public Educacion() {
    }

    public Educacion(Long id, String establecimiento, String nombre, int año, String descripcion, Persona persona) {
        this.id = id;
        this.establecimiento = establecimiento;
        this.nombre = nombre;
        this.año = año;
        this.descripcion = descripcion;
        this.persona = persona;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
        
        
        
}
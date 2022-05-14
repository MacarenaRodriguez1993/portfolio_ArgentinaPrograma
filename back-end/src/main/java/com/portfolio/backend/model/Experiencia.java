
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
public class Experiencia{
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        
        @NotNull
        private String nombre;
        
        
        private String años;
        
        @NotNull
        private String descripcion;
        
        
        @ManyToOne(fetch=FetchType.LAZY, optional = false)
        @JoinColumn(name="persona_id" , nullable=false)
        @OnDelete(action = OnDeleteAction.CASCADE)
        private Persona persona;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, String años, String descripcion, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.años = años;
        this.descripcion = descripcion;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
   
        

}

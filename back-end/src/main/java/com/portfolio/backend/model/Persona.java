
package com.portfolio.backend.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author macab
 */

@Entity
@Table(name="Personas")
public class Persona{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long persona_id;
        
    @NotNull
    private String persona_nombre;
        
    @NotNull
    private String persona_apellido;
        
    @NotNull
    private String persona_mail;
        
    @NotNull
    private String persona_descripcion;
        
    @NotNull
    private String persona_fotoperfil;
    
   
    public Persona() {
    }

    public Persona(Long persona_id, String persona_nombre, String persona_apellido, String persona_mail, String persona_descripcion, String persona_fotoperfil) {
        this.persona_id = persona_id;
        this.persona_nombre = persona_nombre;
        this.persona_apellido = persona_apellido;
        this.persona_mail = persona_mail;
        this.persona_descripcion = persona_descripcion;
        this.persona_fotoperfil = persona_fotoperfil;
    }

    public Long getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(Long persona_id) {
        this.persona_id = persona_id;
    }

    public String getPersona_nombre() {
        return persona_nombre;
    }

    public void setPersona_nombre(String persona_nombre) {
        this.persona_nombre = persona_nombre;
    }

    public String getPersona_apellido() {
        return persona_apellido;
    }

    public void setPersona_apellido(String persona_apellido) {
        this.persona_apellido = persona_apellido;
    }

    public String getPersona_mail() {
        return persona_mail;
    }

    public void setPersona_mail(String persona_mail) {
        this.persona_mail = persona_mail;
    }

    public String getPersona_descripcion() {
        return persona_descripcion;
    }

    public void setPersona_descripcion(String persona_descripcion) {
        this.persona_descripcion = persona_descripcion;
    }

    public String getPersona_fotoperfil() {
        return persona_fotoperfil;
    }

    public void setPersona_fotoperfil(String persona_fotoperfil) {
        this.persona_fotoperfil = persona_fotoperfil;
    }

   
}
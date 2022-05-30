
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
public class Tecnologia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tecnologia_id;
        
    @NotNull
    private String tecnologia_nombre;
    
    @NotNull
    private String tecnologia_nivel;
    
    @Column(nullable=false,length=300)
    private String tecnologia_imagen;

    public Tecnologia() {
    }

    public Tecnologia(Long tecnologia_id, String tecnologia_nombre, String tecnologia_nivel, String tecnologia_imagen) {
        this.tecnologia_id = tecnologia_id;
        this.tecnologia_nombre = tecnologia_nombre;
        this.tecnologia_nivel = tecnologia_nivel;
        this.tecnologia_imagen = tecnologia_imagen;
    }

    public Long getTecnologia_id() {
        return tecnologia_id;
    }

    public void setTecnologia_id(Long tecnologia_id) {
        this.tecnologia_id = tecnologia_id;
    }

    public String getTecnologia_nombre() {
        return tecnologia_nombre;
    }

    public void setTecnologia_nombre(String tecnologia_nombre) {
        this.tecnologia_nombre = tecnologia_nombre;
    }

    public String getTecnologia_nivel() {
        return tecnologia_nivel;
    }

    public void setTecnologia_nivel(String tecnologia_nivel) {
        this.tecnologia_nivel = tecnologia_nivel;
    }

    public String getTecnologia_imagen() {
        return tecnologia_imagen;
    }

    public void setTecnologia_imagen(String tecnologia_imagen) {
        this.tecnologia_imagen = tecnologia_imagen;
    }

    
}


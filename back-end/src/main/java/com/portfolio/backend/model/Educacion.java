package com.portfolio.backend.model;

import java.io.Serializable;
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
public class Educacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educacion_id;

    @Column(nullable=false,length=100)
    private String educacion_establecimiento;
    @Column(nullable=false,length=100)
    private String educacion_nombre;
    
    private String educacion_fecha;

    @Column(nullable=false, length=300)
    private String educacion_imagen;
    
    @Column(nullable=false,length=3000)
    private String educacion_descripcion;

    public Educacion() {
    }

    public Educacion(Long educacion_id, String educacion_establecimiento, String educacion_nombre, String educacion_fecha, String educacion_imagen, String educacion_descripcion) {
        this.educacion_id = educacion_id;
        this.educacion_establecimiento = educacion_establecimiento;
        this.educacion_nombre = educacion_nombre;
        this.educacion_fecha = educacion_fecha;
        this.educacion_imagen = educacion_imagen;
        this.educacion_descripcion = educacion_descripcion;
    }

    public Long getEducacion_id() {
        return educacion_id;
    }

    public void setEducacion_id(Long educacion_id) {
        this.educacion_id = educacion_id;
    }

    public String getEducacion_establecimiento() {
        return educacion_establecimiento;
    }

    public void setEducacion_establecimiento(String educacion_establecimiento) {
        this.educacion_establecimiento = educacion_establecimiento;
    }

    public String getEducacion_nombre() {
        return educacion_nombre;
    }

    public void setEducacion_nombre(String educacion_nombre) {
        this.educacion_nombre = educacion_nombre;
    }

    public String getEducacion_fecha() {
        return educacion_fecha;
    }

    public void setEducacion_fecha(String educacion_fecha) {
        this.educacion_fecha = educacion_fecha;
    }

    public String getEducacion_imagen() {
        return educacion_imagen;
    }

    public void setEducacion_imagen(String educacion_imagen) {
        this.educacion_imagen = educacion_imagen;
    }

    public String getEducacion_descripcion() {
        return educacion_descripcion;
    }

    public void setEducacion_descripcion(String educacion_descripcion) {
        this.educacion_descripcion = educacion_descripcion;
    }

    
}

package com.portfolio.backend.model;

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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educacion_id;

    @NotNull
    private String educacion_establecimiento;
    @NotNull
    private String educacion_nombre;
    private int educacion_fecha;

    @NotNull
    private String educacion_descripcion;

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

    public int getEducacion_fecha() {
        return educacion_fecha;
    }

    public void setEducacion_fecha(int educacion_fecha) {
        this.educacion_fecha = educacion_fecha;
    }

    public String getEducacion_descripcion() {
        return educacion_descripcion;
    }

    public void setEducacion_descripcion(String educacion_descripcion) {
        this.educacion_descripcion = educacion_descripcion;
    }

    public Educacion(Long educacion_id, String educacion_establecimiento, String educacion_nombre, int educacion_fecha, String educacion_descripcion) {
        this.educacion_id = educacion_id;
        this.educacion_establecimiento = educacion_establecimiento;
        this.educacion_nombre = educacion_nombre;
        this.educacion_fecha = educacion_fecha;
        this.educacion_descripcion = educacion_descripcion;
    }

    public Educacion() {
    }

    

}

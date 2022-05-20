
package com.portfolio.backend.service;

import com.portfolio.backend.model.Experiencia;

import java.util.List;

/**
 *
 * @author Macarena Rodriguez
 */
public interface IExperienciaService {
       //METODO - traer/ver las personas
    public List<Experiencia> getExperiencia();
    
    //METODO - dar de alta/agregar una persona nueva
    public Experiencia saveExperiencia (Experiencia exp);
    
    //METODO - eliminar una persona
    public void deleteExperiencia(Long id);
    
    //METODO - buscar/encontrar una persona por id
    public Experiencia findExperiencia(Long id);
    
}

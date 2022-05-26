
package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import java.util.List;

/**
 *
 * @author Macarena Rodriguez
 */
public interface IProyectoService {
    
    //METODO - traer/ver los proyectos
    public List<Proyecto> getProyecto();
    
    //METODO - dar de alta/agregar un proyecto nuevo
    public Proyecto saveProyecto (Proyecto proyecto);
    
    //METODO - eliminar un proyecto
    public void deleteProyecto (Long proyecto_id);
    
    //METODO - buscar/encontrar un proyecto por id
    public Proyecto findProyecto(Long proyecto_id);    
    
}

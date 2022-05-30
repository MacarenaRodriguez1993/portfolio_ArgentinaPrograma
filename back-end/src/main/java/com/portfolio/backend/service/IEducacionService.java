
package com.portfolio.backend.service;

import com.portfolio.backend.model.Educacion;
import java.util.List;

      
/**
 *
 * @author Macarena Rodriguez
 */

public interface IEducacionService {
    
    //Metodo- traer/ver educacion de las personas
    public List<Educacion> getEducacion();
    
    //Metodo - dar de alta o cargar una educacion nueva
    public Educacion saveEducacion(Educacion educ);
    
    //Metodo- eliminar una educacion por id
    public void deleteEducacion(Long id);
    
    //Metodo- buscar o encontrar educacion por id
    public Educacion findEducacion(Long id);
    
 
}

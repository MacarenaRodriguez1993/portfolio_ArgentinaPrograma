
package com.portfolio.backend.service;

import com.portfolio.backend.model.Personas;
import java.util.List;

/**
 *
 * @author Macarena Rodriguez
 */
public interface IPersonasService {
    
    //METODO - traer/ver las personas
    public List<Personas> getPersonas();
    
    //METODO - dar de alta/agregar una persona nueva
    public void savePersona (Personas person);
    
    //METODO - eliminar una persona
    public void deletePersona (Long id);
    
    //METODO - buscar/encontrar una persona por id
    public Personas findPersona(Long id);
    
    
}

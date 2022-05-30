
package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import java.util.List;

/**
 *
 * @author Macarena Rodriguez
 */
public interface IPersonasService {
    
    //METODO - traer/ver las personas
    public List<Persona> getPersonas();
    //METODO - dar de alta/agregar una persona nueva
    public Persona savePersona (Persona person);
    
    //METODO - eliminar una persona
    public void deletePersona (Long id);
    
    //METODO - buscar/encontrar una persona por id
    public Persona findPersona(Long id);
    
    
}

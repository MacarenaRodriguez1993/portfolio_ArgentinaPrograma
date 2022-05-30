
package com.portfolio.backend.service;


import com.portfolio.backend.model.Tecnologia;
import java.util.List;

/**
 *
 * @author Macarena Rodriguez
 */
public interface ITecnologiaService {
    //METODO - traer/ver los tecnologia
    public List<Tecnologia> getTecnologia();
    
    //METODO - dar de alta/agregar una tecnologia nueva
    public Tecnologia saveTecnologia(Tecnologia tecno);
    
    //METODO - eliminar una tecnologia
    public void deleteTecnologia(Long tecnologia_id);
    
    //METODO - buscar/encontrar una tecnologia por id
    public Tecnologia findTecnologia(Long tecnologia_id);  
}

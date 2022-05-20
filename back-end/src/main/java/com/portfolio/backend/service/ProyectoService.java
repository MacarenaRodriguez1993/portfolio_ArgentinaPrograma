
package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Macarena Rodriguez
 */
@Service
public class ProyectoService implements IProyectoService{
    
        @Autowired
        private ProyectoRepository proyectoRepository;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> listaProyecto =proyectoRepository.findAll();
        return listaProyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long proyecto_id) {
        proyectoRepository.deleteById(proyecto_id);
    }

    @Override
    public Proyecto findProyecto(Long proyecto_id) {
        Proyecto proyecto=proyectoRepository.findById(proyecto_id).orElse(null);
        return proyecto;
    }
    
    
}

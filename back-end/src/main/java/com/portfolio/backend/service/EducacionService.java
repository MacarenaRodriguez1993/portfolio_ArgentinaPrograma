/*
package com.portfolio.backend.service;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 *
 * @author Macarena Rodriguez
 */
/*
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository eduRepository;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion =eduRepository.findAll();
        
        return listaEducacion;
    }

    @Override
    public void saveEducacion(Educacion edu) {
        eduRepository.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        eduRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educ=eduRepository.findById(id).orElse(null);
        return educ;
    }
    
}
*/
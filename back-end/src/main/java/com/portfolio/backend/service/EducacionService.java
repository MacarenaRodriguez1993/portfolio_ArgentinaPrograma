
package com.portfolio.backend.service;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Macarena Rodriguez
 */
@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository eduRepository;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion =eduRepository.findAll();   
        return listaEducacion;
    }

    @Override
    public void saveEducacion(Educacion educ) {
        eduRepository.save(educ);
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

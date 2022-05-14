
package com.portfolio.backend.service;

import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.model.Persona;
import com.portfolio.backend.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 *
 * @author Macarena Rodriguez
 */
public class ExperienciaService implements IExperienciaService{

    @Autowired
        private ExperienciaRepository expRepository;
    
    @Override
    public List<Experiencia> getExperiencia() {
          List<Experiencia> listadoExperiencia=expRepository.findAll();
           return listadoExperiencia;
    }

    @Override
    public void saveExperiencia(Experiencia exp) {

        expRepository.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {

            expRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia exp=expRepository.findById(id).orElse(null);
        return exp;
    }

}

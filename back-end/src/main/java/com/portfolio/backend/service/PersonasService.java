
package com.portfolio.backend.service;

import com.portfolio.backend.model.Personas;
import com.portfolio.backend.repository.PersonasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Macarena Rodriguez
 */
@Service
public class PersonasService implements IPersonasService{
    
        @Autowired
        private PersonasRepository persRepository;

    @Override
    public List<Personas> getPersonas() {
            List<Personas> listadoPersonas=persRepository.findAll();
            return listadoPersonas;
    }

    @Override
    public void savePersona(Personas person) {
        persRepository.save(person);
    }

    @Override
    public void deletePersona(Long id) {
        persRepository.deleteById(id);
    }

    @Override
    public Personas findPersona(Long id) {
        Personas perso=persRepository.findById(id).orElse(null);
        return perso;
    }
    
}

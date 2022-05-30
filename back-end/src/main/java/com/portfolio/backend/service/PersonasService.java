
package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
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
    public List<Persona> getPersonas(){
        return persRepository.findAll();
    }
   

    @Override
    public Persona savePersona(Persona person) {
        return persRepository.save(person);
    }

    @Override
    public void deletePersona(Long id) {
        persRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso=persRepository.findById(id).orElse(null);
        return perso;
    }

 
    
}

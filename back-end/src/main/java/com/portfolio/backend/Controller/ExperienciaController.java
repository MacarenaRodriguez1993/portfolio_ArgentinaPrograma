
package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.repository.ExperienciaRepository;
import com.portfolio.backend.repository.PersonasRepository;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
/**
 *
 * @author Macarena Rodriguez
 */
@RestController
public class ExperienciaController {
    
        @Autowired
        private ExperienciaRepository expRepository;
        
        @Autowired 
        private PersonasRepository persRepository;
        
        @PostMapping("/personas/{persona_id}/experiencias")
        public Experiencia guardarExperiencia (@PathVariable(value="persona_id") Long persona_id, @Valid @RequestBody Experiencia exp){
            return persRepository.findById(persona_id).map(persona ->{exp.setPersona(persona);
                return expRepository.save(exp);
            }).orElseThrow(()->null);
            
            
        }
}

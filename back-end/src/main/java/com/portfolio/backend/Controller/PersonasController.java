
package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.service.IPersonasService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Macarena Rodriguez
 */
@RestController
@CrossOrigin(origins = "https://portfolio-argentinaprogr-7832c.web.app")
@RequestMapping("/api/persona")
public class PersonasController {
        
        @Autowired
        private IPersonasService iPersonas;
        
        //TRAER LISTA DE PERSONAS
        @GetMapping
        public List<Persona> getPersona(){
            return iPersonas.getPersonas();
            
        }
        
        //CREAR UNA NUEVA PERSONAS
        @PostMapping
        public Persona crearPersona (@RequestBody Persona perso){
            return iPersonas.savePersona(perso);
           
        }
         @GetMapping("/{id}")
        public Persona obtenerPersonaPorId(@PathVariable Long id){
            Persona perso =iPersonas.findPersona(id);
            return perso;
    }
        
        //ELIMINAR UNA PERSONA
        @DeleteMapping("/{id}")
        public String eliminarPersona(@PathVariable Long id){
            iPersonas.deletePersona(id);
            return "La persona fue eliminada";
        }
        
    //EDITAR UNA PERSONA
    @PutMapping("/{persona_id}")
    public Persona editarPersona(@PathVariable Long persona_id,@RequestBody Persona persona){
        Persona perso =iPersonas.findPersona(persona_id);
        
        perso.setPersona_nombre(persona.getPersona_nombre());
        perso.setPersona_apellido(persona.getPersona_apellido());
        perso.setPersona_titulo(persona.getPersona_titulo());
        perso.setPersona_descripcion(persona.getPersona_descripcion());
        perso.setPersona_fotoperfil(persona.getPersona_fotoperfil());
        
        Persona pEditada=iPersonas.savePersona(perso);
        
        return pEditada;
        
    }
    
   
}

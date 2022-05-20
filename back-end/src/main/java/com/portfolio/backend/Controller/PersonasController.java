
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
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/personas/")
public class PersonasController {
        
        @Autowired
        private IPersonasService iPersonas;
        
        //TRAER LISTA DE PERSONAS
        @GetMapping("traer")
        public List<Persona> getPersona(){
            return iPersonas.getPersonas();
            
        }
        
        //CREAR UNA NUEVA PERSONAS
        @PostMapping("crear")
        public String crearPersona (@RequestBody Persona perso){
            iPersonas.savePersona(perso);
            return "Se agrego una nueva personas";
        }
        
        //ELIMINAR UNA PERSONA
        @DeleteMapping("/personas/eliminar/{id}")
        public String eliminarPersona(@PathVariable Long id){
            iPersonas.deletePersona(id);
            return "La persona fue eliminada";
        }
        
    //EDITAR UNA PERSONA
    @PutMapping("editar/2")
    public Persona editarPersona(@PathVariable Long persona_id,
                                 @RequestParam ("persona_nombre")String nuevoNombre,
                                 @RequestParam ("persona_apellido") String nuevoApellido,
                                 @RequestParam ("persona_mail")String nuevoMail,
                                 @RequestParam ("persona_descripcion")String nuevaDescripcion,
                                 @RequestParam ("persona_fotoperfil")String nuevaFoto){
        Persona perso =iPersonas.findPersona(persona_id);
        perso.setPersona_nombre(nuevoNombre);
        perso.setPersona_apellido(nuevoApellido);
        perso.setPersona_mail(nuevoMail);
        perso.setPersona_descripcion(nuevaDescripcion);
        perso.setPersona_fotoperfil(nuevaFoto);
        
        iPersonas.savePersona(perso);
        return perso;
        
    }
    
    @GetMapping("perfil/{id}")
    public Persona traerPerfil(@PathVariable Long id){
        return iPersonas.findPersona(id);
    }
    
}

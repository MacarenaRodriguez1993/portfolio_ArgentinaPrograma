
package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Personas;
import com.portfolio.backend.service.IPersonasService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Macarena Rodriguez
 */
@RestController
public class PersonasController {
        
        @Autowired
        private IPersonasService iPersonas;
        
        //TRAER LISTA DE PERSONAS
        @GetMapping("/personas/traer")
        public List<Personas> getPersonas(){
            return iPersonas.getPersonas();
        }
        
        //CREAR UNA NUEVA PERSONAS
        @PostMapping("/personas/crear")
        public String crearPersona (@RequestBody Personas perso){
            iPersonas.savePersona(perso);
            return "Se agrego una nueva personas";
        }
        
        //ELIMINAR UNA PERSONA
        @DeleteMapping("/personas/eliminar/{id}")
        public String eliminarPersona(@PathVariable Long id){
            iPersonas.deletePersona(id);
            return "La persona fue eliminada";
        }
        
        //EDITAR LOS DATOS DE UNA PERSONA
        @PutMapping("/personas/editar/{id}")
        public Personas editarPersonas(@PathVariable Long id,
                                                            @RequestParam ("nombre") String nuevoNombre,
                                                            @RequestParam ("apellido") String nuevoApellido,
                                                            @RequestParam("mail") String nuevoMail ){
            Personas perso =iPersonas.findPersona(id);
            
            perso.setNombre(nuevoNombre);
            perso.setApellido(nuevoApellido);
            perso.setMail(nuevoMail);
            
            iPersonas.savePersona(perso);
            return perso;
        }
    
}

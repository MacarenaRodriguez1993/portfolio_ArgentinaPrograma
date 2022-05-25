
package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.repository.ExperienciaRepository;
import com.portfolio.backend.repository.PersonasRepository;
import com.portfolio.backend.service.ExperienciaService;
import java.util.List;
import javax.validation.Valid;
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
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/experiencia")
public class ExperienciaController {
    
    @Autowired
    private ExperienciaService iExperiencia;
    
    //TRAER LISTA DE EXPERIENCIAS
    @GetMapping
    public List<Experiencia> getExperiencia(){
       return iExperiencia.getExperiencia();
    }
        
    //CREAR UNA NUEVA EXPERIENCIA
    @PostMapping
    public Experiencia crearExperiencia (@RequestBody Experiencia exp){
       return iExperiencia.saveExperiencia(exp);
       
    }
        
    //ELIMINAR UNA EXPERIENCIA
    @DeleteMapping("/{experiencia_id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable Long experiencia_id){
        iExperiencia.deleteExperiencia(experiencia_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
      
    //EDITAR LOS DATOS DE UNA EXPERIENCIA LABORAL
    @PutMapping("/{experiencia_id}")
    public Experiencia editarExperiencia(@PathVariable Long experiencia_id,
                                         @RequestParam ("nombre") String nuevoNombre,
                                         @RequestParam ("fecha") String nuevaFecha,
                                         @RequestParam("descipcion") String nuevaDescripcion){
        Experiencia experiencia =iExperiencia.findExperiencia(experiencia_id);
            
        experiencia.setExperiencia_nombre(nuevoNombre);
        experiencia.setExperiencia_fecha(nuevaDescripcion);
        experiencia.setExperiencia_descripcion(nuevaDescripcion);
            
        iExperiencia.saveExperiencia(experiencia);
        return experiencia;
        }
    
   
}

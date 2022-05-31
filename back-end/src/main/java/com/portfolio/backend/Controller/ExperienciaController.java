
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
@CrossOrigin(origins = "https://portfolio-argentinaprogr-7832c.web.app")
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
    
    //OBTENER EXPERIENCIA POR ID
    @GetMapping("/{id}")
    public Experiencia obtenerExperienciaPorId(@PathVariable Long id){
        Experiencia experiencia =iExperiencia.findExperiencia(id);
        return experiencia;
    }
    
     //EDITAR LOS DATOS DE UNA EXPERIENCIA LABORAL
    @PutMapping("/{id}")
    public Experiencia editarExperiencia(@PathVariable Long id,@RequestBody Experiencia nuevoExperiencia){
        Experiencia exp=iExperiencia.findExperiencia(id);
        exp.setExperiencia_nombre(nuevoExperiencia.getExperiencia_nombre());
        exp.setExperiencia_fecha(nuevoExperiencia.getExperiencia_fecha());
        exp.setExperiencia_imagen(nuevoExperiencia.getExperiencia_imagen());
        exp.setExperiencia_descripcion(nuevoExperiencia.getExperiencia_descripcion());
        
        Experiencia experiencia = iExperiencia.saveExperiencia(exp);
        return experiencia;
    }
        
    //ELIMINAR UNA EXPERIENCIA
    @DeleteMapping("/{experiencia_id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable Long experiencia_id){
        iExperiencia.deleteExperiencia(experiencia_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
      
   
    
   
}

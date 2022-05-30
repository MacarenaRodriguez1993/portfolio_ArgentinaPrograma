
package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Tecnologia;
import com.portfolio.backend.service.ITecnologiaService;
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
@RequestMapping("/api/tecnologia")
@CrossOrigin(origins = "https://portfolio-argentinaprogr-7832c.web.app")
public class TecnologiaController {
    @Autowired
    private ITecnologiaService iTecnologia;
    //TRAER LISTA DE EDUCACION
    @GetMapping
    public List<Tecnologia> getTecnologia(){
        return iTecnologia.getTecnologia();
    }
   
    //CREAR UNA NUEVA Tecnologia
    @PostMapping
    public Tecnologia crearTecnologia(@RequestBody Tecnologia tecno){
        return  iTecnologia.saveTecnologia(tecno);   
    }
    @GetMapping("/{id}")
    public Tecnologia obtenerProyectoPorId(@PathVariable Long id){
        Tecnologia tecno =iTecnologia.findTecnologia(id);
        return tecno;
    }
    
    //ELIMINAR UN TIPO de tecnologia por id
    @DeleteMapping("/{eliminar_id}")
    public ResponseEntity<?> deleteTecnologia(@PathVariable Long eliminar_id){
        iTecnologia.deleteTecnologia(eliminar_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //EDITAR UNA EDUCACION POR ID
    @PutMapping("/{editar_id}")
    public Tecnologia editarTecnologia(@PathVariable Long editar_id ,@RequestBody Tecnologia skill){
       Tecnologia tecno =iTecnologia.findTecnologia(editar_id);
        
        tecno.setTecnologia_nombre(skill.getTecnologia_nombre());
        tecno.setTecnologia_nivel(skill.getTecnologia_nivel());
        tecno.setTecnologia_imagen(skill.getTecnologia_imagen());
        
        Tecnologia tecnoActualizada= iTecnologia.saveTecnologia(tecno);
        return tecnoActualizada;
    }   
}

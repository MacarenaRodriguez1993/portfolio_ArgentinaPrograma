
package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.service.IProyectoService;
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
@RequestMapping("/api/proyecto")
public class ProyectoController {
    @Autowired
    private IProyectoService iProyecto;
    
    //TRAER PROYECTOS
    @GetMapping
    public List<Proyecto> getProyecto(){
        return iProyecto.getProyecto();
    }
    
    //CREAR NUEVO PROYECTO
    @PostMapping("/crear")
    public Proyecto crearProyecto(@RequestBody Proyecto proyecto){
        return  iProyecto.saveProyecto(proyecto);    
    }
    //OBTENER PROYECTO POR ID 
    @GetMapping("{id}")
    public Proyecto obtenerProyectoPorId(@PathVariable Long id){
        Proyecto proyecto= iProyecto.findProyecto(id);
        return proyecto;
    }
    
     @PutMapping("/{id}")
    public Proyecto editarProyecto(@PathVariable Long id,@RequestBody Proyecto detalleProyecto){
        Proyecto proyect=iProyecto.findProyecto(id);
        proyect.setProyecto_nombre(detalleProyecto.getProyecto_nombre());
        proyect.setProyecto_fecha(detalleProyecto.getProyecto_fecha());
        proyect.setProyecto_url(detalleProyecto.getProyecto_url());
        proyect.setProyecto_descripcion(detalleProyecto.getProyecto_descripcion());
        
        Proyecto proyectActualizado=iProyecto.saveProyecto(proyect);
        return proyectActualizado;
    }
    //ELIMINAR UN PROYECTO 
      @DeleteMapping("/{proyecto_id}")
    public ResponseEntity<?> deleteProyecto(@PathVariable Long proyecto_id){
        iProyecto.deleteProyecto(proyecto_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
   
}

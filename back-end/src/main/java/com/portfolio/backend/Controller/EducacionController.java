
package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.service.IEducacionService;
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



/**
 *
 * @author Macarena Rodriguez
 */

@RestController
@RequestMapping("/api/educacion")
@CrossOrigin(origins = "https://portfolio-argentinaprogr-7832c.web.app")
public class EducacionController {
    
    @Autowired
    private IEducacionService iEducacion;
   
    //TRAER LISTA DE EDUCACION
    @GetMapping
    public List<Educacion> getEducacion(){
        return iEducacion.getEducacion();
    }
    
    //TRAER UNA EDUCACION POR ID
    @GetMapping("{id}")
    public Educacion obtenerEducacionPorId(@PathVariable Long id){
        Educacion educ=iEducacion.findEducacion(id);
        return educ;
    }
   
    //CREAR UNA NUEVA EDUCACION
    @PostMapping
    /*public Educacion crearEducacion(@RequestBody Educacion educ){
        return iEducacion.saveEducacion(educ);
    }*/
    public Educacion crearEducacion(@RequestBody Educacion educacion){
        return iEducacion.saveEducacion(educacion);
    }
    
    //ELIMINAR UN TIPO DE EDUCACION POR ID
    @DeleteMapping("/{eliminar_id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable Long eliminar_id){
        iEducacion.deleteEducacion(eliminar_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    //EDITAR UNA EDUCACION POR ID
    @PutMapping("/{editar_id}")
    public Educacion editarEducacion(@PathVariable Long editar_id ,@RequestBody Educacion educ){
        Educacion educac=iEducacion.findEducacion(editar_id);
        educac.setEducacion_establecimiento(educ.getEducacion_establecimiento());
        educac.setEducacion_nombre(educ.getEducacion_nombre());
        educac.setEducacion_fecha(educ.getEducacion_fecha());
        educac.setEducacion_imagen(educ.getEducacion_imagen());
        educac.setEducacion_descripcion(educ.getEducacion_descripcion());
        
        Educacion educacionActualizada =iEducacion.saveEducacion(educ);
        return educacionActualizada;
    }
}

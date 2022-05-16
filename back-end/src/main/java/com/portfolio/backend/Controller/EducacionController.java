
package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService iEducacion;
   
    //TRAER LISTA DE EDUCACION
    @GetMapping("/educacion/ver")
    public List<Educacion> getEducacion(){
        return iEducacion.getEducacion();
    }
   
    //CREAR UNA NUEVA EDUCACION
    @PostMapping("/educacion/crear")
    public String crearEducacion(@RequestBody Educacion educ){
        iEducacion.saveEducacion(educ);
        return "Se creo una nueva educacion";
    }
    
    //ELIMINAR UN TIPO DE EDUCACION POR ID
    @DeleteMapping("/educacion/eliminar/{eliminar_id}")
    public String deleteEducacion(@PathVariable Long eliminar_id){
        iEducacion.deleteEducacion(eliminar_id);
        return "Se elimino una educacion";
    }
    
    //EDITAR UNA EDUCACION POR ID
    @PutMapping("/educacion/editar/{editar_id}")
    public Educacion editarEducacion(@PathVariable Long editar_id ,
                                     @RequestParam ("establecimiento")String nuevoEstablecimiento,
                                     @RequestParam ("nombre")String nuevoNombre,
                                     @RequestParam("año") int nuevoAño,
                                     @RequestParam("descripcion")String nuevaDescripcion){
        Educacion educacion=iEducacion.findEducacion(editar_id);
        
        educacion.setEstablecimiento(nuevoEstablecimiento);
        educacion.setNombre(nuevoNombre);
        educacion.setId(editar_id);
        educacion.setDescripcion(nuevaDescripcion);
        
        iEducacion.saveEducacion(educacion);
        return educacion;
        
    }

}


package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.service.IEducacionService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    
    @Autowired
    private IEducacionService iEducacion;
   
    //TRAER LISTA DE EDUCACION
    @GetMapping
    public List<Educacion> getEducacion(){
        return iEducacion.getEducacion();
    }
   
    //CREAR UNA NUEVA EDUCACION
    @PostMapping
    public String crearEducacion(@RequestBody Educacion educ){
        iEducacion.saveEducacion(educ);
        return "Se creo una nueva educacion";
    }
    
    //ELIMINAR UN TIPO DE EDUCACION POR ID
    @DeleteMapping("/{eliminar_id}")
    public String deleteEducacion(@PathVariable Long eliminar_id){
        iEducacion.deleteEducacion(eliminar_id);
        return "Se elimino una educacion";
    }
    
    //EDITAR UNA EDUCACION POR ID
    @PutMapping("/{editar_id}")
    public Educacion editarEducacion(@PathVariable Long editar_id ,
                                     @RequestParam ("educacion_establecimiento")String nuevoEstablecimiento,
                                     @RequestParam ("educacion_nombre")String nuevoNombre,
                                     @RequestParam("educacion_fecha") int nuevoAño,
                                     @RequestParam("educacion_descripcion")String nuevaDescripcion){
        Educacion educacion=iEducacion.findEducacion(editar_id);
        
        educacion.setEducacion_establecimiento(nuevoEstablecimiento);
        educacion.setEducacion_nombre(nuevoNombre);
        educacion.setEducacion_fecha(nuevoAño);
        educacion.setEducacion_descripcion(nuevaDescripcion);
        
        iEducacion.saveEducacion(educacion);
        return educacion;
    }
}


package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Tecnologia;
import com.portfolio.backend.service.ITecnologiaService;
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
@RequestMapping("/tecnologia/")
@CrossOrigin(origins = "http://localhost:4200")
public class TecnologiaController {
    @Autowired
    private ITecnologiaService iTecnologia;
    //TRAER LISTA DE EDUCACION
    @GetMapping("traer")
    public List<Tecnologia> getTecnologia(){
        return iTecnologia.getTecnologia();
    }
   
    //CREAR UNA NUEVA Tecnologia
    @PostMapping("crear")
    public String crearTecnologia(@RequestBody Tecnologia tecno){
        iTecnologia.saveTecnologia(tecno);
        return "Se creo una nueva tecnologia";
    }
    //ELIMINAR UN TIPO de tecnologia por id
    @DeleteMapping("eliminar/{eliminar_id}")
    public String deleteEducacion(@PathVariable Long eliminar_id){
        iTecnologia.deleteTecnologia(eliminar_id);
        return "Se elimino una tecnologia";
    }
    //EDITAR UNA EDUCACION POR ID
    @PutMapping("editar/{editar_id}")
    public Tecnologia editarTecnologia(@PathVariable Long editar_id ,
                                     @RequestParam ("tecnologia_nombre")String nuevoNombre,
                                     @RequestParam("tecnologia_nivel") String nuevoNivel,
                                     @RequestParam("tecnologia_imagen")String nuevaImagen){
       Tecnologia tecno =iTecnologia.findTecnologia(editar_id);
        
        tecno.setTecnologia_nombre(nuevoNombre);
        tecno.setTecnologia_nivel(nuevoNivel);
        tecno.setTecnologia_imagen(nuevaImagen);
        
        iTecnologia.saveTecnologia(tecno);
        return tecno;
    }   
}

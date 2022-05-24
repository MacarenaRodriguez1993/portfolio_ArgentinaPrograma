
package com.portfolio.backend.Controller;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.service.IProyectoService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Macarena Rodriguez
 */
@RestController
@RequestMapping("/api/proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    @Autowired
    private IProyectoService iProyecto;
    
    //TRAER PROYECTOS
    @GetMapping
    public List<Proyecto> getProyecto(){
        return iProyecto.getProyecto();
    }
    
    //CREAR NUEVO PROYECTO
    @PostMapping
    public String crearProyecto(@RequestBody Proyecto proyectos){
        iProyecto.saveProyecto(proyectos);
        return "Se agrego nuevo proyecto";
    }
}

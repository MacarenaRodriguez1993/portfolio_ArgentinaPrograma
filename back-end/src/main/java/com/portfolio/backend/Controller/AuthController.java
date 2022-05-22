
package com.portfolio.backend.Controller;

import com.portfolio.backend.model.UsuarioDatos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author macab
 */
@RestController
public class AuthController {
    @PostMapping("/login")
    public boolean login(@RequestBody UsuarioDatos uDto){
        return false;
    }
            
}

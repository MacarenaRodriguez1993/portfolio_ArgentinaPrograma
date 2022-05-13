
package com.portfolio.backend.service;

import com.portfolio.backend.repository.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Macarena Rodriguez
 */
@Service
public class PersonasService {
    
        @Autowired
        private PersonasRepository persRepository;
    
}

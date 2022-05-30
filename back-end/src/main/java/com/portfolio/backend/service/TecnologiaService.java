
package com.portfolio.backend.service;

import com.portfolio.backend.model.Tecnologia;
import com.portfolio.backend.repository.TecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Macarena Rodriguez
 */
@Service
public class TecnologiaService implements ITecnologiaService{
    
    @Autowired
    private TecnologiaRepository tecnoRepository;

    @Override
    public List<Tecnologia> getTecnologia() {
        List<Tecnologia> listaTecnologia=tecnoRepository.findAll();
        return listaTecnologia;   
    }

    @Override
    public Tecnologia saveTecnologia(Tecnologia tecno) {
        return tecnoRepository.save(tecno);
    }

    @Override
    public void deleteTecnologia(Long tecnologia_id) {
        tecnoRepository.deleteById(tecnologia_id);
    }

    @Override
    public Tecnologia findTecnologia(Long tecnologia_id) {
        Tecnologia tecno =tecnoRepository.findById(tecnologia_id).orElse(null);
        return tecno;
    }
    
}

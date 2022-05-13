
package com.portfolio.backend.repository;

import com.portfolio.backend.model.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Macarena Rodriguez
 */
@Repository
public interface PersonasRepository extends  JpaRepository<Personas, Long>{
    
}

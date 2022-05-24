
package com.portfolio.backend.repository;

import com.portfolio.backend.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author macab
 */
public interface UserRepository  extends JpaRepository<User, Integer>{
    
    Optional<User> findByEmail(String email);
    
}

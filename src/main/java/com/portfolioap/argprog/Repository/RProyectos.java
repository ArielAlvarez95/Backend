
package com.portfolioap.argprog.Repository;

import com.portfolioap.argprog.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer>{
    public Optional <Proyectos> findByNombrePro(String nombreE);
    public boolean existsByNombrePro(String nombreE);
    
}
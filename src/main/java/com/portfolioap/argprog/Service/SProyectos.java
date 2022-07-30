package com.portfolioap.argprog.Service;

import com.portfolioap.argprog.Entity.Proyectos;
import com.portfolioap.argprog.Repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {
    @Autowired
    RProyectos rProyectos;

    public List<Proyectos> list() {
        return rProyectos.findAll();
    }

    public Optional<Proyectos> getOne(int id) {
        return rProyectos.findById(id);
    }
    
   public Optional <Proyectos> getByNombrePro(String nombreP){
       return rProyectos.findByNombrePro(nombreP);
   }
   
   public void save(Proyectos pro) {
       rProyectos.save(pro);
   }
   
   public void delete(int id){
       rProyectos.deleteById(id);
   }
   
   public boolean existsById(int id){
       return rProyectos.existsById(id);
   }
   
   public boolean existsByNombrePro(String nombreP){
       return rProyectos.existsByNombrePro(nombreP);
   }
}
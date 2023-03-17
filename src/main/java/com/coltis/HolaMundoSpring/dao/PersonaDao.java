package com.coltis.HolaMundoSpring.dao;
//FUNCIONES DE UN CRUD INCLUIDAS
import com.coltis.HolaMundoSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;



public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}

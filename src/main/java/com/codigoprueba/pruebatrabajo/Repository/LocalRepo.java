package com.codigoprueba.pruebatrabajo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.codigoprueba.pruebatrabajo.Entity.Localidad;


public interface LocalRepo extends CrudRepository<Localidad, Integer> {
    
}

package com.codigoprueba.pruebatrabajo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.codigoprueba.pruebatrabajo.Entity.Provincia;

public interface ProvinciaRepo extends CrudRepository <Provincia, Integer> {
    
}

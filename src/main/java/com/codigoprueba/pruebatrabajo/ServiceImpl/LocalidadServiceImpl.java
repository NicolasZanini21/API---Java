package com.codigoprueba.pruebatrabajo.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigoprueba.pruebatrabajo.DTOs.LocalidadDto;
import com.codigoprueba.pruebatrabajo.Entity.Localidad;

import com.codigoprueba.pruebatrabajo.Repository.LocalRepo;
import com.codigoprueba.pruebatrabajo.Service.LocalidadService;

@Service
public class LocalidadServiceImpl implements LocalidadService {

    @Autowired
    public LocalRepo repo;
  

    @Override
    public LocalidadDto buscarLocalidad(int id) {
        Optional<Localidad> localidadOptional = this.repo.findById(id);
        
        if (localidadOptional.isPresent()) {
            Localidad localidad = localidadOptional.get();
            LocalidadDto localidadDto = new LocalidadDto(localidad.getIdLocalidades(),localidad.getNombre(), localidad.getIdProvincia(), localidad.getCodigoPostal());
           
            
            return localidadDto;
        }       else {
        
                        return null; 
                     }
         
        }
        
   

    @Override
    public List<LocalidadDto> consultarLocalidades(){
        Iterable<Localidad> localidadIterable = repo.findAll();
        List<LocalidadDto> localidadDto = StreamSupport.stream(localidadIterable.spliterator(), false)
                .map(localidad -> new LocalidadDto(localidad.getIdLocalidades(),localidad.getNombre(), localidad.getIdProvincia(), localidad.getCodigoPostal()))
                .collect(Collectors.toList());
        return localidadDto;
    }
    


    @Override
    public Localidad crearLocalidad(Localidad localidad) {
       localidad.setNombre(localidad.getNombre());
        return this.repo.save(localidad);
    }

    @Override
    public void eliminarLocalidad(int id) {
         this.repo.deleteById(id);
        
    }

    @Override
    public Localidad modificarLocalidad(Localidad localidad) {
        return this.repo.save(localidad);
    
}



  



   



}

package com.codigoprueba.pruebatrabajo.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.codigoprueba.pruebatrabajo.DTOs.PersonaDto;
import com.codigoprueba.pruebatrabajo.Entity.Persona;
import com.codigoprueba.pruebatrabajo.Repository.PersonaRepo;
import com.codigoprueba.pruebatrabajo.Service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepo repo;

    @Override
    public List<PersonaDto> consultarPersonas(){
           Iterable<Persona> personaIterable = repo.findAll();
        List<PersonaDto> personaDto = StreamSupport.stream(personaIterable.spliterator(), false)
                .map(persona -> new PersonaDto(persona.getNombreApellido(), persona.getFechaNacimiento(), persona.getGenero(), persona.getNacionalidad(), persona.getIdLocalidad(), persona.getCodigoPostal()))
                .collect(Collectors.toList());
        return personaDto;

    }


    @Override
    public PersonaDto buscarPersona(int id) {
        
           Optional<Persona> personaOptional = this.repo.findById(id);
        
        if (personaOptional.isPresent()) {
            Persona persona = personaOptional.get();
            PersonaDto personaDto = new PersonaDto(persona.getNombreApellido(), persona.getFechaNacimiento(), persona.getGenero(), persona.getNacionalidad(), persona.getIdLocalidad(), persona.getCodigoPostal());
           
            
            return personaDto;
        }       else {
        
                        return null; 
                     }
         
        }
    

    @Override
    public Persona crearPersona(Persona Persona) {
        
        Persona.setCorreoElectronico(Persona.getCorreoElectronico());
        return this.repo.save(Persona);
    }

    @Override
    public void eliminarPersona(int id) {
        this.repo.deleteById(id);
        
        
    }

    @Override
    public Persona modificarPersona(Persona Personas) {
        
        return this.repo.save(Personas);
    }
    
}

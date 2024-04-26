package com.codigoprueba.pruebatrabajo.Service;
import java.util.List;

import com.codigoprueba.pruebatrabajo.DTOs.PersonaDto;
import com.codigoprueba.pruebatrabajo.Entity.Persona;

public interface PersonaService {

    public List<PersonaDto> consultarPersonas();

    public Persona crearPersona(Persona Persona);

    public Persona modificarPersona(Persona Persona);

    public PersonaDto buscarPersona(int id);

    public void eliminarPersona(int id);


}

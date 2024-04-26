package com.codigoprueba.pruebatrabajo.Service;

import java.util.List;

import com.codigoprueba.pruebatrabajo.DTOs.LocalidadDto;
import com.codigoprueba.pruebatrabajo.Entity.Localidad;


public interface LocalidadService {

    public List<LocalidadDto> consultarLocalidades();

    public Localidad crearLocalidad(Localidad localidades);

    public Localidad modificarLocalidad(Localidad localidades);

    public LocalidadDto buscarLocalidad(int id);

    public void eliminarLocalidad(int id);

}

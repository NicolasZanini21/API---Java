package com.codigoprueba.pruebatrabajo.Service;

import java.util.List;

import com.codigoprueba.pruebatrabajo.DTOs.ProvinciaDto;
import com.codigoprueba.pruebatrabajo.Entity.Provincia;

public interface ProvinciaService {

    public List<ProvinciaDto> consultarProvincias();

    public Provincia crearProvincia(Provincia Provincia);

    public Provincia modificarProvincia(Provincia Provincia);

    public ProvinciaDto buscarProvincia(int id);

    public void eliminarProvincia(int id);

    
} 


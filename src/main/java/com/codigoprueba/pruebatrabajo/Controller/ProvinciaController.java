package com.codigoprueba.pruebatrabajo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigoprueba.pruebatrabajo.DTOs.ProvinciaDto;
import com.codigoprueba.pruebatrabajo.Entity.Provincia;
import com.codigoprueba.pruebatrabajo.ServiceImpl.ProvinciaServiceImpl;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController {
    
    @Autowired
    private ProvinciaServiceImpl impl;

    @GetMapping
    public ResponseEntity<?> consultarProvincia(){
    List<ProvinciaDto> provincias= this.impl.consultarProvincias();
    return ResponseEntity.ok(provincias);
    }


    @PostMapping
    public ResponseEntity<?> crearProvincia(@RequestBody Provincia Provincia){
    Provincia provinciacreada = this.impl.crearProvincia(Provincia);
    return ResponseEntity.status(HttpStatus.CREATED).body(provinciacreada);
    }


    @PutMapping
    public ResponseEntity<?> modificarProvincia(@RequestBody Provincia Provincia){
    Provincia modificarprovincia = this.impl.modificarProvincia(Provincia);
    return ResponseEntity.status(HttpStatus.CREATED).body(modificarprovincia);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> consultarProvincia(@PathVariable int id){
    ProvinciaDto Provincia = this.impl.buscarProvincia(id);
    return ResponseEntity.ok(Provincia);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarProvincia(@PathVariable int id){
    this.impl.eliminarProvincia(id);
    return ResponseEntity.ok().build();
    }
}

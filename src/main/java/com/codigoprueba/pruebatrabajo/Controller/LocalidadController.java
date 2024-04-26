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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codigoprueba.pruebatrabajo.DTOs.LocalidadDto;
import com.codigoprueba.pruebatrabajo.Entity.Localidad;
import com.codigoprueba.pruebatrabajo.ServiceImpl.LocalidadServiceImpl;

@RestController
@RequestMapping("/localidades")
public class LocalidadController {
    @Autowired
    private LocalidadServiceImpl imple;

    @GetMapping
    public ResponseEntity<?> consultarLocalidaes(){
    List<LocalidadDto> localidades= this.imple.consultarLocalidades();
    return ResponseEntity.ok(localidades);
    
}

    @PostMapping 
    public ResponseEntity<?> crearLocalidad(@RequestBody Localidad localidad){
    Localidad localidadcreada = this.imple.crearLocalidad(localidad);
    return ResponseEntity.status(HttpStatus.CREATED).body(localidadcreada);
    }


    @PutMapping
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> modificarLocalidad(@RequestBody Localidad localidad){
    Localidad modificarlocalidad = this.imple.modificarLocalidad(localidad);
    return ResponseEntity.status(HttpStatus.CREATED).body(modificarlocalidad);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> consultarLocalidad(@PathVariable int id){
    LocalidadDto localidades = this.imple.buscarLocalidad(id);
    return ResponseEntity.ok(localidades);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarLocalidad(@PathVariable int id){
    this.imple.eliminarLocalidad(id);
    return ResponseEntity.ok().build();
    }


}

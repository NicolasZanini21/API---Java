package com.codigoprueba.pruebatrabajo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.codigoprueba.pruebatrabajo.DTOs.PersonaDto;
import com.codigoprueba.pruebatrabajo.Entity.Persona;
import com.codigoprueba.pruebatrabajo.ServiceImpl.PersonaServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/personas")
public class PersonaController {
    
    @Autowired
    private PersonaServiceImpl impl;

    @GetMapping
    @RequestMapping
    public ResponseEntity<?> consultarPersonas(){
    List<PersonaDto> listapersona= this.impl.consultarPersonas();
    return ResponseEntity.ok(listapersona);
    }


    @PostMapping
    public ResponseEntity<?> crearPersonas(@RequestBody Persona Persona){
    Persona personacreada = this.impl.crearPersona(Persona);
    return ResponseEntity.status(HttpStatus.CREATED).body(personacreada);
    }


    @PutMapping
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> modificarPersonas(@RequestBody Persona Persona){
    Persona modificarpersona = this.impl.modificarPersona(Persona);
    return ResponseEntity.status(HttpStatus.CREATED).body(modificarpersona);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> consultarPersona(@PathVariable int id){
    PersonaDto persona = this.impl.buscarPersona(id);
    return ResponseEntity.ok(persona);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPersonas(@PathVariable int id){
    this.impl.eliminarPersona(id);
    return ResponseEntity.ok().build();
    }
}
    
    


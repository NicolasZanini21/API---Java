package com.codigoprueba.pruebatrabajo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigoprueba.pruebatrabajo.DTOs.UsuarioDto;
import com.codigoprueba.pruebatrabajo.Entity.Usuario;
import com.codigoprueba.pruebatrabajo.ServiceImpl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioServiceImpl imple;

   

    @GetMapping
    public ResponseEntity<?> consultarTodosLosUsuarios(){
    List<UsuarioDto> usuarios= this.imple.consultarUsuarios();
    return ResponseEntity.ok(usuarios);
    }

    // @PostMapping("/Crear/CrearUsuarios")
    // @RequestMapping(value ="/Crear/CrearUsuarios", method = RequestMethod.POST)
    // public ResponseEntity<?> CrearUsuario(@RequestBody usuario usuario){
    // usuario usuariocreado = this.imple.CrearUsuario(usuario);
    // return ResponseEntity.status(HttpStatus.CREATED).body(usuariocreado);
    // }


    @PutMapping
    public ResponseEntity<?> modificarUsuarios(@RequestBody Usuario usuario){
    Usuario usuariomodificado = this.imple.modificarUsuario(usuario);
    return ResponseEntity.status(HttpStatus.CREATED).body(usuariomodificado);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> buscarUsuario(@PathVariable int id){
    UsuarioDto usuario = this.imple.buscarUsuario(id);
    return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable int id){
    this.imple.eliminarUsuario(id);
    return ResponseEntity.ok().build();
    }
    
    
}

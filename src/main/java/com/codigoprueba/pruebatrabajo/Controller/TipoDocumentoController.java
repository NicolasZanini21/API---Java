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

import com.codigoprueba.pruebatrabajo.DTOs.TipoDocumentoDto;
import com.codigoprueba.pruebatrabajo.Entity.TipoDocumento;
import com.codigoprueba.pruebatrabajo.ServiceImpl.TiposDocumentosServiceImpl;

@RestController
@RequestMapping("/tiposdocumentos")
public class TipoDocumentoController {
    
    @Autowired
    private TiposDocumentosServiceImpl implem;

    @GetMapping
    public ResponseEntity<?> consultarTiposDocumentos(){
    List<TipoDocumentoDto> tipodocumentos= this.implem.consultarTiposDocumentos();
    return ResponseEntity.ok(tipodocumentos);
    }

    @PostMapping
    public ResponseEntity<?> crearTiposDocumentos(@RequestBody TipoDocumento tipodocumento){
        TipoDocumento tipodocumentocreado = this.implem.crearTiposDocumentos(tipodocumento);
    return ResponseEntity.status(HttpStatus.CREATED).body(tipodocumentocreado);
    }


    @PutMapping
    public ResponseEntity<?> modificarTiposDocumentos(@RequestBody TipoDocumento tipodocumento){
        TipoDocumento modificartiposdocumentos = this.implem.modificarTiposDocumentos(tipodocumento);
    return ResponseEntity.status(HttpStatus.CREATED).body(modificartiposdocumentos);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> consultarTipoDocumento(@PathVariable int id){
        TipoDocumentoDto tipodocumento = this.implem.buscarTiposDocumentos(id);
    return ResponseEntity.ok(tipodocumento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTiposDocumentos(@PathVariable int id){
    this.implem.eliminarTiposDocumentos(id);
    return ResponseEntity.ok().build();
    }






}

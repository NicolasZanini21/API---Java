package com.codigoprueba.pruebatrabajo.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigoprueba.pruebatrabajo.DTOs.TipoDocumentoDto;
import com.codigoprueba.pruebatrabajo.Entity.TipoDocumento;
import com.codigoprueba.pruebatrabajo.Repository.TipoDocumentoRepo;
import com.codigoprueba.pruebatrabajo.Service.TiposDocumentosService;

@Service
public class TiposDocumentosServiceImpl implements TiposDocumentosService {

    @Autowired
    private TipoDocumentoRepo repo;

    

    @Override
    public List<TipoDocumentoDto> consultarTiposDocumentos(){
         Iterable<TipoDocumento> localidadIterable = repo.findAll();
        List<TipoDocumentoDto> tipoDocumentoDto = StreamSupport.stream(localidadIterable.spliterator(), false)
                .map(tipodocumento -> new TipoDocumentoDto(tipodocumento.getId(),tipodocumento.getNombre(), tipodocumento.getAbreviatura()))
                .collect(Collectors.toList());
        return tipoDocumentoDto;

    }


    @Override
    public TipoDocumentoDto buscarTiposDocumentos(int id) {
        
           Optional<TipoDocumento> tipodocumentoOptional = this.repo.findById(id);
        
        if (tipodocumentoOptional.isPresent()) {
            TipoDocumento tipoDocumento = tipodocumentoOptional.get();
            TipoDocumentoDto tipoDocumentoDto = new TipoDocumentoDto(tipoDocumento.getId(),tipoDocumento.getNombre(), tipoDocumento.getAbreviatura());
           
            
            return tipoDocumentoDto;
        }       else {
        
                        return null; 
                     }
         
        }
    

    @Override
    public TipoDocumento crearTiposDocumentos(TipoDocumento tipodocumento) {
        
        tipodocumento.setNombre(tipodocumento.getNombre());
        return this.repo.save(tipodocumento);
    }

    @Override
    public void eliminarTiposDocumentos(int id) {
        this.repo.deleteById(id);
        
        
    }

    @Override
    public TipoDocumento modificarTiposDocumentos(TipoDocumento tipodocumento) {
        
        return this.repo.save(tipodocumento);
    }

    
}

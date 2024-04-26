package com.codigoprueba.pruebatrabajo.Service;

import java.util.List;

import com.codigoprueba.pruebatrabajo.DTOs.TipoDocumentoDto;
import com.codigoprueba.pruebatrabajo.Entity.TipoDocumento;

public interface TiposDocumentosService {

    public List<TipoDocumentoDto> consultarTiposDocumentos();

    public TipoDocumento crearTiposDocumentos(TipoDocumento tipodocumento);

    public TipoDocumento modificarTiposDocumentos(TipoDocumento tipodocumento);

    public TipoDocumentoDto buscarTiposDocumentos(int id);

    public void eliminarTiposDocumentos(int id);

    
} 

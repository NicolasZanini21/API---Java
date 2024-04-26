package com.codigoprueba.pruebatrabajo.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codigoprueba.pruebatrabajo.DTOs.ProvinciaDto;
import com.codigoprueba.pruebatrabajo.Entity.Provincia;
import com.codigoprueba.pruebatrabajo.Repository.ProvinciaRepo;
import com.codigoprueba.pruebatrabajo.Service.ProvinciaService;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {
    
    @Autowired
    private ProvinciaRepo repo;

    @Override
    public List<ProvinciaDto> consultarProvincias(){
       Iterable<Provincia> provinciaIterable = repo.findAll();
        List<ProvinciaDto> provinciaDto = StreamSupport.stream(provinciaIterable.spliterator(), false)
                .map(provincia -> new ProvinciaDto(provincia.getId(),provincia.getNombre(), provincia.getRegion()))
                .collect(Collectors.toList());
        return provinciaDto;
    }
    


    @Override
    public ProvinciaDto buscarProvincia(int id) {
            Optional<Provincia> provinciaOptional = this.repo.findById(id);
        
            if (provinciaOptional.isPresent()) {
            Provincia provincia = provinciaOptional.get();
            ProvinciaDto provinciaDto = new ProvinciaDto(provincia.getId(),provincia.getNombre(), provincia.getRegion());
           
            
            return provinciaDto;
        }       else {
        
                        return null; 
                     }
         
        }
    

    @Override
    public Provincia crearProvincia(Provincia Provincia) {
        
        Provincia.setNombre(Provincia.getNombre());
        return this.repo.save(Provincia);
    }

    @Override
    public void eliminarProvincia(int id) {
        this.repo.deleteById(id);
        
        
    }

    @Override
    public Provincia modificarProvincia(Provincia Provincia) {
        
        return this.repo.save(Provincia);
}
}

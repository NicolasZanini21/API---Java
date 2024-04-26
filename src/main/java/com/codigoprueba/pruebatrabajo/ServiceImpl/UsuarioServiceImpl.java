package com.codigoprueba.pruebatrabajo.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codigoprueba.pruebatrabajo.DTOs.UsuarioDto;
import com.codigoprueba.pruebatrabajo.Entity.Usuario;
import com.codigoprueba.pruebatrabajo.Repository.UsuarioRepo;
import com.codigoprueba.pruebatrabajo.Service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepo repo;
    public UsuarioDto user;
    
     //  @Override
    //public List<Usuario> consultarUsuarios(){
    //return (List<Usuario>) this.repo.findAll();

    //}
    @Override
    public List<UsuarioDto> consultarUsuarios() {
        Iterable<Usuario> usuariosIterable = repo.findAll();
        List<UsuarioDto> usuariosDto = StreamSupport.stream(usuariosIterable.spliterator(), false)
                .map(usuario -> new UsuarioDto(usuario.getId(), usuario.getRole(), usuario.getNumeroDocumento()))
                .collect(Collectors.toList());
        return usuariosDto;
    }


    @Override
    public UsuarioDto buscarUsuario(int id) {
        Optional<Usuario> usuarioOptional = this.repo.findById(id);
        
        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            UsuarioDto usuarioDto = new UsuarioDto(usuario.getId(), usuario.getRole(), usuario.getNumeroDocumento());
           
            
            return usuarioDto;
        }       else {
        
                        return null; 
                     }
         
        }
  
    

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        
        usuario.setNombreUsuario(usuario.getNombreUsuario());
        return this.repo.save(usuario);
    }

    @Override
    public void eliminarUsuario(int id) {
        this.repo.deleteById(id);
        
        
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario) {
        
        return this.repo.save(usuario);
    }


}

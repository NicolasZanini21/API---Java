package com.codigoprueba.pruebatrabajo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.codigoprueba.pruebatrabajo.Entity.Usuario;
import java.util.Optional;


public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

}

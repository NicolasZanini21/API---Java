package com.codigoprueba.pruebatrabajo.Service;

import java.util.List;

import com.codigoprueba.pruebatrabajo.DTOs.UsuarioDto;
import com.codigoprueba.pruebatrabajo.Entity.Usuario;


public interface UsuarioService {

    public List<UsuarioDto> consultarUsuarios();

    public Usuario crearUsuario(Usuario usuario);

    public Usuario modificarUsuario(Usuario usuario);

    public UsuarioDto buscarUsuario(int id);

    public void eliminarUsuario(int id);

   
}

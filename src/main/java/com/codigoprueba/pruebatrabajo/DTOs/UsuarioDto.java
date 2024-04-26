package com.codigoprueba.pruebatrabajo.DTOs;

import com.codigoprueba.pruebatrabajo.user.Role;

public class UsuarioDto {
    private int id;
    private Role role;
    private int numeroDocumento;

    public UsuarioDto(int id, Role role, int numeroDocumento) {
        this.id = id;
        this.role = role;
        this.numeroDocumento = numeroDocumento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}

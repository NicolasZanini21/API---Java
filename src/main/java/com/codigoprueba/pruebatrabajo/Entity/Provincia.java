package com.codigoprueba.pruebatrabajo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "provincia")
public class Provincia {
    
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nombre", unique = true)
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Column(name = "region", unique = true)
    @Pattern(regexp = "^(NOA|NEA|CUY|PAM|GBA|PAT)$", message = "La región debe ser NOA, NEA, CUY, PAM, GBA o PAT")
    private String region;
    
}

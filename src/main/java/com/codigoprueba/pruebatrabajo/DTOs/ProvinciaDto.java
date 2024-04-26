package com.codigoprueba.pruebatrabajo.DTOs;

public class ProvinciaDto {
    public ProvinciaDto(int id, String nombre, String region) {
        this.id = id;
        this.nombre = nombre;
        this.region = region;
    }


    int id;
    String nombre;
    String region;

    
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
}

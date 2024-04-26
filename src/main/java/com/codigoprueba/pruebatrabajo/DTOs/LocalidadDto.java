package com.codigoprueba.pruebatrabajo.DTOs;

public class LocalidadDto {
    public LocalidadDto(int idLocalidad, String nombre, int idProvincia, String codigoPostal) {
        this.idLocalidad = idLocalidad;
        this.nombre = nombre;
        this.idProvincia = idProvincia;
        this.codigoPostal = codigoPostal;
    }
     int idLocalidad;
     String nombre;
     int idProvincia;
     String codigoPostal;
     
     public int getIdLocalidad() {
        return idLocalidad;
    }
    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getIdProvincia() {
        return idProvincia;
    }
    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
}

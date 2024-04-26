package com.codigoprueba.pruebatrabajo.DTOs;

public class PersonaDto {
    public PersonaDto(String nombreApellido, String fechaNacimiento,
            String genero, String nacionalidad, int idLocalidad, int codigoPostal) {
        this.nombreApellido = nombreApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.idLocalidad = idLocalidad;
        this.codigoPostal = codigoPostal;
    }



    String nombreApellido;
    String fechaNacimiento;
    String genero;
    String nacionalidad;
    String correoElectronico; 
    int idLocalidad;
    int codigoPostal;






    public String getNombreApellido() {
        return nombreApellido;
    }
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }
    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }
    public int getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
}

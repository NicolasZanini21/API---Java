package com.codigoprueba.pruebatrabajo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "localidad")
public class Localidad {
    
    @Id
    @Column(name = "idLocalidad")
    private int idLocalidad;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "idProvincia")
    private int idProvincia;

    @Column(name = "Codigo_postal")
    private String codigoPostal;

    public int getIdLocalidades() {
        return idLocalidad;
    }

    public void setIdLocalidades(int idLocalidad) {
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

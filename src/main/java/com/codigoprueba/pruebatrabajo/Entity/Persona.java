package com.codigoprueba.pruebatrabajo.Entity;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Pattern;


@Entity
@Table(name = "Persona")
public class Persona {
    
    @Id
    @Column(name = "idNumeroDocumento")
    private int idNumeroDocumento;

    @Column(name = "idTipoDocumento")
    private int idTipoDocumento;

     @Column(name = "nombreApellido", unique = true)
    private String nombreApellido;

     @Column(name = "fechaNacimiento")
     @Temporal(TemporalType.DATE)
    private String fechaNacimiento;

    @Column(name = "genero") 
    @Pattern(regexp = "^[MF]$", message = "El género debe ser M para masculino o F para femenino")
    private String genero;

     @Column(name = "nacionalidad")
    private String nacionalidad;

     @Column(name = "correoElectronico")
    private String correoElectronico; 

     @Column(name = "idLocalidad")
    private int idLocalidad;

     @Column(name = "codigoPostal")
    private int codigoPostal;

    public int getIdNumeroDocumento() {
        return idNumeroDocumento;
    }

    public void setIdNumeroDocumento(int idNumeroDocumento) {
        this.idNumeroDocumento = idNumeroDocumento;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

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

    public void setGenero(String Genero) {
        genero = Genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int id_Localidad) {
        this.idLocalidad = id_Localidad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal= codigoPostal;
    }
    
}

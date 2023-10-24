package com.api.facturas.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "clientes")
public class ClientesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false, columnDefinition = "BIGINT(20) UNSIGNED")
    private Long id_ciente;

    @Column(name = "nombre", nullable = false, columnDefinition = "VARCHAR(50)")
    private String nombre;
 
    @Column(name = "apellido", nullable = false, columnDefinition = "VARCHAR(50)")
    private String apellido;

    @Column(name = "telefono", nullable = false, columnDefinition = "VARCHAR(10)")
    private String telefono;

    @Column(name = "correo", nullable = false, columnDefinition = "VARCHAR(100)")
    private String correo;

    @Column(name = "domicilio", nullable = false, columnDefinition = "VARCHAR(50)")
    private String domicilio;

    @Column(name = "rfc", nullable = false, columnDefinition = "VARCHAR(13)")
    private String rfc;

    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    @Column(name = "actividad", nullable = false, columnDefinition = "VARCHAR(20)")
    private String actividad;


    //-------------------GETTERS & SETTERS-------------------------------------------S


    
    public ClientesModel() {
    }


    public ClientesModel(Long id_ciente) {
        this.id_ciente = id_ciente;
    }


    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return String return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return String return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return String return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return String return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return Date return the fecha_nacimiento
     */
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return String return the actividad
     */
    public String getActividad() {
        return actividad;
    }

    /**
     * @param actividad the actividad to set
     */
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }


    /**
     * @return Long return the id_ciente
     */
    public Long getId_ciente() {
        return id_ciente;
    }

    /**
     * @param id_ciente the id_ciente to set
     */
    public void setId_ciente(Long id_ciente) {
        this.id_ciente = id_ciente;
    }

}
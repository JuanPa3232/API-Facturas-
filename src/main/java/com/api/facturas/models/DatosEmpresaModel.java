package com.api.facturas.models;

import jakarta.persistence.*;

@Entity
@Table(name = "datos_empresa")
public class DatosEmpresaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa", nullable = false, columnDefinition = "BIGINT(20)")
    private Long id;

    @Column(name = "nombre", nullable = false, columnDefinition = "VARCHAR(100)")
    private String nombre;

    @Column(name = "telefono", nullable = false, columnDefinition = "VARCHAR(10)")
    private String telefono;

    @Column(name = "correo", nullable = false, columnDefinition = "VARCHAR(100)")
    private String correo;

    @Column(name = "domicilio", nullable = false, columnDefinition = "VARCHAR(100)")
    private String domicilio;

    @Column(name = "rfc", nullable = false, columnDefinition = "VARCHAR(13)")
    private String rfc;

//-----------------------------Getters & Setters-----------------------------------------

    public DatosEmpresaModel(Long id) {
        this.id = id;
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }
    

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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

}
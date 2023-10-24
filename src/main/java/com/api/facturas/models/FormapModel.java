package com.api.facturas.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formas_pago")
public class FormapModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_forma_pago", nullable = false, columnDefinition = "BIGINT(20) unsigned")
    private Long id;

    @Column(name = "nombre", nullable = false, columnDefinition = "VARCHAR(50)")
    private String nombre;

    @Column(name = "descripcion", nullable = false, columnDefinition = "VARCHAR(50)")
    private String descripcion;

//--------------------------Getters & Setters--------------------------

    public FormapModel(Long id) {
        this.id = id;
    }

    public FormapModel() {
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
     * @return String return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
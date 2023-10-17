package com.api.facturas.models;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class CategoriaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false, columnDefinition = "BIGINT(20) unsigned")
    private Long id;

    @Column(name = "nombre", nullable = false, columnDefinition = "VARCHAR(45)")
    private String nombre;

//------------------------Getters & Setters------------------------------------------------------

    public CategoriaModel(Long id) {
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

}
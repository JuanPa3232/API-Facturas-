package com.api.facturas.models;

import jakarta.persistence.*;;

@Entity
@Table(name = "metodos_pago")
public class MetodopModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo_pago", nullable = false, columnDefinition = "BIGINT(20) unsigned")
    private Long id;

    @Column(name = "descripcion", nullable = false, columnDefinition = "VARCHAR(50)")
    private String descripcion;

//------------------Getters & Setters------------------------------------------

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
     * @return String return the descipcion
     */
    public String getDescipcion() {
        return descripcion;
    }

    /**
     * @param descipcion the descipcion to set
     */
    public void setDescripcion(String descipcion) {
        this.descripcion = descipcion;
    }

}
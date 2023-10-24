package com.api.facturas.models;

import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class ProductosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false, columnDefinition = "BIGINT(20) unsigned")
    private Long id_producto;

    @Column(name = "descripcion", nullable = false, columnDefinition = "VARCHAR(100)")
    private String descripcion;

    @Column(name = "precio_unitario", nullable = false, columnDefinition = "DECIMAL(10,2) unsigned")
    private BigDecimal precio_unitario;

    @Column(name = "stock", nullable = false, columnDefinition = "INT(10) unsigned")
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    private CategoriaModel id_categoria;

//----------------------------Getters & Setters---------------------------------

    

    public ProductosModel() {
    }

    public ProductosModel(Long id_producto) {
        this.id_producto = id_producto;
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

    /**
     * @return BigDecimal return the precio_unitario
     */
    public BigDecimal getPrecio_unitario() {
        return precio_unitario;
    }

    /**
     * @param precio_unitario the precio_unitario to set
     */
    public void setPrecio_unitario(BigDecimal precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    /**
     * @return Integer return the stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * @return CategoriaModel return the id_categoria
     */
    public CategoriaModel getId_categoria() {
        return id_categoria;
    }

    /**
     * @param id_categoria the id_categoria to set
     */
    public void setId_categoria(CategoriaModel id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

}
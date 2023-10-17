package com.api.facturas.models;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "detalles")
public class DetallesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle", nullable = false, columnDefinition = "BIGINT(20) unsigned")
    private Long id_detalle;

    @Column(name = "cantidad", nullable = false, columnDefinition = "INT(10) unsigned")
    private Integer cantidad;

    @Column(name = "precio", nullable = false, columnDefinition = "DECIMAL(10,2) unsigned")
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = "id_factura", referencedColumnName = "id_factura")
    private FacturasModel id_factura;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private ProductosModel id;


//------------------Getters & Setters-----------------------------------

    public DetallesModel(Long id_detalle, FacturasModel id_factura, ProductosModel id) {
        this.id_detalle = id_detalle;
        this.id_factura = id_factura;
        this.id = id;
    }      

    /**
     * @return Long return the id_detalle
     */
    public Long getId_detalle() {
        return id_detalle;
    }

    /**
     * @param id_detalle the id_detalle to set
     */
    public void setId_detalle(Long id_detalle) {
        this.id_detalle = id_detalle;
    }

    /**
     * @return Integer return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return BigDecimal return the precio
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    /**
     * @return FacturasModel return the id_factura
     */
    public FacturasModel getId_factura() {
        return id_factura;
    }

    /**
     * @param id_factura the id_factura to set
     */
    public void setId_factura(FacturasModel id_factura) {
        this.id_factura = id_factura;
    }

    /**
     * @return ProductosModel return the id
     */
    public ProductosModel getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ProductosModel id) {
        this.id = id;
    }

}
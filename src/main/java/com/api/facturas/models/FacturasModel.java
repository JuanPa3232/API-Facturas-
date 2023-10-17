package com.api.facturas.models;

import java.util.Date;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.*;

@Entity
@Table(name = "factura")
public class FacturasModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura", nullable = false, columnDefinition = "BIGINT(20) unsigned")
    private Long id_factura;

    @Column(name = "fecha_emision", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @ColumnDefault("CURRENT_TIMESTAMP")
    private Date fecha_emision;

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private ClientesModel id;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    private DatosEmpresaModel id_empresa;

    @ManyToOne
    @JoinColumn(name = "id_forma_pago", referencedColumnName = "id_forma_pago")
    private FormapModel id_forma_pago;

    @ManyToOne
    @JoinColumn(name = "id_metodo_pago", referencedColumnName = "id_metodo_pago")
    private MetodopModel id_metodo_pago;

//----------------------------Getters & Setters--------------------------------

    
    

    /**
     * @return Long return the id_factura
     */
    public Long getId_factura() {
        return id_factura;
    }
    

    public FacturasModel(Long id_factura) {
        this.id_factura = id_factura;
    }


    public FacturasModel( ClientesModel id, DatosEmpresaModel id_empresa, FormapModel id_forma_pago,
            MetodopModel id_metodo_pago) {
        this.id = id;
        this.id_empresa = id_empresa;
        this.id_forma_pago = id_forma_pago;
        this.id_metodo_pago = id_metodo_pago;
    }

    /**
     * @param id_factura the id_factura to set
     */
    public void setId_factura(Long id_factura) {
        this.id_factura = id_factura;
    }

    /**
     * @return Date return the fecha_emision
     */
    public Date getFecha_emision() {
        return fecha_emision;
    }

    /**
     * @param fecha_emision the fecha_emision to set
     */
    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    /**
     * @return ClientesModel return the id
     */
    public ClientesModel getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ClientesModel id) {
        this.id = id;
    }

    /**
     * @return DatosEmpresaModel return the id_empresa
     */
    public DatosEmpresaModel getId_empresa() {
        return id_empresa;
    }

    /**
     * @param id_empresa the id_empresa to set
     */
    public void setId_empresa(DatosEmpresaModel id_empresa) {
        this.id_empresa = id_empresa;
    }

    /**
     * @return FormapModel return the id_forma_pago
     */
    public FormapModel getId_forma_pago() {
        return id_forma_pago;
    }

    /**
     * @param id_forma_pago the id_forma_pago to set
     */
    public void setId_forma_pago(FormapModel id_forma_pago) {
        this.id_forma_pago = id_forma_pago;
    }

    /**
     * @return MetodopModel return the id_metodo_pago
     */
    public MetodopModel getId_metodo_pago() {
        return id_metodo_pago;
    }

    /**
     * @param id_metodo_pago the id_metodo_pago to set
     */
    public void setId_metodo_pago(MetodopModel id_metodo_pago) {
        this.id_metodo_pago = id_metodo_pago;
    }

}
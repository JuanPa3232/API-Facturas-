package com.api.facturas.models;

import java.util.Date;
import java.util.List;

//import org.hibernate.annotations.ColumnDefault;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "factura")
public class FacturasModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura", nullable = false, columnDefinition = "BIGINT(20) unsigned")
    private Long id_factura;

    /**@Column(name = "fecha_emision", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @ColumnDefault("CURRENT_TIMESTAMP")
    private Date fecha_emision;*/

    @Column(name = "fecha_emision", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_emision;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private ClientesModel id_cliente;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    private DatosEmpresaModel id_empresa;

    @ManyToOne
    @JoinColumn(name = "id_forma_pago", referencedColumnName = "id_forma_pago")
    private FormapModel id_forma_pago;

    @ManyToOne
    @JoinColumn(name = "id_metodo_pago", referencedColumnName = "id_metodo_pago")
    private MetodopModel id_metodo_pago;

    @OneToMany(mappedBy = "id_factura", cascade = CascadeType.ALL)
    private List<DetallesModel> detalles;

//----------------------------Getters & Setters--------------------------------







    public FacturasModel() {
    }


    public FacturasModel(Long id_factura) {
        this.id_factura = id_factura;
    }


    public FacturasModel( ClientesModel id_cliente, DatosEmpresaModel id_empresa, FormapModel id_forma_pago,
            MetodopModel id_metodo_pago) {
        this.id_cliente = id_cliente;
        this.id_empresa = id_empresa;
        this.id_forma_pago = id_forma_pago;
        this.id_metodo_pago = id_metodo_pago;
    }

    


    /**
     * @return Long return the id_factura
     */
    public Long getId_factura() {
        return id_factura;
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

    

    public ClientesModel getId_cliente() {
        return id_cliente;
    }


    public void setId_cliente(ClientesModel id_cliente) {
        this.id_cliente = id_cliente;
    }


    public List<DetallesModel> getDetalles() {
        return detalles;
    }


    public void setDetalles(List<DetallesModel> detalles) {
        this.detalles = detalles;
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
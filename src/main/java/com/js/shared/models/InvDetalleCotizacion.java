/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.js.shared.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JADESOFT
 */
@Entity
@Table(name = "inv_detalle_cotizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvDetalleCotizacion.findAll", query = "SELECT i FROM InvDetalleCotizacion i")})
public class InvDetalleCotizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Column(name = "descuento")
    private Double descuento;
    @Column(name = "oferta")
    private Integer oferta;
    @Column(name = "itbis")
    private Double itbis;
    @Column(name = "total")
    private Double total;
    @Column(name = "seleccion")
    private Boolean seleccion;
    @Column(name = "cantidad")
    private Integer cantidad;
    @JoinColumn(name = "pedido_detalle", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvPedidoDetalle pedidoDetalle;
    @JoinColumn(name = "cotizacion", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvCotizacion cotizacion;

    public InvDetalleCotizacion() {
    }

    public InvDetalleCotizacion(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Integer getOferta() {
        return oferta;
    }

    public void setOferta(Integer oferta) {
        this.oferta = oferta;
    }

    public Double getItbis() {
        return itbis;
    }

    public void setItbis(Double itbis) {
        this.itbis = itbis;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Boolean seleccion) {
        this.seleccion = seleccion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public InvPedidoDetalle getPedidoDetalle() {
        return pedidoDetalle;
    }

    public void setPedidoDetalle(InvPedidoDetalle pedidoDetalle) {
        this.pedidoDetalle = pedidoDetalle;
    }

    public InvCotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(InvCotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvDetalleCotizacion)) {
            return false;
        }
        InvDetalleCotizacion other = (InvDetalleCotizacion) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvDetalleCotizacion[ codigo=" + codigo + " ]";
    }

}

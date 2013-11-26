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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JADESOFT
 */
@Entity
@Table(name = "inv_orden_compra_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvOrdenCompraDetalle.findAll", query = "SELECT i FROM InvOrdenCompraDetalle i")})
public class InvOrdenCompraDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Column(name = "descuento")
    private Double descuento;
    @Column(name = "itbis")
    private Double itbis;
    @Column(name = "oferta")
    private Integer oferta;
    @Column(name = "total")
    private Double total;
    @Column(name = "presentacion_articulo")
    private Integer presentacionArticulo;
    @JoinColumn(name = "orden_compra", referencedColumnName = "codigo")
    @ManyToOne
    private InvOrdenCompra ordenCompra;

    public InvOrdenCompraDetalle() {
    }

    public InvOrdenCompraDetalle(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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

    public Double getItbis() {
        return itbis;
    }

    public void setItbis(Double itbis) {
        this.itbis = itbis;
    }

    public Integer getOferta() {
        return oferta;
    }

    public void setOferta(Integer oferta) {
        this.oferta = oferta;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getPresentacionArticulo() {
        return presentacionArticulo;
    }

    public void setPresentacionArticulo(Integer presentacionArticulo) {
        this.presentacionArticulo = presentacionArticulo;
    }

    public InvOrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(InvOrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
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
        if (!(object instanceof InvOrdenCompraDetalle)) {
            return false;
        }
        InvOrdenCompraDetalle other = (InvOrdenCompraDetalle) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvOrdenCompraDetalle[ codigo=" + codigo + " ]";
    }

}

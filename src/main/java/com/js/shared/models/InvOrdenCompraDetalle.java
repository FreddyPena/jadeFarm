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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "descuento")
    private double descuento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "itbis")
    private double itbis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oferta")
    private int oferta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private double total;
    @JoinColumn(name = "articulo_presentacion", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvArticuloPresentacion articuloPresentacion;
    @JoinColumn(name = "orden_compra", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvOrdenCompra ordenCompra;

    public InvOrdenCompraDetalle() {
    }

    public InvOrdenCompraDetalle(Integer codigo) {
        this.codigo = codigo;
    }

    public InvOrdenCompraDetalle(Integer codigo, int cantidad, double precio, double descuento, double itbis, int oferta, double total) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.itbis = itbis;
        this.oferta = oferta;
        this.total = total;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getItbis() {
        return itbis;
    }

    public void setItbis(double itbis) {
        this.itbis = itbis;
    }

    public int getOferta() {
        return oferta;
    }

    public void setOferta(int oferta) {
        this.oferta = oferta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public InvArticuloPresentacion getArticuloPresentacion() {
        return articuloPresentacion;
    }

    public void setArticuloPresentacion(InvArticuloPresentacion articuloPresentacion) {
        this.articuloPresentacion = articuloPresentacion;
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

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
@Table(name = "inv_inventario_fisico_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvInventarioFisicoDetalle.findAll", query = "SELECT i FROM InvInventarioFisicoDetalle i")})
public class InvInventarioFisicoDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private double cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "almacen")
    private int almacen;
    @JoinColumn(name = "articulo_almacen", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvArticuloAlmacen articuloAlmacen;
    @JoinColumn(name = "inventario_fisico", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvInventarioFisico inventarioFisico;

    public InvInventarioFisicoDetalle() {
    }

    public InvInventarioFisicoDetalle(Integer codigo) {
        this.codigo = codigo;
    }

    public InvInventarioFisicoDetalle(Integer codigo, double cantidad, int almacen) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.almacen = almacen;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getAlmacen() {
        return almacen;
    }

    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }

    public InvArticuloAlmacen getArticuloAlmacen() {
        return articuloAlmacen;
    }

    public void setArticuloAlmacen(InvArticuloAlmacen articuloAlmacen) {
        this.articuloAlmacen = articuloAlmacen;
    }

    public InvInventarioFisico getInventarioFisico() {
        return inventarioFisico;
    }

    public void setInventarioFisico(InvInventarioFisico inventarioFisico) {
        this.inventarioFisico = inventarioFisico;
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
        if (!(object instanceof InvInventarioFisicoDetalle)) {
            return false;
        }
        InvInventarioFisicoDetalle other = (InvInventarioFisicoDetalle) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvInventarioFisicoDetalle[ codigo=" + codigo + " ]";
    }

}

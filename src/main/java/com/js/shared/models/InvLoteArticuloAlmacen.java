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
@Table(name = "inv_lote_articulo_almacen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvLoteArticuloAlmacen.findAll", query = "SELECT i FROM InvLoteArticuloAlmacen i")})
public class InvLoteArticuloAlmacen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @JoinColumn(name = "lote", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvLotes lote;
    @JoinColumn(name = "articulo_almacen", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvArticuloAlmacen articuloAlmacen;

    public InvLoteArticuloAlmacen() {
    }

    public InvLoteArticuloAlmacen(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public InvLotes getLote() {
        return lote;
    }

    public void setLote(InvLotes lote) {
        this.lote = lote;
    }

    public InvArticuloAlmacen getArticuloAlmacen() {
        return articuloAlmacen;
    }

    public void setArticuloAlmacen(InvArticuloAlmacen articuloAlmacen) {
        this.articuloAlmacen = articuloAlmacen;
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
        if (!(object instanceof InvLoteArticuloAlmacen)) {
            return false;
        }
        InvLoteArticuloAlmacen other = (InvLoteArticuloAlmacen) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvLoteArticuloAlmacen[ codigo=" + codigo + " ]";
    }

}

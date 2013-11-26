/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.js.shared.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author JADESOFT
 */
@Entity
@Table(name = "inv_articulo_almacen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvArticuloAlmacen.findAll", query = "SELECT i FROM InvArticuloAlmacen i")})
public class InvArticuloAlmacen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "existencia")
    private double existencia;
    @JoinColumn(name = "ubicacion", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvUbicacion ubicacion;
    @JoinColumn(name = "almacen", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvAlmacen almacen;
    @JoinColumn(name = "articulo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvArticulo articulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articuloAlmacen")
    private List<InvLoteArticuloAlmacen> invLoteArticuloAlmacenList;

    public InvArticuloAlmacen() {
    }

    public InvArticuloAlmacen(Integer codigo) {
        this.codigo = codigo;
    }

    public InvArticuloAlmacen(Integer codigo, double existencia) {
        this.codigo = codigo;
        this.existencia = existencia;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public InvUbicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(InvUbicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public InvAlmacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(InvAlmacen almacen) {
        this.almacen = almacen;
    }

    public InvArticulo getArticulo() {
        return articulo;
    }

    public void setArticulo(InvArticulo articulo) {
        this.articulo = articulo;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvLoteArticuloAlmacen> getInvLoteArticuloAlmacenList() {
        return invLoteArticuloAlmacenList;
    }

    public void setInvLoteArticuloAlmacenList(List<InvLoteArticuloAlmacen> invLoteArticuloAlmacenList) {
        this.invLoteArticuloAlmacenList = invLoteArticuloAlmacenList;
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
        if (!(object instanceof InvArticuloAlmacen)) {
            return false;
        }
        InvArticuloAlmacen other = (InvArticuloAlmacen) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvArticuloAlmacen[ codigo=" + codigo + " ]";
    }

}

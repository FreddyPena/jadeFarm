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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author JADESOFT
 */
@Entity
@Table(name = "inv_articulo_presentacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvArticuloPresentacion.findAll", query = "SELECT i FROM InvArticuloPresentacion i")})
public class InvArticuloPresentacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio1")
    private double precio1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio2")
    private double precio2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio3")
    private double precio3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pocentaje1")
    private double pocentaje1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentaje2")
    private double porcentaje2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentaje3")
    private double porcentaje3;
    @Size(max = 25)
    @Column(name = "barra")
    private String barra;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo")
    private Double costo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articuloPresentacion")
    private List<InvMovimientoDetalle> invMovimientoDetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "presentacionArticulo")
    private List<InvPedidoDetalle> invPedidoDetalleList;
    @JoinColumn(name = "presentacion", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvPresentacion presentacion;
    @JoinColumn(name = "articulo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvArticulo articulo;

    public InvArticuloPresentacion() {
    }

    public InvArticuloPresentacion(Integer codigo) {
        this.codigo = codigo;
    }

    public InvArticuloPresentacion(Integer codigo, double precio1, double precio2, double precio3, double pocentaje1, double porcentaje2, double porcentaje3) {
        this.codigo = codigo;
        this.precio1 = precio1;
        this.precio2 = precio2;
        this.precio3 = precio3;
        this.pocentaje1 = pocentaje1;
        this.porcentaje2 = porcentaje2;
        this.porcentaje3 = porcentaje3;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getPrecio1() {
        return precio1;
    }

    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }

    public double getPrecio2() {
        return precio2;
    }

    public void setPrecio2(double precio2) {
        this.precio2 = precio2;
    }

    public double getPrecio3() {
        return precio3;
    }

    public void setPrecio3(double precio3) {
        this.precio3 = precio3;
    }

    public double getPocentaje1() {
        return pocentaje1;
    }

    public void setPocentaje1(double pocentaje1) {
        this.pocentaje1 = pocentaje1;
    }

    public double getPorcentaje2() {
        return porcentaje2;
    }

    public void setPorcentaje2(double porcentaje2) {
        this.porcentaje2 = porcentaje2;
    }

    public double getPorcentaje3() {
        return porcentaje3;
    }

    public void setPorcentaje3(double porcentaje3) {
        this.porcentaje3 = porcentaje3;
    }

    public String getBarra() {
        return barra;
    }

    public void setBarra(String barra) {
        this.barra = barra;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvMovimientoDetalle> getInvMovimientoDetalleList() {
        return invMovimientoDetalleList;
    }

    public void setInvMovimientoDetalleList(List<InvMovimientoDetalle> invMovimientoDetalleList) {
        this.invMovimientoDetalleList = invMovimientoDetalleList;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvPedidoDetalle> getInvPedidoDetalleList() {
        return invPedidoDetalleList;
    }

    public void setInvPedidoDetalleList(List<InvPedidoDetalle> invPedidoDetalleList) {
        this.invPedidoDetalleList = invPedidoDetalleList;
    }

    public InvPresentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(InvPresentacion presentacion) {
        this.presentacion = presentacion;
    }

    public InvArticulo getArticulo() {
        return articulo;
    }

    public void setArticulo(InvArticulo articulo) {
        this.articulo = articulo;
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
        if (!(object instanceof InvArticuloPresentacion)) {
            return false;
        }
        InvArticuloPresentacion other = (InvArticuloPresentacion) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvArticuloPresentacion[ codigo=" + codigo + " ]";
    }

}

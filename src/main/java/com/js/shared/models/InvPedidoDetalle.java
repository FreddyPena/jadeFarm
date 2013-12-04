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
@Table(name = "inv_pedido_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvPedidoDetalle.findAll", query = "SELECT i FROM InvPedidoDetalle i")})
public class InvPedidoDetalle implements Serializable {
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoDetalle")
    private List<InvCotizacionDetalle> invCotizacionDetalleList;
    @JoinColumn(name = "presentacion_articulo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvArticuloPresentacion presentacionArticulo;
    @JoinColumn(name = "pedido", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvPedido pedido;

    public InvPedidoDetalle() {
    }

    public InvPedidoDetalle(Integer codigo) {
        this.codigo = codigo;
    }

    public InvPedidoDetalle(Integer codigo, double cantidad) {
        this.codigo = codigo;
        this.cantidad = cantidad;
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

    @XmlTransient
    @JsonIgnore
    public List<InvCotizacionDetalle> getInvCotizacionDetalleList() {
        return invCotizacionDetalleList;
    }

    public void setInvCotizacionDetalleList(List<InvCotizacionDetalle> invCotizacionDetalleList) {
        this.invCotizacionDetalleList = invCotizacionDetalleList;
    }

    public InvArticuloPresentacion getPresentacionArticulo() {
        return presentacionArticulo;
    }

    public void setPresentacionArticulo(InvArticuloPresentacion presentacionArticulo) {
        this.presentacionArticulo = presentacionArticulo;
    }

    public InvPedido getPedido() {
        return pedido;
    }

    public void setPedido(InvPedido pedido) {
        this.pedido = pedido;
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
        if (!(object instanceof InvPedidoDetalle)) {
            return false;
        }
        InvPedidoDetalle other = (InvPedidoDetalle) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvPedidoDetalle[ codigo=" + codigo + " ]";
    }

}

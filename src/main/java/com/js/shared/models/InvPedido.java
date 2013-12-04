/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.js.shared.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "inv_pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvPedido.findAll", query = "SELECT i FROM InvPedido i")})
public class InvPedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "solicitante")
    private Integer solicitante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "observacion")
    private String observacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    private List<InvCotizacion> invCotizacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    private List<InvPedidoDetalle> invPedidoDetalleList;

    public InvPedido() {
    }

    public InvPedido(Integer codigo) {
        this.codigo = codigo;
    }

    public InvPedido(Integer codigo, Date fecha, String observacion, String estado) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.observacion = observacion;
        this.estado = estado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Integer solicitante) {
        this.solicitante = solicitante;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvCotizacion> getInvCotizacionList() {
        return invCotizacionList;
    }

    public void setInvCotizacionList(List<InvCotizacion> invCotizacionList) {
        this.invCotizacionList = invCotizacionList;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvPedidoDetalle> getInvPedidoDetalleList() {
        return invPedidoDetalleList;
    }

    public void setInvPedidoDetalleList(List<InvPedidoDetalle> invPedidoDetalleList) {
        this.invPedidoDetalleList = invPedidoDetalleList;
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
        if (!(object instanceof InvPedido)) {
            return false;
        }
        InvPedido other = (InvPedido) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvPedido[ codigo=" + codigo + " ]";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.js.shared.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author JADESOFT
 */
@Entity
@Table(name = "inv_orden_compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvOrdenCompra.findAll", query = "SELECT i FROM InvOrdenCompra i")})
public class InvOrdenCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "fecha")
    private Integer fecha;
    @Column(name = "cotizacion")
    private Integer cotizacion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "condicion")
    private Integer condicion;
    @Size(max = 100)
    @Column(name = "forma_pago")
    private String formaPago;
    @Lob
    @Size(max = 65535)
    @Column(name = "observacion")
    private String observacion;
    @JoinColumn(name = "persona", referencedColumnName = "codigo")
    @ManyToOne
    private Persona persona;
    @OneToMany(mappedBy = "ordenCompra")
    private List<InvOrdenCompraDetalle> invOrdenCompraDetalleList;

    public InvOrdenCompra() {
    }

    public InvOrdenCompra(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public Integer getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Integer cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getCondicion() {
        return condicion;
    }

    public void setCondicion(Integer condicion) {
        this.condicion = condicion;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvOrdenCompraDetalle> getInvOrdenCompraDetalleList() {
        return invOrdenCompraDetalleList;
    }

    public void setInvOrdenCompraDetalleList(List<InvOrdenCompraDetalle> invOrdenCompraDetalleList) {
        this.invOrdenCompraDetalleList = invOrdenCompraDetalleList;
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
        if (!(object instanceof InvOrdenCompra)) {
            return false;
        }
        InvOrdenCompra other = (InvOrdenCompra) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvOrdenCompra[ codigo=" + codigo + " ]";
    }

}

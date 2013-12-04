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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author JADESOFT
 */
@Entity
@Table(name = "inv_lotes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvLotes.findAll", query = "SELECT i FROM InvLotes i")})
public class InvLotes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vencimiento")
    @Temporal(TemporalType.DATE)
    private Date vencimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private double cantidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lote")
    private List<InvLoteArticuloAlmacen> invLoteArticuloAlmacenList;

    public InvLotes() {
    }

    public InvLotes(Integer codigo) {
        this.codigo = codigo;
    }

    public InvLotes(Integer codigo, Date vencimiento, double cantidad) {
        this.codigo = codigo;
        this.vencimiento = vencimiento;
        this.cantidad = cantidad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
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
        if (!(object instanceof InvLotes)) {
            return false;
        }
        InvLotes other = (InvLotes) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvLotes[ codigo=" + codigo + " ]";
    }

}

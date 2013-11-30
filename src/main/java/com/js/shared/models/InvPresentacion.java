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
@Table(name = "inv_presentacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvPresentacion.findAll", query = "SELECT i FROM InvPresentacion i")})
public class InvPresentacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "factor")
    private double factor;
    @JoinColumn(name = "unidad", referencedColumnName = "codigo")
    @ManyToOne
    private InvUnidad unidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "presentacion")
    private List<InvArticuloPresentacion> invArticuloPresentacionList;

    public InvPresentacion() {
    }

    public InvPresentacion(Integer codigo) {
        this.codigo = codigo;
    }

    public InvPresentacion(Integer codigo, String descripcion, double factor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.factor = factor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public InvUnidad getUnidad() {
        return unidad;
    }

    public void setUnidad(InvUnidad unidad) {
        this.unidad = unidad;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvArticuloPresentacion> getInvArticuloPresentacionList() {
        return invArticuloPresentacionList;
    }

    public void setInvArticuloPresentacionList(List<InvArticuloPresentacion> invArticuloPresentacionList) {
        this.invArticuloPresentacionList = invArticuloPresentacionList;
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
        if (!(object instanceof InvPresentacion)) {
            return false;
        }
        InvPresentacion other = (InvPresentacion) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvPresentacion[ codigo=" + codigo + " ]";
    }

}

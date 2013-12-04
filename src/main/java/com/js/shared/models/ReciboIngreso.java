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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "recibo_ingreso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReciboIngreso.findAll", query = "SELECT r FROM ReciboIngreso r")})
public class ReciboIngreso implements Serializable {
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto")
    private double monto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "observacion")
    private String observacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reciboIngreso")
    private List<ReciboIngresoFormapago> reciboIngresoFormapagoList;
    @JoinColumn(name = "persona", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Persona persona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reciboIngreso")
    private List<ReciboIngresoDetalle> reciboIngresoDetalleList;

    public ReciboIngreso() {
    }

    public ReciboIngreso(Integer codigo) {
        this.codigo = codigo;
    }

    public ReciboIngreso(Integer codigo, Date fecha, double monto, boolean estado, String observacion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = estado;
        this.observacion = observacion;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @XmlTransient
    @JsonIgnore
    public List<ReciboIngresoFormapago> getReciboIngresoFormapagoList() {
        return reciboIngresoFormapagoList;
    }

    public void setReciboIngresoFormapagoList(List<ReciboIngresoFormapago> reciboIngresoFormapagoList) {
        this.reciboIngresoFormapagoList = reciboIngresoFormapagoList;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @XmlTransient
    @JsonIgnore
    public List<ReciboIngresoDetalle> getReciboIngresoDetalleList() {
        return reciboIngresoDetalleList;
    }

    public void setReciboIngresoDetalleList(List<ReciboIngresoDetalle> reciboIngresoDetalleList) {
        this.reciboIngresoDetalleList = reciboIngresoDetalleList;
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
        if (!(object instanceof ReciboIngreso)) {
            return false;
        }
        ReciboIngreso other = (ReciboIngreso) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.ReciboIngreso[ codigo=" + codigo + " ]";
    }

}

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
@Table(name = "recibo_ingreso_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReciboIngresoDetalle.findAll", query = "SELECT r FROM ReciboIngresoDetalle r")})
public class ReciboIngresoDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private double valor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pendiente")
    private Double pendiente;
    @JoinColumn(name = "recibo_ingreso", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private ReciboIngreso reciboIngreso;

    public ReciboIngresoDetalle() {
    }

    public ReciboIngresoDetalle(Integer codigo) {
        this.codigo = codigo;
    }

    public ReciboIngresoDetalle(Integer codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Double getPendiente() {
        return pendiente;
    }

    public void setPendiente(Double pendiente) {
        this.pendiente = pendiente;
    }

    public ReciboIngreso getReciboIngreso() {
        return reciboIngreso;
    }

    public void setReciboIngreso(ReciboIngreso reciboIngreso) {
        this.reciboIngreso = reciboIngreso;
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
        if (!(object instanceof ReciboIngresoDetalle)) {
            return false;
        }
        ReciboIngresoDetalle other = (ReciboIngresoDetalle) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.ReciboIngresoDetalle[ codigo=" + codigo + " ]";
    }

}

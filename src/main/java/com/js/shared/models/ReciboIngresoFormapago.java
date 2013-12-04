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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JADESOFT
 */
@Entity
@Table(name = "recibo_ingreso_formapago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReciboIngresoFormapago.findAll", query = "SELECT r FROM ReciboIngresoFormapago r")})
public class ReciboIngresoFormapago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Size(max = 45)
    @Column(name = "referencia")
    private String referencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private double valor;
    @JoinColumn(name = "forma_pago", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private FormaPago formaPago;
    @JoinColumn(name = "recibo_ingreso", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private ReciboIngreso reciboIngreso;

    public ReciboIngresoFormapago() {
    }

    public ReciboIngresoFormapago(Integer codigo) {
        this.codigo = codigo;
    }

    public ReciboIngresoFormapago(Integer codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
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
        if (!(object instanceof ReciboIngresoFormapago)) {
            return false;
        }
        ReciboIngresoFormapago other = (ReciboIngresoFormapago) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.ReciboIngresoFormapago[ codigo=" + codigo + " ]";
    }

}

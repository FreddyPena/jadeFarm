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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JADESOFT
 */
@Entity
@Table(name = "inv_movimiento_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvMovimientoDetalle.findAll", query = "SELECT i FROM InvMovimientoDetalle i")})
public class InvMovimientoDetalle implements Serializable {
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "descuento")
    private double descuento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "itbis1")
    private double itbis1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "itbis2")
    private double itbis2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo")
    private double costo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_movimiento")
    private char tipoMovimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "existencia")
    private double existencia;
    @JoinColumn(name = "moviento_articulo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvMovimiento movientoArticulo;
    @JoinColumn(name = "articulo_presentacion", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvArticuloPresentacion articuloPresentacion;

    public InvMovimientoDetalle() {
    }

    public InvMovimientoDetalle(Integer codigo) {
        this.codigo = codigo;
    }

    public InvMovimientoDetalle(Integer codigo, double cantidad, double precio, double descuento, double itbis1, double itbis2, double costo, char tipoMovimiento, double existencia) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.itbis1 = itbis1;
        this.itbis2 = itbis2;
        this.costo = costo;
        this.tipoMovimiento = tipoMovimiento;
        this.existencia = existencia;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getItbis1() {
        return itbis1;
    }

    public void setItbis1(double itbis1) {
        this.itbis1 = itbis1;
    }

    public double getItbis2() {
        return itbis2;
    }

    public void setItbis2(double itbis2) {
        this.itbis2 = itbis2;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public char getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(char tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public InvMovimiento getMovientoArticulo() {
        return movientoArticulo;
    }

    public void setMovientoArticulo(InvMovimiento movientoArticulo) {
        this.movientoArticulo = movientoArticulo;
    }

    public InvArticuloPresentacion getArticuloPresentacion() {
        return articuloPresentacion;
    }

    public void setArticuloPresentacion(InvArticuloPresentacion articuloPresentacion) {
        this.articuloPresentacion = articuloPresentacion;
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
        if (!(object instanceof InvMovimientoDetalle)) {
            return false;
        }
        InvMovimientoDetalle other = (InvMovimientoDetalle) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvMovimientoDetalle[ codigo=" + codigo + " ]";
    }

}

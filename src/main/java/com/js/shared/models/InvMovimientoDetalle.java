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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private Double cantidad;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "descuento")
    private Double descuento;
    @Column(name = "itbis1")
    private Double itbis1;
    @Column(name = "itbis2")
    private Double itbis2;
    @Column(name = "costo")
    private Double costo;
    @Column(name = "tipo_movimiento")
    private Character tipoMovimiento;
    @Column(name = "existencia")
    private Double existencia;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getItbis1() {
        return itbis1;
    }

    public void setItbis1(Double itbis1) {
        this.itbis1 = itbis1;
    }

    public Double getItbis2() {
        return itbis2;
    }

    public void setItbis2(Double itbis2) {
        this.itbis2 = itbis2;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Character getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(Character tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Double getExistencia() {
        return existencia;
    }

    public void setExistencia(Double existencia) {
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

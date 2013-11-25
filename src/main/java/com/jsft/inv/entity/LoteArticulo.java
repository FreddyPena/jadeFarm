/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author yiyi
 */
public class LoteArticulo implements Serializable {

    private Integer idLote;
    private Date fechaVencimiento;
    private ArticuloPresentacion presentacion;

    public LoteArticulo() {
    }

    public LoteArticulo(Integer idLote) {
        this.idLote = idLote;
    }

    public Integer getIdLote() {
        return idLote;
    }

    public void setIdLote(Integer idLote) {
        this.idLote = idLote;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public ArticuloPresentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(ArticuloPresentacion presentacion) {
        this.presentacion = presentacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idLote);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LoteArticulo other = (LoteArticulo) obj;
        if (!Objects.equals(this.idLote, other.idLote)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LoteArticulo{" + "idLote=" + idLote + '}';
    }
}

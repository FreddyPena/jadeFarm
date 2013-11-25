/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author yiyi
 */
public class Reorden implements Serializable {

    private Integer idReorden;
    private ArticuloPresentacion presentacion;
    private Almacen almacen;
    private Double reordenMin;
    private Double reordenMax;

    public Reorden() {
    }

    public Reorden(Integer idReorden) {
        this.idReorden = idReorden;
    }

    public Integer getIdReorden() {
        return idReorden;
    }

    public void setIdReorden(Integer idReorden) {
        this.idReorden = idReorden;
    }

    public ArticuloPresentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(ArticuloPresentacion presentacion) {
        this.presentacion = presentacion;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Double getReordenMin() {
        return reordenMin;
    }

    public void setReordenMin(Double reordenMin) {
        this.reordenMin = reordenMin;
    }

    public Double getReordenMax() {
        return reordenMax;
    }

    public void setReordenMax(Double reordenMax) {
        this.reordenMax = reordenMax;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.idReorden);
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
        final Reorden other = (Reorden) obj;
        if (!Objects.equals(this.idReorden, other.idReorden)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reorden{" + "idReorden=" + idReorden + '}';
    }
}

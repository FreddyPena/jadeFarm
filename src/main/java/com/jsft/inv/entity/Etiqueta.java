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
public class Etiqueta implements Serializable {

    private Integer idEtiqueta;
    private LoteArticulo lote;
    private Almacen almacen;
    private String codigoBarra;

    public Etiqueta() {
    }

    public Etiqueta(Integer idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    public Integer getIdEtiqueta() {
        return idEtiqueta;
    }

    public void setIdEtiqueta(Integer idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    
    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.idEtiqueta);
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
        final Etiqueta other = (Etiqueta) obj;
        if (!Objects.equals(this.idEtiqueta, other.idEtiqueta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Etiqueta{" + "idEtiqueta=" + idEtiqueta + '}';
    }

    public LoteArticulo getLote() {
        return lote;
    }

    public void setLote(LoteArticulo lote) {
        this.lote = lote;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
}

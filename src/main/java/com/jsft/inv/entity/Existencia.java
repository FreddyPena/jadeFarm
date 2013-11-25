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
public class Existencia implements Serializable {

    private Integer idExistencia;
    private Almacen almacen;
    private Double existenciaResultante;
    private ArticuloPresentacion idPresentacion;
    private Double aviso;
    private String tramo;
    private String fila;

    public Existencia() {
    }

    public Existencia(Integer idExistencia) {
        this.idExistencia = idExistencia;
    }

    public Integer getIdExistencia() {
        return idExistencia;
    }

    public void setIdExistencia(Integer idExistencia) {
        this.idExistencia = idExistencia;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Double getExistenciaResultante() {
        return existenciaResultante;
    }

    public void setExistenciaResultante(Double existenciaResultante) {
        this.existenciaResultante = existenciaResultante;
    }

    public ArticuloPresentacion getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(ArticuloPresentacion idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public Double getAviso() {
        return aviso;
    }

    public void setAviso(Double aviso) {
        this.aviso = aviso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idExistencia);
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
        final Existencia other = (Existencia) obj;
        if (!Objects.equals(this.idExistencia, other.idExistencia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Existencia{" + "idExistencia=" + idExistencia + '}';
    }

    public String getTramo() {
        return tramo;
    }

    public void setTramo(String tramo) {
        this.tramo = tramo;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.cont.entity;

import java.io.Serializable;

/**
 *
 * @author yiyi
 */
public class Ncf implements Serializable {

    private Integer codigo;
    private String descripcion;
    private String prefijo;
    private short tipo;
    private int secuenciaInicio;
    private int secuenciaFinal;
    private int secuenciaActual;

    public Ncf() {
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

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public int getSecuenciaInicio() {
        return secuenciaInicio;
    }

    public void setSecuenciaInicio(int secuenciaInicio) {
        this.secuenciaInicio = secuenciaInicio;
    }

    public int getSecuenciaFinal() {
        return secuenciaFinal;
    }

    public void setSecuenciaFinal(int secuenciaFinal) {
        this.secuenciaFinal = secuenciaFinal;
    }

    public int getSecuenciaActual() {
        return secuenciaActual;
    }

    public void setSecuenciaActual(int secuenciaActual) {
        this.secuenciaActual = secuenciaActual;
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
        if (!(object instanceof Ncf)) {
            return false;
        }
        Ncf other = (Ncf) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}

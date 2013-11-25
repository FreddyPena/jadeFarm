/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.ven.entity;

import java.util.Objects;

/**
 *
 * @author yiyi
 */
public class Aseguradora {

    private Integer codigo;
    private String descripcion;
    private Boolean cobertura;
    private String numCodigo;
    private String rnc;
    private String telefono;

    public Aseguradora() {
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

    public Boolean getCobertura() {
        return cobertura;
    }

    public void setCobertura(Boolean cobertura) {
        this.cobertura = cobertura;
    }

    public String getNumCodigo() {
        return numCodigo;
    }

    public void setNumCodigo(String numCodigo) {
        this.numCodigo = numCodigo;
    }

    public String getRnc() {
        return rnc;
    }

    public void setRnc(String rnc) {
        this.rnc = rnc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.codigo);
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
        final Aseguradora other = (Aseguradora) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}

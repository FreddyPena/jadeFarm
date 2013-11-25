/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.entity;

import java.util.Objects;

/**
 *
 * @author yiyi
 */

public class Familia {

    private Integer idFamilia;
    private String identificador;
    private String descripcion;

    public Familia() {
    }

    public Familia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.idFamilia);
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
        final Familia other = (Familia) obj;
        if (!Objects.equals(this.idFamilia, other.idFamilia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}

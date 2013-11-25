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
public class Almacen implements Serializable {

    private Integer idAlmacen;
    private String identificador;
    private String descripcion;
    private Boolean principal;
    private Boolean permiteVentas;

    public Almacen() {
    }

    public Almacen(Integer idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public Integer getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(Integer idAlmacen) {
        this.idAlmacen = idAlmacen;
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

    public Boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }

    public Boolean getPermiteVentas() {
        return permiteVentas;
    }

    public void setPermiteVentas(Boolean permiteVentas) {
        this.permiteVentas = permiteVentas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.idAlmacen);
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
        final Almacen other = (Almacen) obj;
        if (!Objects.equals(this.idAlmacen, other.idAlmacen)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}

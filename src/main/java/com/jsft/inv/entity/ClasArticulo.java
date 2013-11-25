/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.entity;

/**
 *
 * @author yiyi
 */

public class ClasArticulo {
 
    private Integer idClasArticulo;
    private String identificador;
    private String descripcion;

    public ClasArticulo() {
    }

    public ClasArticulo(Integer idClasArticulo) {
        this.idClasArticulo = idClasArticulo;
    }

    public Integer getIdClasArticulo() {
        return idClasArticulo;
    }

    public void setIdClasArticulo(Integer idClasArticulo) {
        this.idClasArticulo = idClasArticulo;
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
    public String toString() {
        return descripcion;
    }
}

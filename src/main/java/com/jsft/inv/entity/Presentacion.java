/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.entity;

import java.util.List;

/**
 *
 * @author Ing
 */

public class Presentacion {

    private Integer codigo;
    private String identificador;    
    private String descripcion;
    private double factor;
    private Unidad unidad;
    private List<ArticuloPresentacion> presentationList;

    public Presentacion() {
    }

    public Presentacion(Integer codigo) {
        this.codigo = codigo;
    }

    public Presentacion(Integer codigo, String descripcion, double factor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.factor = factor;
    }
    
     public List<ArticuloPresentacion> getPresentationList() {
        return presentationList;
    }

    public void setPresentationList(List<ArticuloPresentacion> presentationList) {
        this.presentationList = presentationList;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
}

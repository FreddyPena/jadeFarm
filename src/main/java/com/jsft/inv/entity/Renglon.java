/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.entity;

/**
 *
 * @author Ing
 */
public class Renglon {

    private Integer idRenglon;
    private String identificador;
    private String descripcion;
    private Boolean servicio;

    public Renglon() {
    }

    public Renglon(Integer idRenglon) {
        this.idRenglon = idRenglon;
    }

    public Integer getIdRenglon() {
        return idRenglon;
    }

    public void setIdRenglon(Integer idRenglon) {
        this.idRenglon = idRenglon;
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

    

    public Boolean getServicio() {
        return servicio;
    }

    public void setServicio(Boolean servicio) {
        this.servicio = servicio;
    }
    
}

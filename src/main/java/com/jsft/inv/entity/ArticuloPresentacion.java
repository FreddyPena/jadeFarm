/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.entity;

import java.util.List;

/**
 *
 * @author yiyi
 */

public class ArticuloPresentacion {

    private Integer codigo;
    private Double precio1;
    private Double precio2;
    private Double precio3;
    private Double porcentaje1;
    private Double porcentaje2;
    private Double porcentaje3;
    private String barra;
    private Double costo;
    private Articulo articulo;
    private Presentacion presentacion;
    private List<Articulo> itemList;
    private List<Presentacion> presentationList;
    
    
    
    public ArticuloPresentacion() {
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    
    public Presentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }

    @Override
    public String toString() {
        return articulo.toString();
    }

    public ArticuloPresentacion(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPrecio1() {
        return precio1;
    }

    public void setPrecio1(Double precio1) {
        this.precio1 = precio1;
    }

    public Double getPrecio2() {
        return precio2;
    }

    public void setPrecio2(Double precio2) {
        this.precio2 = precio2;
    }

    public Double getPrecio3() {
        return precio3;
    }

    public void setPrecio3(Double precio3) {
        this.precio3 = precio3;
    }

    public Double getPorcentaje1() {
        return porcentaje1;
    }

    public void setPorcentaje1(Double pocentaje1) {
        this.porcentaje1 = pocentaje1;
    }

    public Double getPorcentaje2() {
        return porcentaje2;
    }

    public void setPorcentaje2(Double porcentaje2) {
        this.porcentaje2 = porcentaje2;
    }

    public Double getPorcentaje3() {
        return porcentaje3;
    }

    public void setPorcentaje3(Double porcentaje3) {
        this.porcentaje3 = porcentaje3;
    }

    public String getBarra() {
        return barra;
    }

    public void setBarra(String barra) {
        this.barra = barra;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
    public List<Articulo> getItemList() {
        return itemList;
    }

    public void setItemList(List<Articulo> itemList) {
        this.itemList = itemList;
    }

    public List<Presentacion> getPresentationList() {
        return presentationList;
    }

    public void setPresentationList(List<Presentacion> presentationList) {
        this.presentationList = presentationList;
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
        if (!(object instanceof ArticuloPresentacion)) {
            return false;
        }
        ArticuloPresentacion other = (ArticuloPresentacion) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

}

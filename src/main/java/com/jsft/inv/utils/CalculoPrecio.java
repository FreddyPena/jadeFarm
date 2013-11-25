/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.utils;

/**
 *
 * @author Ing
 */
public enum CalculoPrecio {
    
    MARGEN_BENEFICIO("1"), PRECIO_DIRECTO("2");
    private String calculoPrecio;

    public String getCalculoPrecio() {
        return calculoPrecio;
    }

    private CalculoPrecio(String calculoPrecio) {
        this.calculoPrecio = calculoPrecio;
    }
    
   
    
}
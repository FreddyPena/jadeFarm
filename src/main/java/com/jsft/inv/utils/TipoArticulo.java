/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.utils;

/**
 *
 * @author yiyi
 */
public enum TipoArticulo {

    FISICO(1), SERVICIO(2), OCACIONAL(3);
    private final Integer tipoArticulo;

    private TipoArticulo(Integer tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public Integer getTipoArticulo() {
        return tipoArticulo;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.utils;

/**
 *
 * @author yiyi
 */
public enum TipoCodigoBarra {

    GENERAL(1);
    private final Integer tipoCB;

    private TipoCodigoBarra(Integer tipoCB) {
        this.tipoCB = tipoCB;
    }

    public Integer getTipoCB() {
        return tipoCB;
    }
}

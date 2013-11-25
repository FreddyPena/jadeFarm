/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.sys.utiles.enums;

/**
 *
 * @author yiyi
 */
public enum TipoRol {

    ADMINISTRADOR(1), ADM_FACTURACION(2), FACTURADOR(3);
    private Integer tipoRol;

    private TipoRol(Integer tipoRol) {
        this.tipoRol = tipoRol;
    }

    public Integer getTipoRol() {
        return tipoRol;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

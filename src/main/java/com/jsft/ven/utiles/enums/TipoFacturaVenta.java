/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.ven.utiles.enums;

/**
 *
 * @author yiyi
 */
public enum TipoFacturaVenta {

    CONTADO(1), CREDITO(2);
    private Integer tipoFactura;

    private TipoFacturaVenta(Integer tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public Integer getTipoFacturaVenta() {
        return tipoFactura;
    }
}

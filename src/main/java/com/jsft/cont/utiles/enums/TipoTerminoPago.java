/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.cont.utiles.enums;

/**
 *
 * @author yiyi
 */
public enum TipoTerminoPago {

    NINGUNO(0), PAGO_INMEDIATO(1), PORCENTAJE_INICIAL(2), MONTO_INICIAL(3), CUOTA(4), CREDITO_DIAS(5);
    private Integer tipoTerminoPago;

    private TipoTerminoPago(Integer tipoTerminoPago) {
        this.tipoTerminoPago = tipoTerminoPago;
    }

    public Integer getTipoTerminoPago() {
        return tipoTerminoPago;
    }
}

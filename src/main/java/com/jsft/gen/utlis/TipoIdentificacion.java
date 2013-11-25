/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.gen.utlis;

/**
 *
 * @author Hector Ventura
 */
public enum TipoIdentificacion {

    RNC(1), CEDULA(2), PASAPORTE(3);
    private int tipoIdentificacion;

    public int getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    private TipoIdentificacion(int tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    @Override
    public String toString() {
        switch (tipoIdentificacion) {
            case 1:
                return "RNC";
            case 2:
                return "CEDULA";
            case 3:
                return "PASAPORTE";
            default:
                return "";
        }
    }
    
}

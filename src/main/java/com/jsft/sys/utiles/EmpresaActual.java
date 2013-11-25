/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.sys.utiles;

import com.jsft.sys.entity.Empresa;

/**
 *
 * @author yiyi
 */
public class EmpresaActual {
    private static Empresa empresa;

    public static Empresa getEmpresa() {
        return empresa;
    }

    public static void setEmpresa(Empresa empresa) {
       EmpresaActual.empresa = empresa;
    }
    
    
}

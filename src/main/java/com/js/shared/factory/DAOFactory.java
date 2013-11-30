/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.shared.factory;

import com.jadesoft.jadelib.displacement.DisplacementObject;
import com.jadesoft.jadelib.generales.KeyEventDespachador;
import com.js.inv.controllers.ClasArticuloController;
import com.js.inv.controllers.FamiliaController;
import com.js.inv.controllers.MarcaController;

/**
 *
 * @author JADESOFT
 */
public abstract class DAOFactory {

    private static DAOFactory instance;

    protected DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return DAOFactory.instance;
    }

    public static void setInstance(DAOFactory factory) {
        if (DAOFactory.instance == null) {
            DAOFactory.instance = factory;
        }
    }

    //Controllers
    public abstract FamiliaController getFamiliaController();

    public abstract MarcaController getMarcaController();

    public abstract ClasArticuloController getClasArticuloController();

    //Clase JADESOFT
    public abstract KeyEventDespachador getKeyEventDespachador();

    public abstract DisplacementObject getDisplacement();

}

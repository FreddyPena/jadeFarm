/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.shared.factory;

import com.js.controller.displacement.Displacement;
import com.js.inv.controllers.AlmacenController;
import com.js.inv.controllers.ArticuloController;
import com.js.inv.controllers.ClasArticuloController;
import com.js.inv.controllers.FamiliaController;
import com.js.inv.controllers.IngrActivoController;
import com.js.inv.controllers.MarcaController;
import com.js.inv.controllers.PresentacionController;
import com.js.inv.controllers.RenglonController;
import com.js.inv.controllers.UnidadController;

/**
 *
 * @author JADESOFT
 */
public abstract class FactoryObject {

    private static FactoryObject instance;

    protected FactoryObject() {
    }

    public static FactoryObject getInstance() {
        return FactoryObject.instance;
    }

    public static void setInstance(FactoryObject factory) {
        if (FactoryObject.instance == null) {
            FactoryObject.instance = factory;
        }
    }

    //Controllers
    public abstract FamiliaController getFamiliaController();

    public abstract MarcaController getMarcaController();

    public abstract ClasArticuloController getClasArticuloController();

    public abstract RenglonController getRenglonController();

    public abstract AlmacenController getAlmacenController();

    public abstract UnidadController getUnidadController();

    public abstract IngrActivoController getIngrActivoController();

    public abstract PresentacionController getPresentacionController();

    public abstract ArticuloController getArticuloController();

    //Clase JADESOFT    

    public abstract Displacement getDisplacement();

}

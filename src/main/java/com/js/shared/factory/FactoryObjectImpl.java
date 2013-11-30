/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.shared.factory;

import com.jadesoft.jadelib.displacement.DisplacementObject;
import com.jadesoft.jadelib.generales.KeyEventDespachador;
import com.js.inv.controllers.AlmacenController;
import com.js.inv.controllers.ClasArticuloController;
import com.js.inv.controllers.FamiliaController;
import com.js.inv.controllers.MarcaController;
import com.js.inv.controllers.RenglonController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author JADESOFT
 */
public class FactoryObjectImpl extends FactoryObject {

    private final ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    //Controllers
    @Override
    public FamiliaController getFamiliaController() {
        return this.context.getBean(FamiliaController.class);
    }

    @Override
    public MarcaController getMarcaController() {
        return this.context.getBean(MarcaController.class);
    }

    @Override
    public ClasArticuloController getClasArticuloController() {
        return this.context.getBean(ClasArticuloController.class);
    }

    @Override
    public RenglonController getRenglonController() {
        return this.context.getBean(RenglonController.class);
    }

    @Override
    public AlmacenController getAlmacenController() {
        return this.context.getBean(AlmacenController.class);
    }

    //Clase JADESOFT
    @Override
    public KeyEventDespachador getKeyEventDespachador() {
        return this.context.getBean(KeyEventDespachador.class);
    }

    @Override
    public DisplacementObject getDisplacement() {
        return this.context.getBean(DisplacementObject.class);
    }

}

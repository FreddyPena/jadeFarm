/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.shared.factory;

import com.jadesoft.jadelib.displacement.DisplacementObject;
import com.jadesoft.jadelib.generales.KeyEventDespachador;
import com.js.inv.controllers.FamiliaController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author JADESOFT
 */
public class DAOFactoryImpl extends DAOFactory {

    private final ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    //Controllers
    @Override
    public FamiliaController getFamiliaController() {
        return this.context.getBean(FamiliaController.class);
    }

    //Clase JADESOFT
    @Override
    public KeyEventDespachador getKeyEventDespachador() {
        return this.context.getBean(KeyEventDespachador.class);
    }

    @Override
    public DisplacementObject getDisplacementObject() {
        return this.context.getBean(DisplacementObject.class);
    }
}

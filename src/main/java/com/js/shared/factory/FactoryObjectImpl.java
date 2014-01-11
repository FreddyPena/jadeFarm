/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.shared.factory;

import com.js.controller.displacement.Displacement;
import com.js.controller.displacement.DisplacementObject;
import com.js.inv.controllers.AlmacenController;
import com.js.inv.controllers.ArticuloController;
import com.js.inv.controllers.ClasArticuloController;
import com.js.inv.controllers.FamiliaController;
import com.js.inv.controllers.IngrActivoController;
import com.js.inv.controllers.MarcaController;
import com.js.inv.controllers.PresentacionController;
import com.js.inv.controllers.RenglonController;
import com.js.inv.controllers.UnidadController;
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

    @Override
    public UnidadController getUnidadController() {
        return this.context.getBean(UnidadController.class);
    }

    @Override
    public IngrActivoController getIngrActivoController() {
        return this.context.getBean(IngrActivoController.class);
    }

    @Override
    public PresentacionController getPresentacionController() {
        return this.context.getBean(PresentacionController.class);
    }

    @Override
    public ArticuloController getArticuloController() {
        return this.context.getBean(ArticuloController.class);
    }

    //Clase JADESOFT
    @Override
    public Displacement getDisplacement() {
        return this.context.getBean(DisplacementObject.class);
    }

}

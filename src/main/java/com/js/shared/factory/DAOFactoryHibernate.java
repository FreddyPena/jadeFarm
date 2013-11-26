/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.shared.factory;

import com.js.inv.controllers.FamiliaController;


/**
 *
 * @author JADESOFT
 */
public class DAOFactoryHibernate extends DAOFactory {

    @Override
    public FamiliaController getFamiliaController() {
        return context.getBean(FamiliaController.class);
    }

}

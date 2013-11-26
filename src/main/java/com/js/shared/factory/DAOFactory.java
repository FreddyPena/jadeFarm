/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.shared.factory;

import com.js.inv.controllers.FamiliaController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author JADESOFT
 */
public abstract class DAOFactory {

    protected ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
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

    public abstract FamiliaController getFamiliaController();

}

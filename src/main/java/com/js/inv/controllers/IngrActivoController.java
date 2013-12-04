/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.controllers;

import com.js.exception.BussinessException;
import com.js.inv.dao.interfaces.IngrActivoDAO;
import com.js.shared.models.InvIngredienteActivo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author JADESOFT
 */
@Controller
public class IngrActivoController implements IngrActivoDAO {

    @Autowired
    IngrActivoDAO ingrActivoDAO;

    @Override
    public InvIngredienteActivo create() throws BussinessException {
        return ingrActivoDAO.create();
    }

    @Override
    public void saveOrUpdate(InvIngredienteActivo entity) throws BussinessException {
        ingrActivoDAO.saveOrUpdate(entity);
    }

    @Override
    public InvIngredienteActivo get(Integer id) throws BussinessException {
        return ingrActivoDAO.get(id);
    }

    @Override
    public void delete(Integer id) throws BussinessException {
        ingrActivoDAO.delete(id);
    }

    @Override
    public List<InvIngredienteActivo> findAll() throws BussinessException {
        return ingrActivoDAO.findAll();
    }

}

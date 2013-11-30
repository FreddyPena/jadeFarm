/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.controllers;

import com.jadesoft.jadedao.exception.BussinessException;
import com.js.inv.persistences.interfaces.ClasArticuloDAO;
import com.js.shared.models.InvClasificacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author JADESOFT
 */
@Controller
public class ClasArticuloController implements ClasArticuloDAO {

    @Autowired
    ClasArticuloDAO clasArticuloDAO;

    @Override
    public InvClasificacion create() throws BussinessException {
        return clasArticuloDAO.create();
    }

    @Override
    public void saveOrUpdate(InvClasificacion entity) throws BussinessException {
        clasArticuloDAO.saveOrUpdate(entity);
    }

    @Override
    public InvClasificacion get(Integer id) throws BussinessException {
        return clasArticuloDAO.get(id);
    }

    @Override
    public void delete(Integer id) throws BussinessException {
        clasArticuloDAO.delete(id);
    }

    @Override
    public List<InvClasificacion> findAll() throws BussinessException {
        return clasArticuloDAO.findAll();
    }

}

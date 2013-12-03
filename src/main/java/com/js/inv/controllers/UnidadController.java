/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.controllers;

import com.jadesoft.jadedao.exception.BussinessException;
import com.js.inv.dao.interfaces.UnidadDAO;
import com.js.shared.models.InvUnidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author JADESOFT
 */
@Controller
public class UnidadController implements UnidadDAO {

    @Autowired
    UnidadDAO unidadDAO;

    @Override
    public InvUnidad create() throws BussinessException {
        return unidadDAO.create();
    }

    @Override
    public void saveOrUpdate(InvUnidad entity) throws BussinessException {
        unidadDAO.saveOrUpdate(entity);
    }

    @Override
    public InvUnidad get(Integer id) throws BussinessException {
        return unidadDAO.get(id);
    }

    @Override
    public void delete(Integer id) throws BussinessException {
        unidadDAO.delete(id);
    }

    @Override
    public List<InvUnidad> findAll() throws BussinessException {
        return unidadDAO.findAll();
    }

    @Override
    public InvUnidad find(String str) throws BussinessException {
        return unidadDAO.find(str);
    }

}

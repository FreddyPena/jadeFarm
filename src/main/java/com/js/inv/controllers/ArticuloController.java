/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.controllers;

import com.js.exception.BussinessException;
import com.js.inv.dao.interfaces.ArticuloDAO;
import com.js.shared.models.InvArticulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author JADESOFT
 */
@Controller
public class ArticuloController implements ArticuloDAO {

    @Autowired
    ArticuloDAO articuloDAO;

    @Override
    public InvArticulo create() throws BussinessException {
        return articuloDAO.create();
    }

    @Override
    public void saveOrUpdate(InvArticulo entity) throws BussinessException {
        articuloDAO.saveOrUpdate(entity);
    }

    @Override
    public InvArticulo get(Integer id) throws BussinessException {
        return articuloDAO.get(id);
    }

    @Override
    public void delete(Integer id) throws BussinessException {
        articuloDAO.delete(id);
    }

    @Override
    public List<InvArticulo> findAll() throws BussinessException {
        return articuloDAO.findAll();
    }

}

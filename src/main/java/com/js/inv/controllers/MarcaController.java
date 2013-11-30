/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.controllers;

import com.jadesoft.jadedao.exception.BussinessException;
import com.js.inv.persistences.interfaces.MarcaDAO;
import com.js.shared.models.InvMarca;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author JADESOFT
 */
@Controller
public class MarcaController implements MarcaDAO {

    @Autowired
    MarcaDAO marcaDAO;

    @Override
    public InvMarca create() throws BussinessException {
        return marcaDAO.create();
    }

    @Override
    public void saveOrUpdate(InvMarca entity) throws BussinessException {
        marcaDAO.saveOrUpdate(entity);
    }

    @Override
    public InvMarca get(Integer id) throws BussinessException {
        return marcaDAO.get(id);
    }

    @Override
    public void delete(Integer id) throws BussinessException {
        marcaDAO.delete(id);
    }

    @Override
    public List<InvMarca> findAll() throws BussinessException {
        return marcaDAO.findAll();
    }

}

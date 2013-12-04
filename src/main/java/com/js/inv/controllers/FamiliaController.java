/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.controllers;

import com.js.exception.BussinessException;
import com.js.inv.dao.interfaces.FamiliaDAO;
import com.js.shared.models.InvFamilia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author JADESOFT
 */
@Controller
public class FamiliaController implements FamiliaDAO {

    @Autowired
    FamiliaDAO familiaDAO;

    @Override
    public InvFamilia create() throws BussinessException {
        return familiaDAO.create();
    }

    @Override
    public void saveOrUpdate(InvFamilia entity) throws BussinessException {
        familiaDAO.saveOrUpdate(entity);
    }

    @Override
    public InvFamilia get(Integer id) throws BussinessException {
        return familiaDAO.get(id);
    }

    @Override
    public void delete(Integer id) throws BussinessException {
        familiaDAO.delete(id);
    }

    @Override
    public List<InvFamilia> findAll() throws BussinessException {
        return familiaDAO.findAll();
    }

}

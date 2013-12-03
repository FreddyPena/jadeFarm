/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.controllers;

import com.jadesoft.jadedao.exception.BussinessException;
import com.js.inv.dao.interfaces.PresentacionDAO;
import com.js.shared.models.InvPresentacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author JADESOFT
 */
@Controller
public class PresentacionController implements PresentacionDAO {

    @Autowired
    PresentacionDAO presentacionDAO;

    @Override
    public InvPresentacion create() throws BussinessException {
        return presentacionDAO.create();
    }

    @Override
    public void saveOrUpdate(InvPresentacion entity) throws BussinessException {
        presentacionDAO.saveOrUpdate(entity);
    }

    @Override
    public InvPresentacion get(Integer id) throws BussinessException {
        return presentacionDAO.get(id);
    }

    @Override
    public void delete(Integer id) throws BussinessException {
        presentacionDAO.delete(id);
    }

    @Override
    public List<InvPresentacion> findAll() throws BussinessException {
        return presentacionDAO.findAll();
    }

}

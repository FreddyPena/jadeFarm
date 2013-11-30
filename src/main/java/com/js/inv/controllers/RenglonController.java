/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.controllers;

import com.jadesoft.jadedao.exception.BussinessException;
import com.js.inv.persistences.interfaces.RenglonDAO;
import com.js.shared.models.InvRenglon;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author JADESOFT
 */
@Controller
public class RenglonController implements RenglonDAO {

    @Autowired
    RenglonDAO renglonDAO;

    @Override
    public InvRenglon create() throws BussinessException {
        return renglonDAO.create();
    }

    @Override
    public void saveOrUpdate(InvRenglon entity) throws BussinessException {
        renglonDAO.saveOrUpdate(entity);
    }

    @Override
    public InvRenglon get(Integer id) throws BussinessException {
        return renglonDAO.get(id);
    }

    @Override
    public void delete(Integer id) throws BussinessException {
        renglonDAO.delete(id);
    }

    @Override
    public List<InvRenglon> findAll() throws BussinessException {
        return renglonDAO.findAll();
    }

}

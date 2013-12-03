/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.controllers;

import com.jadesoft.jadedao.exception.BussinessException;
import com.js.inv.dao.interfaces.AlmacenDAO;
import com.js.shared.models.InvAlmacen;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author JADESOFT
 */
@Controller
public class AlmacenController implements AlmacenDAO {

    @Autowired
    AlmacenDAO almacenDAO;

    @Override
    public InvAlmacen create() throws BussinessException {
        return almacenDAO.create();
    }

    @Override
    public void saveOrUpdate(InvAlmacen entity) throws BussinessException {
        almacenDAO.saveOrUpdate(entity);
    }

    @Override
    public InvAlmacen get(Integer id) throws BussinessException {
        return almacenDAO.get(id);
    }

    @Override
    public void delete(Integer id) throws BussinessException {
        almacenDAO.delete(id);
    }

    @Override
    public List<InvAlmacen> findAll() throws BussinessException {
        return almacenDAO.findAll();
    }

}

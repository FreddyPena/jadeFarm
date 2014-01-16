/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.dao.interfaces;

import com.js.GenericDAO;
import com.js.exception.BussinessException;
import com.js.shared.models.InvArticulo;
import com.js.shared.models.InvArticuloPresentacion;
import java.util.List;

/**
 *
 * @author JADESOFT
 */
public interface ArticuloDAO extends GenericDAO<InvArticulo, Integer> {

    List<InvArticuloPresentacion> lArticuloPresentacions(InvArticulo articulo) throws BussinessException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.dao.interfaces;

import com.jadesoft.jadedao.GenericDAO;
import com.jadesoft.jadedao.exception.BussinessException;
import com.js.shared.models.InvUnidad;

/**
 *
 * @author JADESOFT
 */
public interface UnidadDAO extends GenericDAO<InvUnidad, Integer> {

    InvUnidad find(String str) throws BussinessException;
}

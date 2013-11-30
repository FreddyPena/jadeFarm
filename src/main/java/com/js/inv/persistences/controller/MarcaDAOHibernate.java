/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.js.inv.persistences.controller;

import com.jadesoft.jadedao.GenericDAOHibernate;
import com.js.inv.persistences.interfaces.MarcaDAO;
import com.js.shared.models.InvMarca;

/**
 *
 * @author JADESOFT
 */
public class MarcaDAOHibernate extends GenericDAOHibernate<InvMarca, Integer> implements MarcaDAO{


}

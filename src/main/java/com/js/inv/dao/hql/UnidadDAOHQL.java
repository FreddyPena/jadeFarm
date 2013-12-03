/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.dao.hql;

import com.jadesoft.jadedao.GenericDAOHQL;
import com.jadesoft.jadedao.exception.BussinessException;
import com.js.inv.dao.interfaces.UnidadDAO;
import com.js.shared.models.InvUnidad;
import java.util.logging.Level;
import org.hibernate.Session;

/**
 *
 * @author JADESOFT
 */
public class UnidadDAOHQL extends GenericDAOHQL<InvUnidad, Integer> implements UnidadDAO {

    @Override
    public InvUnidad find(String str) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            String query = "FROM InvUnidad WHERE identificador = '%s'";
            InvUnidad entity = (InvUnidad) session.createQuery(String.format(query, str)).uniqueResult();
            session.getTransaction().commit();
            return entity;
        } catch (javax.validation.ConstraintViolationException | org.hibernate.exception.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new BussinessException(cve);
        } catch (RuntimeException ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw ex;
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new RuntimeException(ex);
        }
    }

}

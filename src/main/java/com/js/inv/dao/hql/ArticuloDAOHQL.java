/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.dao.hql;

import com.js.GenericDAOHQL;
import com.js.exception.BussinessException;
import com.js.inv.dao.interfaces.ArticuloDAO;
import com.js.shared.models.InvArticulo;
import com.js.shared.models.InvArticuloPresentacion;
import java.util.List;
import java.util.logging.Level;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author JADESOFT
 */
public class ArticuloDAOHQL extends GenericDAOHQL<InvArticulo, Integer> implements ArticuloDAO {

    @Override
    public List<InvArticuloPresentacion> lArticuloPresentacions(InvArticulo articulo) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            String sql = "SELECT pres FROM InvArticuloPresentacion pres, "
                    + "InvArticulo art WHERE pres.articulo = art.codigo AND "
                    + "art.codigo = '%s'";
            Query query = session.createQuery(String.format(sql, articulo.getCodigo()));
            List<InvArticuloPresentacion> entities = query.list();
            session.getTransaction().commit();
            return entities;
        } catch (javax.validation.ConstraintViolationException | org.hibernate.exception.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new BussinessException(cve);
        } catch (HibernateException ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw ex;
        }
    }

}

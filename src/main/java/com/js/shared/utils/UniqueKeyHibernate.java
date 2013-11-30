/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.shared.utils;

import com.jadesoft.jadedao.exception.BussinessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author JADESOFT
 * @param <T>
 */
public class UniqueKeyHibernate<T> extends UniqueKey<T> {

    private final static Logger LOGGER = Logger.getLogger(UniqueKeyHibernate.class.getName());
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private Class clazz;

    public UniqueKeyHibernate() {
        super();
    }

    @Override
    public boolean getDuplicated() {
        if (getRepeat()) {
            return true;
        }
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            T entity = (T) session.createQuery("SELECT e." + super.field + " FROM " + this.clazz.getName() + " e WHERE e." + super.field + " = '" + super.value + "'")
                    .uniqueResult();
            session.getTransaction().commit();
            return entity != null;
        } catch (javax.validation.ConstraintViolationException | org.hibernate.exception.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            try {
                throw new BussinessException(cve);
            } catch (BussinessException ex) {
                Logger.getLogger(UniqueKeyHibernate.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        return false;
    }

    @Override
    public void setHQL(Class clazz, String field, String value) {
        this.clazz = clazz;
        super.field = field;
        super.value = value;
    }

    @Override
    public void setSQL(String table, String field, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

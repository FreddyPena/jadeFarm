/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.shared.main;

import com.js.shared.utils.HibernateUtil;

/**
 *
 * @author yiyi
 */
public class App {

    public static void main(String[] args) {
        System.out.println("JadeFarmacia");
        HibernateUtil.buildSessionFactory();
        HibernateUtil.openSessionAndBindToThread();

//             try {
//            HibernateUtil.openSessionAndBindToThread();
//
//        } catch (BussinessException be) {
//            System.out.println("No se a podido recore el array");
//            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
//                System.out.println(bussinessMessage.toString());
//            }
//        } finally {
//            HibernateUtil.closeSessionAndUnbindFromThread();
//        }
//        HibernateUtil.closeSessionFactory();
    }
}

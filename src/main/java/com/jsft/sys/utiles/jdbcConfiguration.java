/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.sys.utiles;

import com.jadesoft.jadelib.configuracion.Configuracion;
import com.jadesoft.jadejdbc.jdbc.connection.JdbcConection;
import com.jadesoft.jadejdbc.jdbc.connection.ParametersConection;
import com.jadesoft.jadelib.others.EncrypterDescrypter;
import java.sql.Connection;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author Hector
 */
public class jdbcConfiguration {

    private final static Logger log = Logger.getLogger(jdbcConfiguration.class);
    private static JdbcConection conJadeFarmacia;
    private static JdbcConection conJadeSoftOther;//    private static Integer baseDato;

    static {
        try {
            ParametersConection pCon = new ParametersConection();
            conJadeFarmacia = new JdbcConection();

            EncrypterDescrypter ed = new EncrypterDescrypter("jadesoft");

            pCon.setDbuser(ed.decrypt(Configuracion.getOtherProperty("db.user")));
            pCon.setUserPas(ed.decrypt(Configuracion.getOtherProperty("db.pass")));
            pCon.setUrl(Configuracion.getOtherProperty("db.url.jadesoft"));
            pCon.setDriver(Configuracion.getOtherProperty("db.driver"));

            log.info(pCon);
            if (!conJadeFarmacia.createConexion(pCon)) {
                log.error("NO SE PUDO CONECTAR A LA BASE DE DATOS");
            }

//            conJadeSoftOther = new JdbcConection();
//            pCon = new ParametersConection();
//            pCon.setDbuser(ed.decrypt(Configuracion.getOtherProperty("db.user")));
//            pCon.setUserPas(ed.decrypt(Configuracion.getOtherProperty("db.pass")));
//            pCon.setUrl(Configuracion.getOtherProperty("db.url.jadesoftother"));
//            pCon.setDriver(Configuracion.getOtherProperty("db.driver"));
//
//            log.info(pCon);
//            if (!conJadeSoftOther.createConexion(pCon)) {
//                log.error("NO SE PUDO CONECTAR A LA BASE DE DATOS");
//            }

            System.out.println("Conexion Creada");
        } catch (Exception ex) {
            log.warn("jadesoft-jadeJdbc", ex);
            JOptionPane.showMessageDialog(null, "Error en unas de las Configuraciones de Conexion a la base de datos");
            System.exit(0);
        }
    }

    /**
     * Estable la conexion con la base de dato jadeLab
     *
     * @return la conexion establecida
     */
    public static Connection getConnectionJadeFarmacia() {
        return conJadeFarmacia.getConexion();
    }

//    /**
//     * Estable la conexion con la base de dato jadeOther
//     *
//     * @return la conexion establecida
//     */
//    public static Connection getConnectionJadeSoftOther() {
//        return conJadeSoftOther.getConexion();
//    }
    
    public static void main(String[] args) {
        EncrypterDescrypter ed = new EncrypterDescrypter("jadesoft");
        System.out.println(ed.encrypt("2205"));
    }
}

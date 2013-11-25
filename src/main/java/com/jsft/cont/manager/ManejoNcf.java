/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.cont.manager;

import com.jsft.sys.utiles.jdbcConfiguration;
import com.jadesoft.jadejdbc.jdbc.transactions.ParametersSet;
import com.jadesoft.jadejdbc.jdbc.interfaces.RowMapper;
import com.jadesoft.jadejdbc.jdbc.interfaces.DaoStandar;
import com.jadesoft.jadejdbc.jdbc.transactions.jdbcStatemant;
import com.jsft.cont.entity.Ncf;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/*
 * JDialog: JDialog --> ManejoNcf.java
 * Author: Hector Ventura
 * Fecha: Enero 27, 2013
 */
public class ManejoNcf extends jdbcStatemant implements DaoStandar<Ncf> {

    private static ManejoNcf manejo = null;

    public static ManejoNcf getInstance() {
        if (manejo == null) {
            manejo = new ManejoNcf();
        }
        return manejo;
    }

    public static String getNCF(Ncf ncf, boolean guardar) {

        String nuevoNcf = "";


        nuevoNcf = ncf.getPrefijo();
        nuevoNcf += (ncf.getTipo() < 10 ? "0" : "") + ncf.getTipo();

        int Actual = ncf.getSecuenciaActual() + 1;


        int logitud = 8 - (Actual + "").length();
        for (int i = 0; i < logitud; i++) {
            nuevoNcf = nuevoNcf + "0";
        }

        nuevoNcf += (Actual + "");

        if (guardar) {
            ncf.setSecuenciaActual(Actual);
            //   ManejoNcf.getInstance().guardarActualizar(ncf);
        }

        // Formato devolver = A010010100100000092 (19 digitos NCF)
        return nuevoNcf;
    }

    public static String getAutoCompleteNCF(Ncf ncf, String sequence) {
        String newNCF = ncf.getPrefijo();
        newNCF += (ncf.getTipo() < 10 ? "0" : "") + ncf.getTipo();

        int length = 8 - sequence.length();

        for (int i = 0; i < length; i++) {
            newNCF += "0";
        }

        newNCF += sequence;

        return newNCF;
    }

//    public Ncf findType(TipoNotaCxp type) {
//        String sql = "SELECT * FROM ncf WHERE tipo = " + type.getTipoNota();
//        setConnection(jdbcConfiguration.getConnectionJadeLab());
//        return (Ncf) queryForObject(sql, new NcfRM());
//    }
    @Override
    public Ncf find(Integer id) {
        String sql = "SELECT * FROM con_ncf WHERE codigo = " + id;
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());

        return (Ncf) queryForObject(sql, new NcfRM());
    }

    @Override
    public List<Ncf> findAll() {
        String sql = "SELECT * FROM con_ncf ORDER BY tipo ASC ";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());

        return (List<Ncf>) query(sql, new NcfRM());
    }

    @Override
    public void create(final Ncf element) {


        if (element.getCodigo() != null) {
            update(element);
            return;
        }

        String sql = "INSERT INTO con_ncf (descripcion, prefijo, tipo, "
                + "secuencia_inicio, secuencia_final, secuencia_actual) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        ParametersSet parametros = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getDescripcion());
                ps.setString(2, element.getPrefijo());
                ps.setShort(3, element.getTipo());
                ps.setInt(4, element.getSecuenciaInicio());
                ps.setInt(5, element.getSecuenciaFinal());
                ps.setInt(6, element.getSecuenciaActual());

            }
        };

        save(sql, parametros);

    }

    @Override
    public void create(List<Ncf> lElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Ncf element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(final Ncf element) {

        String sql = "UPDATE con_ncf SET descripcion = ?, prefijo = ?, tipo = ?, "
                + "secuencia_inicio = ?, secuencia_final = ?, secuencia_actual = ? "
                + "WHERE codigo = ?";

        ParametersSet parametros = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getDescripcion());
                ps.setString(2, element.getPrefijo());
                ps.setShort(3, element.getTipo());
                ps.setInt(4, element.getSecuenciaInicio());
                ps.setInt(5, element.getSecuenciaFinal());
                ps.setInt(6, element.getSecuenciaActual());
                ps.setInt(7, element.getCodigo());

            }
        };

        save(sql, parametros);
    }
}

class NcfRM implements RowMapper<Ncf> {

    @Override
    public Ncf getRow(ResultSet rs) throws SQLException {
        Ncf ncf = new Ncf();

        ncf.setCodigo(rs.getInt("codigo"));
        ncf.setDescripcion(rs.getString("descripcion"));
        ncf.setPrefijo(rs.getString("prefijo"));
        ncf.setSecuenciaActual(rs.getInt("secuencia_actual"));
        ncf.setSecuenciaFinal(rs.getInt("secuencia_final"));
        ncf.setSecuenciaInicio(rs.getInt("secuencia_inicio"));
        ncf.setTipo(rs.getShort("tipo"));

        return ncf;
    }
}
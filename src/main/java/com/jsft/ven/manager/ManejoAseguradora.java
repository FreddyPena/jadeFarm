/*
 */
package com.jsft.ven.manager;

import com.jsft.sys.utiles.jdbcConfiguration;
import com.jsft.ven.entity.Aseguradora;
import com.jadesoft.jadejdbc.jdbc.transactions.ParametersSet;
import com.jadesoft.jadejdbc.jdbc.interfaces.RowMapper;
import com.jadesoft.jadejdbc.jdbc.interfaces.DaoStandar;
import com.jadesoft.jadejdbc.jdbc.transactions.jdbcStatemant;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/*
 * Author: Hector Ventura
 * Fecha: Fecbrero 06, 2013
 */
public class ManejoAseguradora extends jdbcStatemant implements DaoStandar<Aseguradora> {

    private static ManejoAseguradora manejo = null;

    public static ManejoAseguradora getInstance() {
        if (manejo == null) {
            manejo = new ManejoAseguradora();
        }
        return manejo;
    }

    private List<Aseguradora> executeQuery(String sql) {
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<Aseguradora>) query(sql, new AseguradoraRM());
    }

    @Override
    public Aseguradora find(Integer id) {
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT * FROM ven_aseguradora WHERE codigo = " + id;
        return (Aseguradora) queryForObject(sql, new AseguradoraRM());
    }

    @Override
    public List<Aseguradora> findAll() {
        return executeQuery("SELECT * FROM ven_aseguradora ase ORDER BY ase.descripcion ASC");
    }

    @Override
    public void create(final Aseguradora element) {
        if (element.getCodigo() != null) {
            update(element);
            return;
        }
        String sql = "INSERT INTO ven_aseguradora (descripcion, cobertura, num_codigo, rnc, telefono) VALUES (?, ?, ?,?,?,?)";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getDescripcion());
                ps.setBoolean(2, element.getCobertura());
                ps.setString(3, element.getNumCodigo());
                ps.setString(4, element.getRnc());
                ps.setString(5, element.getTelefono());
            }
        };
        save(sql, parametersSet);
    }

    @Override
    public void create(List<Aseguradora> lElement) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Aseguradora element) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(final Aseguradora element) {
        String sql = "UPDATE ven_aseguradora SET descripcion = ?, cobertura = ?, num_codigo = ?, rnc = ?, telefono = ? WHERE codigo = ?";

        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getDescripcion());
                ps.setBoolean(2, element.getCobertura());
                ps.setString(3, element.getNumCodigo());
                ps.setString(4, element.getRnc());
                ps.setString(5, element.getTelefono());
                ps.setInt(6, element.getCodigo());
            }
        };
        save(sql, parametersSet);
    }
}

class AseguradoraRM implements RowMapper<Aseguradora> {

    @Override
    public Aseguradora getRow(final ResultSet rs) throws SQLException {
        Aseguradora aseguradora = new Aseguradora() {
            {
                setCodigo(rs.getInt("codigo"));
                setCobertura(rs.getBoolean("cobertura"));
                setDescripcion(rs.getString("descripcion"));
                setRnc(rs.getString("rnc"));
                setNumCodigo(rs.getString("num_codigo"));
                setTelefono(rs.getString("telefono"));
            }
        };
        return aseguradora;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;

import com.jsft.inv.entity.Familia;
import com.jadesoft.jadejdbc.jdbc.interfaces.DaoStandar;
import com.jadesoft.jadejdbc.jdbc.interfaces.RowMapper;
import com.jadesoft.jadejdbc.jdbc.transactions.ParametersSet;
import com.jadesoft.jadejdbc.jdbc.transactions.jdbcStatemant;
import com.jsft.sys.utiles.jdbcConfiguration;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author yiyi
 */
public class ManejoFamilia extends jdbcStatemant implements DaoStandar<Familia>{
    private static ManejoFamilia manejo;

    public static ManejoFamilia getInstance() {
        if (manejo == null) {
            manejo = new ManejoFamilia();
        }
        return manejo;
    }

    @Override
    public Familia find(Integer id) {
        String query = "SELECT * FROM inv_familia WHERE id_familia = " + id;
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Familia) queryForObject(query, new FamiliaRM());
    }

    public Familia findIdentifier(String identifier) {
        String query = "SELECT * FROM inv_familia WHERE identificador = '%s'";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Familia) queryForObject(String.format(query, identifier), new FamiliaRM());
    }

    @Override
    public List<Familia> findAll() {
        String query = "SELECT * FROM inv_familia ORDER BY descripcion ASC";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<Familia>) query(query, new FamiliaRM());
    }

    @Override
    public void create(final Familia element) {
        if (element.getIdFamilia() != null) {
            update(element);
            return;
        }
        String query = "INSERT INTO inv_familia (identificador, descripcion) VALUES (?, ?)";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getDescripcion());
            }
        };
        save(query, parametersSet);
    }

    @Override
    public void create(List<Familia> lElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(final Familia element) {
        String query = "DELETE FROM inv_familia WHERE id_familia = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setInt(1, element.getIdFamilia());
            }
        };
        save(query, parametersSet);
    }

    public Familia findDelete(final Familia element) {
        String query = "SELECT * FROM inv_articulo WHERE id_familia = " + element.getIdFamilia();
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Familia) queryForObject(query, new FamiliaRM());
    }

    @Override
    public void update(final Familia element) {
        String query = "UPDATE inv_familia SET identificador = ?, descripcion = ? "
                + "WHERE id_familia = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getDescripcion());
                ps.setInt(3, element.getIdFamilia());
            }
        };
        save(query, parametersSet);
    }

}

class FamiliaRM implements RowMapper<Familia> {

    @Override
    public Familia getRow(final ResultSet rs) throws SQLException {
        Familia f = new Familia() {
            {
                setIdFamilia(rs.getInt("id_familia"));
                setIdentificador(rs.getString("identificador"));
                setDescripcion(rs.getString("descripcion"));
            }
        };
        return f;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;

import com.jsft.inv.entity.ClasArticulo;
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
public class ManejoClasArticulo extends jdbcStatemant implements DaoStandar<ClasArticulo> {

    private static ManejoClasArticulo manejo;

    public static ManejoClasArticulo getInstance() {
        if (manejo == null) {
            manejo = new ManejoClasArticulo();
        }
        return manejo;
    }

    @Override
    public ClasArticulo find(Integer id) {
        String query = "SELECT * FROM inv_clasarticulo WHERE id_clasarticulo = " + id;
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (ClasArticulo) queryForObject(query, new ClasificacionArticuloRM());
    }

    public ClasArticulo findIdentifier(String identifier) {
        String query = "SELECT * FROM inv_clasarticulo WHERE identificador = '%s'";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (ClasArticulo) queryForObject(String.format(query, identifier), new ClasificacionArticuloRM());
    }

    @Override
    public List<ClasArticulo> findAll() {
        String query = "SELECT * FROM inv_clasarticulo";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<ClasArticulo>) query(query, new ClasificacionArticuloRM());
    }

    @Override
    public void create(final ClasArticulo element) {
        if (element.getIdClasArticulo()!= null) {
            update(element);
            return;
        }
        String query = "INSERT INTO inv_clasarticulo (identificador, descripcion) VALUES (?, ?)";
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
    public void create(List<ClasArticulo> lElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(final ClasArticulo element) {
        String query = "DELETE FROM inv_clasarticulo WHERE id_clasarticulo = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setInt(1, element.getIdClasArticulo());
            }
        };
        save(query, parametersSet);
    }

    public List<ClasArticulo> delete() {
        String query = "SELECT ca.* FROM inv_clasarticulo ca "
                + "INNER JOIN inv_articulo art ON (art.id_familia = ca.id_clasarticulo)";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<ClasArticulo>) query(query, new ClasificacionArticuloRM());
    }

    @Override
    public void update(final ClasArticulo element) {
        String query = "UPDATE inv_clasarticulo SET identificador = ?, descripcion = ? "
                + "WHERE id_clasarticulo = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getDescripcion());
                ps.setInt(3, element.getIdClasArticulo());
            }
        };
        save(query, parametersSet);
    }

}

class ClasificacionArticuloRM implements RowMapper<ClasArticulo> {

    @Override
    public ClasArticulo getRow(final ResultSet rs) throws SQLException {
        ClasArticulo ca = new ClasArticulo() {
            {
                setIdClasArticulo(rs.getInt("id_clasarticulo"));
                setIdentificador(rs.getString("identificador"));
                setDescripcion(rs.getString("descripcion"));
            }
        };
        return ca;
    }
}

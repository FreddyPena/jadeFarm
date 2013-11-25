/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;

import com.jsft.inv.entity.Unidad;
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
public class ManejoUnidad extends jdbcStatemant implements DaoStandar<Unidad> {

    private static ManejoUnidad manejo;

    public static ManejoUnidad getInstance() {
        if (manejo == null) {
            manejo = new ManejoUnidad();
        }
        return manejo;
    }

    @Override
    public Unidad find(Integer id) {
        String query = "SELECT * FROM inv_unidad WHERE id_unidad = " + id;
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Unidad) queryForObject(query, new UnidadRM());
    }

    public Unidad findIdentifier(String identifier) {
        String query = "SELECT * FROM inv_unidad WHERE identificador = '%s'";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Unidad) queryForObject(String.format(query, identifier), new UnidadRM());
    }

    @Override
    public List<Unidad> findAll() {
        String query = "SELECT * FROM inv_unidad";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<Unidad>) query(query, new UnidadRM());
    }

    @Override
    public void create(final Unidad element) {
        if (element.getIdUnidad() != null) {
            update(element);
            return;
        }
        String query = "INSERT INTO inv_unidad (identificador, descripcion) VALUES (?, ?)";
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
    public void create(List<Unidad> lElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(final Unidad element) {
        String query = "DELETE FROM inv_unidad WHERE id_unidad = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setInt(1, element.getIdUnidad());
            }
        };
        save(query, parametersSet);
    }

    public List<Unidad> delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(final Unidad element) {
        String query = "UPDATE inv_unidad SET identificador = ?, descripcion = ? "
                + "WHERE id_unidad = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getDescripcion());
                ps.setInt(3, element.getIdUnidad());
            }
        };
        save(query, parametersSet);
    }
    
    public Unidad findDelete(Unidad unidad){
    
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT * FROM inv_presentacion WHERE unidad = "+unidad.getIdUnidad();
        return (Unidad) queryForObject(sql, new UnidadRM());
    }

}
class UnidadRM implements RowMapper<Unidad> {

    @Override
    public Unidad getRow(final ResultSet rs) throws SQLException {
        Unidad r = new Unidad() {
            {
                setIdUnidad(rs.getInt("id_unidad"));
                setIdentificador(rs.getString("identificador"));
                setDescripcion(rs.getString("descripcion"));
            }
        };
        return r;
    }
}

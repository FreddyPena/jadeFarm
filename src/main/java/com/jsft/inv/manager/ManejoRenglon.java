/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;

import com.jsft.inv.entity.Renglon;
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
public class ManejoRenglon extends jdbcStatemant implements DaoStandar<Renglon> {

    private static ManejoRenglon manejo;

    public static ManejoRenglon getInstance() {
        if (manejo == null) {
            manejo = new ManejoRenglon();
        }
        return manejo;
    }

    @Override
    public Renglon find(Integer id) {
        String query = "SELECT * FROM inv_renglon WHERE id_renglon = " + id;
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Renglon) queryForObject(query, new RenglonRM());
    }

    public Renglon findIdentifier(String identifier) {
        String query = "SELECT * FROM inv_renglon WHERE identificador = '%s'";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Renglon) queryForObject(String.format(query, identifier), new RenglonRM());
    }

    @Override
    public List<Renglon> findAll() {
        String query = "SELECT * FROM inv_renglon";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<Renglon>) query(query, new RenglonRM());
    }

    @Override
    public void create(final Renglon element) {
        if (element.getIdRenglon() != null) {
            update(element);
            return;
        }
        String query = "INSERT INTO inv_renglon (identificador, descripcion) VALUES (?, ?)";
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
    public void create(List<Renglon> lElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(final Renglon element) {
        String query = "DELETE FROM inv_renglon WHERE id_renglon = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setInt(1, element.getIdRenglon());
            }
        };
        save(query, parametersSet);
    }

    public List<Renglon> delete() {
        String query = "SELECT ren.* FROM inv_renglon ren "
                + "INNER JOIN inv_articulo art ON (art.id_renglon= ren.id_renglon)";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<Renglon>) query(query, new RenglonRM());
    }

    @Override
    public void update(final Renglon element) {
        String query = "UPDATE inv_renglon SET identificador = ?, descripcion = ? "
                + "WHERE id_renglon = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getDescripcion());
                ps.setInt(3, element.getIdRenglon());
            }
        };
        save(query, parametersSet);
    }
    
    public Renglon findDelete(Renglon renglon){
    
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT * FROM inv_articulo WHERE id_renglon = "+renglon.getIdRenglon();
        return (Renglon) queryForObject(sql, new RenglonRM());
    }

}

class RenglonRM implements RowMapper<Renglon> {

    @Override
    public Renglon getRow(final ResultSet rs) throws SQLException {
        Renglon r = new Renglon() {
            {
                setIdRenglon(rs.getInt("id_renglon"));
                setIdentificador(rs.getString("identificador"));
                setDescripcion(rs.getString("descripcion"));
            }
        };
        return r;
    }
}

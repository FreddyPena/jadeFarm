/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;

import com.jsft.inv.entity.Marca;
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
public class ManejoMarca extends jdbcStatemant implements DaoStandar<Marca> {

    private static ManejoMarca manejo;

    public static ManejoMarca getInstance() {
        if (manejo == null) {
            manejo = new ManejoMarca();
        }
        return manejo;
    }

    @Override
    public Marca find(Integer id) {
        String query = "SELECT * FROM inv_marca WHERE id_marca = " + id;
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Marca) queryForObject(query, new MarcaRM());
    }

    public Marca findIdentifier(String identifier) {
        String query = "SELECT * FROM inv_marca WHERE identificador = '%s'";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Marca) queryForObject(String.format(query, identifier), new MarcaRM());
    }

    @Override
    public List<Marca> findAll() {
        String query = "SELECT * FROM inv_marca ORDER BY descripcion ASC";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<Marca>) query(query, new MarcaRM());
    }

    @Override
    public void create(final Marca element) {
        if (element.getIdMarca() != null) {
            update(element);
            return;
        }
        String query = "INSERT INTO inv_marca (identificador, descripcion) VALUES (?, ?)";
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
    public void create(List<Marca> lElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(final Marca element) {
        String query = "DELETE FROM inv_marca WHERE id_marca = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setInt(1, element.getIdMarca());
            }
        };
        save(query, parametersSet);
    }

    public Marca findDelete(final Marca element) {
        String query = "SELECT * FROM inv_articulo WHERE id_marca = " + element.getIdMarca();
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Marca) queryForObject(query, new MarcaRM());
    }

    @Override
    public void update(final Marca element) {
        String query = "UPDATE inv_marca SET identificador = ?, descripcion = ? "
                + "WHERE id_marca = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getDescripcion());
                ps.setInt(3, element.getIdMarca());
            }
        };
        save(query, parametersSet);
    }

}

class MarcaRM implements RowMapper<Marca> {

    @Override
    public Marca getRow(final ResultSet rs) throws SQLException {
        Marca m = new Marca() {
            {
                setIdMarca(rs.getInt("id_marca"));
                setIdentificador(rs.getString("identificador"));
                setDescripcion(rs.getString("descripcion"));
            }
        };
        return m;
    }
}

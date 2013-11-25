/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;

import com.jsft.inv.entity.IngredienteActivo;
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
public class ManejoIngredienteActivo extends jdbcStatemant implements DaoStandar<IngredienteActivo> {

    private static ManejoIngredienteActivo manejo;

    public static ManejoIngredienteActivo getInstance() {
        if (manejo == null) {
            manejo = new ManejoIngredienteActivo();
        }
        return manejo;
    }

    @Override
    public IngredienteActivo find(Integer id) {
        String query = "SELECT * FROM inv_ingrediente_activo WHERE codigo = " + id;
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (IngredienteActivo) queryForObject(query, new IngredienteActivoRM());
    }

    public IngredienteActivo findIdentifier(String identifier) {
        String query = "SELECT * FROM inv_ingrediente_activo WHERE identificador = '%s'";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (IngredienteActivo) queryForObject(String.format(query, identifier), new IngredienteActivoRM());
    }

    @Override
    public List<IngredienteActivo> findAll() {
        String query = "SELECT * FROM inv_ingrediente_activo";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<IngredienteActivo>) query(query, new IngredienteActivoRM());
    }

    @Override
    public void create(final IngredienteActivo element) {
        if (element.getCodigo() != null) {
            update(element);
            return;
        }
        String query = "INSERT INTO inv_ingrediente_activo (identificador, descripcion) VALUES (?, ?)";
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
    public void create(List<IngredienteActivo> lElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(final IngredienteActivo element) {
        String query = "DELETE FROM inv_ingrediente_activo WHERE codigo = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setInt(1, element.getCodigo());
            }
        };
        save(query, parametersSet);
    }

    public List<IngredienteActivo> delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(final IngredienteActivo element) {
        String query = "UPDATE inv_ingrediente_activo SET identificador = ?, descripcion = ? "
                + "WHERE codigo = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getDescripcion());
                ps.setInt(3, element.getCodigo());
            }
        };
        save(query, parametersSet);
    }
    
    public IngredienteActivo findDelete(IngredienteActivo ingrediente){
    
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT * FROM inv_articulo WHERE ingrediente_activo = "+ingrediente.getCodigo();
        return (IngredienteActivo) queryForObject(sql, new IngredienteActivoRM());
    }

}
class IngredienteActivoRM implements RowMapper<IngredienteActivo> {

    @Override
    public IngredienteActivo getRow(final ResultSet rs) throws SQLException {
        IngredienteActivo r = new IngredienteActivo() {
            {
                setCodigo(rs.getInt("codigo"));
                setIdentificador(rs.getString("identificador"));
                setDescripcion(rs.getString("descripcion"));
            }
        };
        return r;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;

import com.jsft.inv.entity.Marca;
import com.jsft.inv.entity.Modelo;
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
 * @author Ing
 */
public class ManejoModelo extends jdbcStatemant implements DaoStandar<Modelo> {

    private static ManejoModelo manejo;
    
    public static ManejoModelo getInstance(){
    
        if(manejo == null){
        
            manejo = new ManejoModelo();
        }
        return manejo;
    }
    
    @Override
    public Modelo find(Integer id) {

        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT modelo.*, marca.identificador as idenmarca, marca.descripcion as descmarca \n"
                + "FROM inv_modelo modelo INNER JOIN inv_marca marca\n"
                + "on modelo.id_marca = marca.id_marca ";
        return (Modelo) queryForObject(sql, new ModeloRM());
    }
    
    public Modelo identifier(String identifier) {

        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT modelo.*, marca.identificador as idenmarca, marca.descripcion as descmarca \n"
                + "FROM inv_modelo modelo INNER JOIN inv_marca marca\n"
                + "on modelo.id_marca = marca.id_marca WHERE modelo.identificador = '%s' ";
        return (Modelo) queryForObject(String.format(sql, identifier), new ModeloRM());
    }

    @Override
    public List<Modelo> findAll() {
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT modelo.*, marca.identificador as idenmarca, marca.descripcion as descmarca \n"
                + "FROM inv_modelo modelo INNER JOIN inv_marca marca\n"
                + "on modelo.id_marca = marca.id_marca ";
        return (List<Modelo>) query(sql, new ModeloRM());
    }

    @Override
    public void create(final Modelo element) {
        
        if(element.getIdModelo() != null){
        update(element);
        return;
        }
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "INSERT INTO inv_modelo (id_marca, identificador, descripcion) values (?,?,?)";
        ParametersSet ps = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setInt(1, element.getMarca().getIdMarca());
                ps.setString(2, element.getIdentificador());
                ps.setString(3, element.getDescripcion());
                
            }
        };
        save(sql, ps);
    }

    @Override
    public void create(List<Modelo> lElement) {
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(final Modelo element) {
        
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "DELETE FROM inv_modelo where id_modelo = ?";
        ParametersSet ps = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                  ps.setInt(1, element.getIdModelo());
            }
        };
        save(sql, ps);
    }

    @Override
    public void update(final Modelo element) {
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "UPDATE inv_modelo set identificador = ?, descripcion = ?, id_marca = ? where id_modelo = ?";
        ParametersSet ps = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getDescripcion());
                ps.setInt(3, element.getMarca().getIdMarca());
                ps.setInt(4, element.getIdModelo());
                
            }
        };
        save(sql, ps);
    }
    
    public Modelo findDelete(Modelo modelo){
    
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT * FROM inv_articulo WHERE id_modelo = "+modelo.getIdModelo();
        return (Modelo) queryForObject(sql, new ModeloRM());
    }
}

class ModeloRM implements RowMapper<Modelo> {

    @Override
    public Modelo getRow(final ResultSet rs) throws SQLException {
        Modelo modelo = new Modelo() {
            {
                setIdentificador(rs.getString("identificador"));
                setDescripcion(rs.getString("descripcion"));
                setIdModelo(rs.getInt("id_modelo"));
                setMarca(new Marca() {
                    {
                        setDescripcion(rs.getString("descmarca"));
                        setIdentificador(rs.getString("idenmarca"));
                        setIdMarca(rs.getInt("id_marca"));
                    }
                });
            }
        };


        return modelo;
    }
}

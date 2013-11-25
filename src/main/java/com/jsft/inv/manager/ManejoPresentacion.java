/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;

import com.jsft.inv.entity.Presentacion;
import com.jadesoft.jadejdbc.jdbc.interfaces.DaoStandar;
import com.jadesoft.jadejdbc.jdbc.interfaces.RowMapper;
import com.jadesoft.jadejdbc.jdbc.transactions.ParametersSet;
import com.jadesoft.jadejdbc.jdbc.transactions.jdbcStatemant;
import com.jsft.inv.entity.Unidad;
import com.jsft.sys.utiles.jdbcConfiguration;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ing
 */
public class ManejoPresentacion extends jdbcStatemant implements DaoStandar<Presentacion> {

    private static ManejoPresentacion manejo;

    public static ManejoPresentacion getInstance() {

        if (manejo == null) {

            manejo = new ManejoPresentacion();
        }
        return manejo;
    }

    @Override
    public Presentacion find(Integer id) {

        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT presentacion.*, unidad.identificador as idenunidad, unidad.descripcion as descunidad\n"
                + "                FROM inv_presentacion presentacion INNER JOIN inv_unidad unidad\n"
                + "                on presentacion.unidad = unidad.id_unidad and presentacion.codigo = " + id;
        return (Presentacion) queryForObject(sql, new PresentacionRM());
    }

    public Presentacion identifier(String identifier) {

        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT presentacion.*, unidad.identificador as idenunidad, unidad.descripcion as descunidad\n"
                + "                FROM inv_presentacion presentacion INNER JOIN inv_unidad unidad\n"
                + "                on presentacion.unidad = unidad.id_unidad and presentacion.identificador = '"+identifier+"' ";
        return (Presentacion) queryForObject(String.format(sql, identifier), new PresentacionRM());
    }

    @Override
    public List<Presentacion> findAll() {
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT presentacion.*, unidad.identificador as idenunidad, unidad.descripcion as descunidad\n"
                + "                FROM inv_presentacion presentacion INNER JOIN inv_unidad unidad\n"
                + "                on presentacion.unidad = unidad.id_unidad";
        return (List<Presentacion>) query(sql, new PresentacionRM());
    }

    @Override
    public void create(final Presentacion element) {

        if (element.getCodigo() != null) {
            update(element);
            return;
        }
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "INSERT INTO inv_presentacion (unidad, identificador, descripcion, factor) values (?,?,?,?)";
        ParametersSet ps = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setInt(1, element.getUnidad().getIdUnidad());
                ps.setString(2, element.getIdentificador());
                ps.setString(3, element.getDescripcion());
                ps.setDouble(4, element.getFactor());
            }
        };
        save(sql, ps);
    }

    @Override
    public void create(List<Presentacion> lElement) {


        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(final Presentacion element) {

        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "DELETE FROM inv_presentacion where codigo = ?";
        ParametersSet ps = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setInt(1, element.getCodigo());
            }
        };
        save(sql, ps);
    }

    @Override
    public void update(final Presentacion element) {
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "UPDATE inv_presentacion set identificador = ?, descripcion = ?, unidad = ?, factor = ? where codigo = ?";
        ParametersSet ps = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getDescripcion());
                ps.setInt(3, element.getUnidad().getIdUnidad());
                ps.setDouble(4, element.getFactor());
                ps.setInt(5, element.getCodigo());

            }
        };
        save(sql, ps);
    }

    public Presentacion findDelete(Presentacion presentacion) {

        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT * FROM inv_articulo_presentacion WHERE presentacion = " + presentacion.getCodigo();
        return (Presentacion) queryForObject(sql, new PresentacionRM());
    }
}

class PresentacionRM implements RowMapper<Presentacion> {

    @Override
    public Presentacion getRow(final ResultSet rs) throws SQLException {
        Presentacion presentacion = new Presentacion() {
            {
                setIdentificador(rs.getString("identificador"));
                setDescripcion(rs.getString("descripcion"));
                setFactor(rs.getDouble("factor"));
                setCodigo(rs.getInt("codigo"));
                setUnidad(new Unidad() {
                    {
                        setDescripcion(rs.getString("descunidad"));
                        setIdentificador(rs.getString("idenunidad"));
                        setIdUnidad(rs.getInt("unidad"));
                    }
                });
            }
        };
        return presentacion;
    }
}

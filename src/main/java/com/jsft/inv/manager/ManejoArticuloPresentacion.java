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
import com.jsft.inv.entity.Articulo;
import com.jsft.inv.entity.ArticuloPresentacion;
import com.jsft.sys.utiles.jdbcConfiguration;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author Ing
 */
public class ManejoArticuloPresentacion extends jdbcStatemant implements DaoStandar<Presentacion> {

    private static ManejoArticuloPresentacion manejo;

    public static ManejoArticuloPresentacion getInstance() {

        if (manejo == null) {

            manejo = new ManejoArticuloPresentacion();
        }
        return manejo;
    }

    @Override
    public Presentacion find(Integer id) {
        return null;
    }

    public Presentacion identifier(String identifier) {

        return null;
    }

    @Override
    public List<Presentacion> findAll() {
        return null;
    }
    
    public List<ArticuloPresentacion> listItemPresentation(Articulo articulo) {
        String sql = "select pres.* "
                + "from inv_articulo_presentacion pres inner join inv_articulo arti "
                + "on pres.articulo = arti.codigo "
                + "and arti.codigo = " + articulo.getCodigo();
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<ArticuloPresentacion>) query(sql, new ItemPresentationRM());
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

    
}
class ItemPresentationRM implements RowMapper<ArticuloPresentacion> {

    @Override
    public ArticuloPresentacion getRow(final ResultSet rs) throws SQLException {
        final ArticuloPresentacion p = new ArticuloPresentacion() {
            {
                setCodigo(rs.getInt("codigo"));
                setPrecio1(rs.getDouble("precio1"));
                setPrecio2(rs.getDouble("precio2"));
                setPrecio3(rs.getDouble("precio3"));
                setPorcentaje1(rs.getDouble("porcentaje1"));
                setPorcentaje2(rs.getDouble("porcentaje2"));
                setPorcentaje3(rs.getDouble("porcentaje3"));
                setBarra(rs.getString("barra"));
                setCosto(rs.getDouble("costo"));
                setArticulo(ManejoArticulo.getInstance().find(rs.getInt("articulo")));
                setPresentacion(ManejoPresentacion.getInstance().find(rs.getInt("presentacion")));
            }
        };
        p.setPresentationList(ManejoArticulo.getInstance().listPresentation(p));
        return p;
    }
}


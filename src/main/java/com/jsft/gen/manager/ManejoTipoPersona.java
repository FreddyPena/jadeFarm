/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.gen.manager;

import com.jsft.sys.utiles.jdbcConfiguration;
import com.jadesoft.jadejdbc.jdbc.interfaces.DaoStandar;
import com.jadesoft.jadejdbc.jdbc.interfaces.RowMapper;
import com.jadesoft.jadejdbc.jdbc.transactions.jdbcStatemant;
import com.jsft.gen.entity.Persona;
import com.jsft.gen.entity.PersonaTipoPersona;
import com.jsft.gen.entity.TipoPersona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Hector Ventura
 */
public class ManejoTipoPersona extends jdbcStatemant
        implements DaoStandar<TipoPersona> {

    public static ManejoTipoPersona manejo;

    public ManejoTipoPersona() {
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
    }

    public static ManejoTipoPersona getInstancia() {

        if (manejo == null) {
            manejo = new ManejoTipoPersona();
        }

        return manejo;
    }

    @Override
    public TipoPersona find(Integer id) {

        String sql = "SELECT tp.* FROM tipo_persona ptp "
                + "WHERE ptp.codigo = " + id;
        return (TipoPersona) queryForObject(sql, new TipoPersonaRM());
    }

    @Override
    public List<TipoPersona> findAll() {

        String sql = "SELECT tp.* FROM tipo_persona tp ";

        return query(sql, new TipoPersonaRM());
    }

    public List<PersonaTipoPersona> findAll(Persona persona) {

        String sql = "SELECT ptp.* FROM persona_tipo_persona ptp "
                + "WHERE ptp.persona = " + persona.getCodigo();
        return query(sql, new TipoPersonaRM());
    }

    @Override
    public void create(final TipoPersona element) {
//        if (element.getCodigo() != null) {
//            update(element);
//            return;
//        }
//
//        String sql = "INSERT INTO persona (auxiliar, habilitado, limite, "
//                + "persona, tipo_persona) VALUES (?, ?, ?, ?, ?)";
//
//
//        save(sql, new ParametersSet() {
//            @Override
//            public void putParameters(PreparedStatement ps) throws SQLException {
//                ps.setString(1, element.getAuxiliar());
//                ps.setBoolean(2, element.getHabilitado());
//                ps.setDouble(3, element.getLimite());
//                ps.setInt(4, element.getPersona().getCodigo());
//                ps.setInt(5, element.getTipoPesona().getCodigo());
//            }
//        });
    }

    @Override
    public void create(final List<TipoPersona> lElement) {
//        String sql = "INSERT INTO persona (auxiliar, habilitado, limite, "
//                + "persona, tipo_persona) VALUES (?, ?, ?, ?, ?)";
//
//
//        updateBatch(sql, new BatchPreparedStatementSet() {
//            @Override
//            public void setValues(PreparedStatement ps, int i) throws SQLException {
//                PersonaTipoPersona ptp = lElement.get(i);
//
//                ps.setString(1, ptp.getAuxiliar());
//                ps.setBoolean(2, ptp.getHabilitado());
//                ps.setDouble(3, ptp.getLimite());
//                ps.setInt(4, ptp.getPersona().getCodigo());
//                ps.setInt(5, ptp.getTipoPesona().getCodigo());
//            }
//
//            @Override
//            public int getSizeBatch() {
//                return lElement.size();
//            }
//        });
    }

    @Override
    public void delete(TipoPersona element) {
    }

    @Override
    public void update(final TipoPersona element) {
//        String sql = "UPDATE persona SET auxiliar = ?, habilitado = ?, limite = ?, "
//                + "persona = ?, tipo_persona = ? WHERE codigo = ?";
//
//        save(sql, new ParametersSet() {
//            @Override
//            public void putParameters(PreparedStatement ps) throws SQLException {
//                ps.setString(1, element.getAuxiliar());
//                ps.setBoolean(2, element.getHabilitado());
//                ps.setDouble(3, element.getLimite());
//                ps.setInt(4, element.getPersona().getCodigo());
//                ps.setInt(5, element.getTipoPesona().getCodigo());
//                ps.setInt(6, element.getCodigo());
//            }
//        });
    }
}

class TipoPersonaRM implements RowMapper {

    @Override
    public Object getRow(ResultSet rs) throws SQLException {
        TipoPersona tp = new TipoPersona();

        tp.setCodigo(rs.getInt("codigo"));
        tp.setDescripcion(rs.getString("descripcion"));

        return tp;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.gen.manager;

import com.jadesoft.jadejdbc.jdbc.interfaces.BatchPreparedStatementSet;
import com.jadesoft.jadejdbc.jdbc.interfaces.DaoStandar;
import com.jadesoft.jadejdbc.jdbc.interfaces.RowMapper;
import com.jadesoft.jadejdbc.jdbc.transactions.ParametersSet;
import com.jadesoft.jadejdbc.jdbc.transactions.jdbcStatemant;
import com.jsft.gen.entity.Persona;
import com.jsft.gen.entity.PersonaTipoPersona;
import com.jsft.gen.entity.TipoPersona;
import com.jsft.sys.utiles.jdbcConfiguration;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hector Ventura
 */
public class ManejoPersona extends jdbcStatemant
        implements DaoStandar<Persona> {

    private static ManejoPersona manejo;

    public ManejoPersona() {
        super(jdbcConfiguration.getConnectionJadeFarmacia());
    }

    public static ManejoPersona getInstancia() {

        if (manejo == null) {
            manejo = new ManejoPersona();
        }

        return manejo;
    }

    @Override
    public Persona find(Integer id) {
        Persona persona;

        String sql = "SELECT * FROM persona WHERE codigo = " + id;

        persona = (Persona) queryForObject(sql, new RowMapper() {
            @Override
            public Object getRow(ResultSet rs) throws SQLException {

                Persona persona = new Persona();
                persona.setCodigo(rs.getInt("codigo"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setDireccion(rs.getString("direccion"));
                persona.setFechaRegistro(rs.getDate("fecha_registro"));
                persona.setIdentificacion(rs.getString("identificacion"));
                persona.setNota(rs.getString("nota"));
                persona.setTipoIdentificacion(rs.getShort("tipo_identificacion"));
                persona.setCorreo(rs.getString("correo"));
                persona.setFax(rs.getString("fax"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setTelefono2(rs.getString("telefono2"));
                persona.setDireccionWeb(rs.getString("direccion_web"));
                persona.setTipoEntidad(rs.getShort("tipo_entidad"));
                persona.setPorsientoDescuento(rs.getDouble("porsiento_descuento"));
                persona.setExcentoItbis(rs.getBoolean("excento_itbis"));
                persona.setHabilitado(rs.getBoolean("habilitado"));
                persona.setEstadoCivil(rs.getString("estado_civil"));
                persona.setPoliza(rs.getString("poliza"));
                persona.setRegimenPerteneciente(rs.getShort("regimen_perteneciente"));
                persona.setPrecioListaDefecto(rs.getShort("precio_lista_defecto"));
                persona.setSexo(rs.getString("sexo"));
                
                return persona;
            }
        });

        persona.setPersonaTipoPersonaList(getPersonaTipoPersona(persona));


        return persona;
    }

    public List<PersonaTipoPersona> getPersonaTipoPersona(final Persona persona) {

        String sql = "SELECT ptp.*, tp.descripcion FROM persona_tipo_persona ptp, tipo_persona tp "
                + "WHERE tp.codigo = ptp.tipo_persona AND persona = " + persona.getCodigo();

        return query(sql, new RowMapper() {
            @Override
            public Object getRow(final ResultSet rs) throws SQLException {

                PersonaTipoPersona ptp = new PersonaTipoPersona();
                ptp.setPersona(persona);
                ptp.setCodigo(rs.getInt("codigo"));
                ptp.setAuxiliar(rs.getString("auxiliar"));
                ptp.setHabilitado(rs.getBoolean("habilitado"));
                ptp.setLimite(rs.getDouble("limite"));
                ptp.setTipoPersona(new TipoPersona() {
                    {
                        setCodigo(rs.getInt("tipo_persona"));
                        setDescripcion(rs.getString("descripcion"));

                    }
                });
                return ptp;
            }
        });

    }

    @Override
    public List<Persona> findAll() {
        String sql = "SELECT * FROM persona ORDER BY codigo";

        return query(sql, new RowMapper() {
            @Override
            public Object getRow(ResultSet rs) throws SQLException {

                Persona persona = new Persona();
                persona.setCodigo(rs.getInt("codigo"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setIdentificacion(rs.getString("identificacion"));
                persona.setHabilitado(rs.getBoolean("habilitado"));

                return persona;
            }
        });

    }

    public void createPersonaTipoPersona(final List<PersonaTipoPersona> lPtp) {

        String sql = "INSERT INTO persona_tipo_persona (persona, auxiliar, limite, "
                + "habilitado, tipo_persona ) VALUES (?, ?, ?, ?, ?)";

        BatchPreparedStatementSet ps = new BatchPreparedStatementSet() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {

                PersonaTipoPersona ptp = lPtp.get(i);
                ps.setInt(1, ptp.getPersona().getCodigo());
                ps.setString(2, ptp.getAuxiliar());
                ps.setDouble(3, ptp.getLimite());
                ps.setBoolean(4, ptp.getHabilitado());
                ps.setInt(5, ptp.getTipoPesona().getCodigo());
            }

            @Override
            public int getSizeBatch() {
                return lPtp.size();
            }
        };

        updateBatch(sql, ps);
    }
    
        public void updatePersonaTipoPersona(final List<PersonaTipoPersona> lPtp) {

        String sql = "UPDATE persona_tipo_persona SET auxiliar = ?, limite = ?, "
                + "habilitado = ?, tipo_persona = ? WHERE codigo = ?";

        BatchPreparedStatementSet ps = new BatchPreparedStatementSet() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {

                PersonaTipoPersona ptp = lPtp.get(i);
                
                ps.setString(1, ptp.getAuxiliar());
                ps.setDouble(2, ptp.getLimite());
                ps.setBoolean(3, ptp.getHabilitado());
                ps.setInt(4, ptp.getTipoPesona().getCodigo());
                ps.setInt(5, ptp.getCodigo());
            }

            @Override
            public int getSizeBatch() {
                return lPtp.size();
            }
        };

        updateBatch(sql, ps);
    }

    @Override
    public void create(final Persona persona) {

        if (persona.getCodigo() != null) {
            update(persona);
            return;
        }

        String query = "INSERT INTO persona ( nombre, apellido, tipo_identificacion, "
                + "identificacion, fecha_registro, direccion, telefono, telefono2, "
                + "correo, fax, direccion_web, habilitado, nota, tipo_entidad, "
                + "estado_civil, poliza, precio_lista_defecto, porsiento_descuento,"
                + "excento_itbis, regimen_perteneciente ) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        biginTransaction();

        ParametersSet parameter = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {

                ps.setString(1, persona.getNombre());
                ps.setString(2, persona.getApellido());
                ps.setShort(3, persona.getTipoIdentificacion());
                ps.setString(4, persona.getIdentificacion());
                ps.setDate(5, new java.sql.Date(persona.getFechaRegistro().getTime()));
                ps.setString(6, persona.getDireccion());
                ps.setString(7, persona.getTelefono());
                ps.setString(8, persona.getTelefono2());
                ps.setString(9, persona.getCorreo());
                ps.setString(10, persona.getFax());
                ps.setString(11, persona.getDireccionWeb());
                ps.setBoolean(12, persona.getHabilitado());
                ps.setString(13, persona.getNota());
                ps.setShort(14, persona.getTipoEntidad());
                ps.setString(15, persona.getEstadoCivil());
                ps.setString(16, persona.getPoliza());
                ps.setShort(17, persona.getPrecioListaDefecto());
                ps.setDouble(18, persona.getPorsientoDescuento());
                ps.setBoolean(19, persona.getExcentoItbis());
                ps.setShort(20, persona.getRegimenPerteneciente());
            }
        };

        parameter.setGenerateKey(true);

        save(query, parameter);

        if (parameter.getKeyId() != null) {
            persona.setCodigo(parameter.getKeyId().intValue());
        }

        if (persona.getPersonaTipoPersonaList() != null) {
            createPersonaTipoPersona(persona.getPersonaTipoPersonaList());
        }

        endTransaction();

    }

    @Override
    public void update(final Persona persona) {
        String query = "UPDATE persona SET nombre = ?, apellido = ?, tipo_identificacion = ?, "
                + "identificacion = ?, fecha_registro = ?, direccion = ?, telefono = ?, telefono2 = ?, "
                + "correo = ?, fax = ?, direccion_web = ?, habilitado = ?, nota = ?, tipo_entidad = ?, "
                + "estado_civil = ?, poliza = ?, precio_lista_defecto = ?, porsiento_descuento = ?,"
                + "excento_itbis = ?, regimen_perteneciente = ? WHERE codigo = ?";

        biginTransaction();

        ParametersSet parameter = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {

                ps.setString(1, persona.getNombre());
                ps.setString(2, persona.getApellido());
                ps.setShort(3, persona.getTipoIdentificacion());
                ps.setString(4, persona.getIdentificacion());
                ps.setDate(5, new java.sql.Date(persona.getFechaRegistro().getTime()));
                ps.setString(6, persona.getDireccion());
                ps.setString(7, persona.getTelefono());
                ps.setString(8, persona.getTelefono2());
                ps.setString(9, persona.getCorreo());
                ps.setString(10, persona.getFax());
                ps.setString(11, persona.getDireccionWeb());
                ps.setBoolean(12, persona.getHabilitado());
                ps.setString(13, persona.getNota());
                ps.setShort(14, persona.getTipoEntidad());
                ps.setString(15, persona.getEstadoCivil());
                ps.setString(16, persona.getPoliza());
                ps.setShort(17, persona.getPrecioListaDefecto());
                ps.setDouble(18, persona.getPorsientoDescuento());
                ps.setBoolean(19, persona.getExcentoItbis());
                ps.setShort(20, persona.getRegimenPerteneciente());
                ps.setInt(21, persona.getCodigo());
            }
        };

        save(query, parameter);
        
        List<PersonaTipoPersona> listaCrear = new ArrayList<>();
        List<PersonaTipoPersona> listaActualizar = new ArrayList<>();
        for (PersonaTipoPersona ptp: persona.getPersonaTipoPersonaList()){
            if (ptp.getCodigo() == null){
                listaCrear.add(ptp);
            } else {
                listaActualizar.add(ptp);
            }
        }
        
        createPersonaTipoPersona(listaCrear);
        updatePersonaTipoPersona(listaActualizar);
        
        endTransaction();
    }

    @Override
    public void create(final List<Persona> lElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Persona element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

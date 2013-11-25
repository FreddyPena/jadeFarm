/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;

import com.jsft.inv.entity.Fabricante;
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
public class ManejoFabricante extends jdbcStatemant implements DaoStandar<Fabricante> {

    private static ManejoFabricante manejo;

    public static ManejoFabricante getInstance() {
        if (manejo == null) {
            manejo = new ManejoFabricante();
        }
        return manejo;
    }

    @Override
    public Fabricante find(Integer id) {
        String query = "SELECT * FROM fabricante WHERE id_fabricante = " + id;
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Fabricante) queryForObject(query, new FabricanteRM());
    }

    public Fabricante findIdentifier(String identifier) {
        String query = "SELECT * FROM fabricante WHERE identificador = '%s'";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Fabricante) queryForObject(String.format(query, identifier), new FabricanteRM());
    }

    @Override
    public List<Fabricante> findAll() {
        String query = "SELECT * FROM fabricante";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<Fabricante>) query(query, new FabricanteRM());
    }

    @Override
    public void create(final Fabricante element) {
        if (element.getIdFabricante() != null) {
            update(element);
            return;
        }
        String query = "INSERT INTO fabricante(identificador,nombre,"
                + "rnc,referencia_fabricante,direccion,telefono1,exttel1,telefono2,"
                + "exttel2,fax,movil,contacto,telefono_contacto,ext_contacto,nota,"
                + "correo,paginaweb) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?)";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getNombre());
                ps.setString(3, element.getRnc());
                ps.setString(4, element.getReferenciaFabricante());
                ps.setString(5, element.getDireccion());
                ps.setString(6, element.getTelefono1());
                ps.setString(7, element.getExttel1());
                ps.setString(8, element.getTelefono2());
                ps.setString(9, element.getExttel2());
                ps.setString(10, element.getFax());
                ps.setString(11, element.getMovil());
                ps.setString(12, element.getContacto());
                ps.setString(13, element.getTelefonoContacto());
                ps.setString(14, element.getExtContacto());
                ps.setString(15, element.getNota());
                ps.setString(16, element.getCorreo());
                ps.setString(17, element.getPaginaweb());
            }
        };
        save(query, parametersSet);
    }

    @Override
    public void create(List<Fabricante> lElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(final Fabricante element) {
        String query = "DELETE FROM fabricante WHERE id_fabricante = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setInt(1, element.getIdFabricante());
            }
        };
        save(query, parametersSet);
    }

    public List<Fabricante> delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(final Fabricante element) {
        String query = "UPDATE fabricante SET identificador = ?, nombre = ?,"
                + "rnc = ?, referencia_fabricante = ?, direccion = ?, telefono1 = ?,"
                + "exttel1 = ?, telefono2 = ?, exttel2 = ?, fax = ?, movil = ?,"
                + "contacto = ?, telefono_contacto = ?, ext_contacto = ?, nota = ?,"
                + "correo = ?, paginaweb = ? WHERE id_fabricante = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parametersSet = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                ps.setString(1, element.getIdentificador());
                ps.setString(2, element.getNombre());
                ps.setString(3, element.getRnc());
                ps.setString(4, element.getReferenciaFabricante());
                ps.setString(5, element.getDireccion());
                ps.setString(6, element.getTelefono1());
                ps.setString(7, element.getExttel1());
                ps.setString(8, element.getTelefono2());
                ps.setString(9, element.getExttel2());
                ps.setString(10, element.getFax());
                ps.setString(11, element.getMovil());
                ps.setString(12, element.getContacto());
                ps.setString(13, element.getTelefonoContacto());
                ps.setString(14, element.getExtContacto());
                ps.setString(15, element.getNota());
                ps.setString(16, element.getCorreo());
                ps.setString(17, element.getPaginaweb());
                ps.setInt(18, element.getIdFabricante());
                
            }
        };
        save(query, parametersSet);
    }

    public Fabricante findDelete(Fabricante fabricante) {

        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        String sql = "SELECT * FROM inv_articulo WHERE id_fabricante = " + fabricante.getIdFabricante();
        return (Fabricante) queryForObject(sql, new FabricanteRM());
    }
}

class FabricanteRM implements RowMapper<Fabricante> {

    @Override
    public Fabricante getRow(final ResultSet rs) throws SQLException {
        Fabricante r = new Fabricante() {
            {
                setIdFabricante(rs.getInt("id_fabricante"));
                setIdentificador(rs.getString("identificador"));
                setNombre(rs.getString("nombre"));
                setRnc(rs.getString("rnc"));
                setReferenciaFabricante(rs.getString("referencia_fabricante"));
                setDireccion(rs.getString("direccion"));
                setTelefono1(rs.getString("telefono1"));
                setExttel1(rs.getString("exttel1"));
                setTelefono2(rs.getString("telefono2"));
                setExttel2(rs.getString("exttel2"));
                setFax(rs.getString("fax"));
                setMovil(rs.getString("movil"));
                setContacto(rs.getString("contacto"));
                setTelefonoContacto(rs.getString("telefono_contacto"));
                setExtContacto(rs.getString("ext_contacto"));
                setNota(rs.getString("nota"));
                setCorreo(rs.getString("correo"));
                setPaginaweb(rs.getString("paginaweb"));
            }
        };
        return r;
    }
}

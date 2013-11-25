/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;


import com.jadesoft.jadejdbc.jdbc.interfaces.BatchPreparedStatementSet;
import com.jadesoft.jadejdbc.jdbc.interfaces.DaoStandar;
import com.jadesoft.jadejdbc.jdbc.interfaces.RowMapper;
import com.jadesoft.jadejdbc.jdbc.transactions.ParametersSet;
import com.jadesoft.jadejdbc.jdbc.transactions.jdbcStatemant;
import com.jsft.inv.entity.Articulo;
import com.jsft.inv.entity.ArticuloPresentacion;
import com.jsft.inv.entity.ClasArticulo;
import com.jsft.inv.entity.Fabricante;
import com.jsft.inv.entity.Familia;
import com.jsft.inv.entity.IngredienteActivo;
import com.jsft.inv.entity.Marca;
import com.jsft.inv.entity.Modelo;
import com.jsft.inv.entity.Presentacion;
import com.jsft.inv.entity.Renglon;
import com.jsft.inv.entity.Unidad;
import com.jsft.inv.utils.CalculoPrecio;
import com.jsft.sys.utiles.jdbcConfiguration;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author yiyi
 */
public class ManejoArticulo extends jdbcStatemant implements DaoStandar<Articulo> {

    private static ManejoArticulo manejo;

    public static ManejoArticulo getInstance() {
        if (manejo == null) {
            manejo = new ManejoArticulo();
        }
        return manejo;
    }

    @Override
    public Articulo find(Integer id) {
        String sql = "select arti.codigo as codiart, arti.descripcion as descriart, arti.referencia as refeart, arti.codigo_barra as barraart, arti.venta_detallado as detaart, arti.exento_itbis as exentart, "
                + " arti.activo as activoart, arti.permite_vencimiento as vencart, arti.permite_descuento as descuentoart, arti.calculo_precio as calcart, "
                + " ingrediente.codigo as codIng, ingrediente.identificador as idenIngrediente, ingrediente.descripcion as descIngrediente, fabr.id_fabricante as codFab, fabr.identificador as idenFabricante, fabr.nombre as nombFabricante, "
                + " fami.id_familia as codFam, fami.identificador as idenFamilia, fami.descripcion as descFamilia, marc.id_marca as codMarc, marc.identificador as idenMarca, marc.descripcion as descMarca, mode.id_modelo as codMod, mode.identificador as idenModelo, mode.descripcion as descModelo, "
                + " reng.id_renglon as codReng, reng.identificador as idenRenglon, reng.descripcion as descRenglon, clas.id_clasarticulo as codClas, clas.identificador as idenClas, clas.descripcion as descClas "
                + "from inv_articulo arti inner join inv_ingrediente_activo ingrediente "
                + "on arti.ingrediente_activo = ingrediente.codigo inner join fabricante fabr "
                + "on arti.id_fabricante = fabr.id_fabricante inner join inv_familia fami "
                + "on arti.id_familia = fami.id_familia inner join inv_marca marc "
                + "on arti.id_marca = marc.id_marca inner join inv_modelo mode "
                + "on arti.id_modelo = mode.id_modelo inner join inv_renglon reng "
                + "on arti.id_renglon = reng.id_renglon inner join inv_clasarticulo clas "
                + "on arti.id_clasarticulo = clas.id_clasarticulo where arti.codigo = " + id;
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (Articulo) queryForObject(sql, new ItemRM());
    }

    @Override
    public List<Articulo> findAll() {
        String sql = "select arti.codigo as codiart, arti.descripcion as descriart, arti.referencia as refeart, arti.codigo_barra as barraart, arti.venta_detallado as detaart, arti.exento_itbis as exentart, "
                + " arti.activo as activoart, arti.permite_vencimiento as vencart, arti.permite_descuento as descuentoart, arti.calculo_precio as calcart, "
                + " ingrediente.codigo as codIng, ingrediente.identificador as idenIngrediente, ingrediente.descripcion as descIngrediente, fabr.id_fabricante as codFab, fabr.identificador as idenFabricante, fabr.nombre as nombFabricante, "
                + " fami.id_familia as codFam, fami.identificador as idenFamilia, fami.descripcion as descFamilia, marc.id_marca as codMarc, marc.identificador as idenMarca, marc.descripcion as descMarca, mode.id_modelo as codMod, mode.identificador as idenModelo, mode.descripcion as descModelo, "
                + " reng.id_renglon as codReng, reng.identificador as idenRenglon, reng.descripcion as descRenglon, clas.id_clasarticulo as codClas, clas.identificador as idenClas, clas.descripcion as descClas "
                + "from inv_articulo arti inner join inv_ingrediente_activo ingrediente "
                + "on arti.ingrediente_activo = ingrediente.codigo inner join fabricante fabr "
                + "on arti.id_fabricante = fabr.id_fabricante inner join inv_familia fami "
                + "on arti.id_familia = fami.id_familia inner join inv_marca marc "
                + "on arti.id_marca = marc.id_marca inner join inv_modelo mode "
                + "on arti.id_modelo = mode.id_modelo inner join inv_renglon reng "
                + "on arti.id_renglon = reng.id_renglon inner join inv_clasarticulo clas "
                + "on arti.id_clasarticulo = clas.id_clasarticulo ";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<Articulo>) query(sql, new ItemRM());
    }

    @Override
    public void create(Articulo element) {
        if (element.getCodigo() != null) {
            update(element);
            return;
        }
        String sql = "INSERT INTO inv_articulo (referencia, descripcion, codigo_barra, venta_detallado, exento_itbis, "
                + "activo, permite_vencimiento, permite_descuento, ingrediente_activo, id_fabricante, calculo_precio, id_familia, id_marca, id_modelo, "
                + "id_renglon, id_clasarticulo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        biginTransaction();

        ParametersSet parametersSet = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                Articulo element = (Articulo) getElement();
                ps.setString(1, element.getReferencia());
                ps.setString(2, element.getDescripcion());
                ps.setString(3, element.getCodigoBarra());
                ps.setString(4, element.getVentaDetallado());
                ps.setString(5, element.getExentoItbis());
                ps.setString(6, element.getActivo());
                ps.setString(7, element.getPermiteVencimiento());
                ps.setString(8, element.getPermiteDescuento());
                ps.setInt(9, element.getIngredienteActivo().getCodigo());
                ps.setInt(10, element.getFabricante().getIdFabricante());
                ps.setString(11, element.getCalculoPrecio().getCalculoPrecio());
                ps.setInt(12, element.getFamilia().getIdFamilia());
                ps.setInt(13, element.getMarca().getIdMarca());
                ps.setInt(14, element.getModelo().getIdModelo());
                ps.setInt(15, element.getRenglon().getIdRenglon());
                ps.setInt(16, element.getClasArticulo().getIdClasArticulo());
            }
        };
        parametersSet.setElement(element);
        parametersSet.setGenerateKey(true);
        save(sql, parametersSet);
        if (parametersSet.getKeyId() != null) {
            element.setCodigo(parametersSet.getKeyId().intValue());
        }
        //
        for (ArticuloPresentacion ap : element.getPresentaciones()) {
            ap.setArticulo(element);
        }

        if (element.getPresentaciones() != null && !element.getPresentaciones().isEmpty()) {
            createPresentation(element.getPresentaciones());
        }
        endTransaction();
    }

    private void createPresentation(final List<ArticuloPresentacion> lElement) {

        String sql = "INSERT INTO inv_articulo_presentacion (articulo, presentacion, precio1, precio2, precio3, pocentaje1, porcentaje2,"
                + "porcentaje3, barra, costo ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        BatchPreparedStatementSet batchPreparedStatementSet = new BatchPreparedStatementSet() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ArticuloPresentacion element = lElement.get(i);
                ps.setInt(1, element.getArticulo().getCodigo());
                ps.setInt(2, element.getPresentacion().getCodigo());
                ps.setDouble(3, element.getPrecio1());
                ps.setDouble(4, element.getPrecio2());
                ps.setDouble(5, element.getPrecio3());
                ps.setDouble(6, element.getPorcentaje1());
                ps.setDouble(7, element.getPorcentaje2());
                ps.setDouble(8, element.getPorcentaje3());
                ps.setString(9, element.getBarra());
                ps.setDouble(10, element.getCosto());
            }

            @Override
            public int getSizeBatch() {
                return lElement.size();
            }
        };
        updateBatch(sql, batchPreparedStatementSet);
    }

    private void deletePresentation(final List<ArticuloPresentacion> lElement) {

        String sql = "DELETE FROM inv_articulo_presentacion  WHERE codigo = ?";
        BatchPreparedStatementSet batchPreparedStatementSet = new BatchPreparedStatementSet() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ArticuloPresentacion element = lElement.get(i);
                ps.setInt(2, element.getCodigo());
            }

            @Override
            public int getSizeBatch() {
                return lElement.size();
            }
        };
        updateBatch(sql, batchPreparedStatementSet);
    }

    @Override
    public void create(List<Articulo> lElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Articulo element) {
        if(element.getPresentaciones().isEmpty() && element.getPresentaciones() != null){
            deletePresentation(element.getPresentaciones());
        }
        
        String sql = "delete from inv_articulo where codigo = ?";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        ParametersSet parameter = new ParametersSet() {

            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                Articulo articulo = (Articulo) getElement();
                ps.setInt(1, articulo.getCodigo());
            }
        };
        save(sql, parameter);
    }

    @Override
    public void update(Articulo element) {

        String sql = "UPDATE inv_articulo set referencia = ?, descripcion = ?, codigo_barra = ?, venta_detallado = ?, exento_itbis = ?, "
                + "activo = ?, permite_vencimiento = ?, permite_descuento = ?, ingrediente_activo = ?, id_fabricante = ?, calculo_precio = ?, id_familia = ?, id_marca = ?, id_modelo = ?, "
                + "id_renglon = ?, id_clasarticulo = ? where codigo = ? ";
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        biginTransaction();

        ParametersSet parametersSet = new ParametersSet() {
            @Override
            public void putParameters(PreparedStatement ps) throws SQLException {
                Articulo element = (Articulo) getElement();
                ps.setString(1, element.getReferencia());
                ps.setString(2, element.getDescripcion());
                ps.setString(3, element.getCodigoBarra());
                ps.setString(4, element.getVentaDetallado());
                ps.setString(5, element.getExentoItbis());
                ps.setString(6, element.getActivo());
                ps.setString(7, element.getPermiteVencimiento());
                ps.setString(8, element.getPermiteDescuento());
                ps.setInt(9, element.getIngredienteActivo().getCodigo());
                ps.setInt(10, element.getFabricante().getIdFabricante());
                ps.setString(11, element.getCalculoPrecio().getCalculoPrecio());
                ps.setInt(12, element.getFamilia().getIdFamilia());
                ps.setInt(13, element.getMarca().getIdMarca());
                ps.setInt(14, element.getModelo().getIdModelo());
                ps.setInt(15, element.getRenglon().getIdRenglon());
                ps.setInt(16, element.getClasArticulo().getIdClasArticulo());
                ps.setInt(17, element.getCodigo());
            }
        };
        parametersSet.setElement(element);
        parametersSet.setGenerateKey(true);
        save(sql, parametersSet);
        if (parametersSet.getKeyId() != null) {
            element.setCodigo(parametersSet.getKeyId().intValue());
        }
        //
        for (ArticuloPresentacion ap : element.getPresentaciones()) {
            ap.setArticulo(element);
        }

        if (element.getPresentaciones() != null && !element.getPresentaciones().isEmpty()) {
            updatePresentation(element.getPresentaciones());
        }
        endTransaction();
    }

    public static CalculoPrecio getCalculoPrecio(String codigo) {
        for (CalculoPrecio value : CalculoPrecio.values()) {
            if (value.getCalculoPrecio().equals(codigo)) {
                return value;
            }
        }
        return null;
    }

    public static String getCalculoPrecio(CalculoPrecio value) {
        for (CalculoPrecio element : CalculoPrecio.values()) {
            if (element.equals(value)) {
                return element.getCalculoPrecio();
            }
        }
        return null;
    }


    public List<Presentacion> listPresentation(ArticuloPresentacion articulo) {
        String sql = "select pres.*, unidad.identificador as idenunidad, unidad.descripcion as descunidad "
                + "from inv_articulo_presentacion artpres "
                + "inner join inv_presentacion pres "
                + "on artpres.presentacion = pres.codigo "
                + "inner join inv_unidad unidad "
                + "on pres.unidad = unidad.id_unidad "
                + "and artpres.articulo = " + articulo.getArticulo().getCodigo();
        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
        return (List<Presentacion>) query(sql, new PresentationRM());
    }

    private void updatePresentation(final List<ArticuloPresentacion> lElement) {

        String sql = "UPDATE inv_articulo_presentacion SET articulo = ?, presentacion = ?, precio1 = ?, precio2 = ?, precio3 = ?, porcentaje1 = ?, porcentaje2 = ?, "
                + "porcentaje3 = ?, barra = ?, costo = ? where codigo = ?";
        BatchPreparedStatementSet batchPreparedStatementSet = new BatchPreparedStatementSet() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ArticuloPresentacion element = lElement.get(i);
                ps.setInt(1, element.getArticulo().getCodigo());
                ps.setInt(2, element.getPresentacion().getCodigo());
                ps.setDouble(3, element.getPrecio1());
                ps.setDouble(4, element.getPrecio2());
                ps.setDouble(5, element.getPrecio3());
                ps.setDouble(6, element.getPorcentaje1());
                ps.setDouble(7, element.getPorcentaje2());
                ps.setDouble(8, element.getPorcentaje3());
                ps.setString(9, element.getBarra());
                ps.setDouble(10, element.getCosto());
                ps.setInt(11, element.getCodigo());
            }

            @Override
            public int getSizeBatch() {
                return lElement.size();
            }
        };
        updateBatch(sql, batchPreparedStatementSet);
    }
}

class ItemRM implements RowMapper<Articulo> {

    @Override
    public Articulo getRow(final ResultSet rs) throws SQLException {
         Articulo p = new Articulo() {
            {
                setCodigo(rs.getInt("codiart"));
                setDescripcion(rs.getString("descriart"));
                setReferencia(rs.getString("refeart"));
                setCodigoBarra(rs.getString("barraart"));
                setVentaDetallado(rs.getString("detaart"));
                setExentoItbis(rs.getString("exentart"));
                setActivo(rs.getString("activoart"));
                setPermiteVencimiento(rs.getString("vencart"));
                setPermiteDescuento(rs.getString("descuentoart"));
                setCalculoPrecio(ManejoArticulo.getCalculoPrecio(rs.getString("calcart")));
                setIngredienteActivo(new IngredienteActivo() {
                    {
                        setCodigo(rs.getInt("codIng"));
                        setIdentificador(rs.getString("idenIngrediente"));
                        setDescripcion(rs.getString("descIngrediente"));
                    }
                });
                setFabricante(new Fabricante(){
                    {
                        setIdFabricante(rs.getInt("codFab"));
                        setIdentificador(rs.getString("idenFabricante"));
                        setNombre(rs.getString("nombFabricante"));
                    }
                });
                setFamilia(new Familia(){
                    {
                        setIdFamilia(rs.getInt("codFam"));
                        setIdentificador(rs.getString("idenFamilia"));
                        setDescripcion(rs.getString("descFamilia"));
                    }
                });
                setMarca(new Marca() {
                    {
                        setIdMarca(rs.getInt("codMarc"));
                        setIdentificador(rs.getString("idenMarca"));
                        setDescripcion(rs.getString("descMarca"));
                    }
                });
                setModelo(new Modelo() {
                    {
                        setIdModelo(rs.getInt("codMod"));
                        setIdentificador(rs.getString("idenModelo"));
                        setDescripcion(rs.getString("descModelo"));
                    }
                });
                setRenglon(new Renglon() {
                    {
                        setIdRenglon(rs.getInt("codReng"));
                        setIdentificador(rs.getString("idenRenglon"));
                        setDescripcion(rs.getString("descRenglon"));
                    }
                });
                setClasArticulo(new ClasArticulo() {
                    {
                        setIdClasArticulo(rs.getInt("codClas"));
                        setIdentificador(rs.getString("idenClas"));
                        setDescripcion(rs.getString("descClas"));
                    }
                });
                
            }
        };
        //p.setPresentaciones(ManejoArticuloPresentacion.getInstance().listItemPresentation(p)); 
        return p;

    }
}

class PresentationRM implements RowMapper<Presentacion> {

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

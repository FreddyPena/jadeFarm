/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.manager;

import com.jadesoft.jadejdbc.jdbc.transactions.jdbcStatemant;

/**
 *
 * @author yiyi
 */
public class ManejoProducto extends jdbcStatemant {//implements DaoStandar<Producto> {
//    private static ManejoProducto manejo;
//
//    public static ManejoProducto getInstance() {
//        if (manejo == null) {
//            manejo = new ManejoProducto();
//        }
//        return manejo;
//    }
//
//    private List<Vencimiento> findAllProductExpiration(Integer id) {
//        String sql = "SELECT * FROM inv_vencimiento WHERE producto = " + id;
//        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
//        
//        return (List<Vencimiento>) query(sql, new RowMapper() {
//
//            @Override
//            public Object getRow(final ResultSet rs) throws SQLException {
//                      Vencimiento v = new Vencimiento() {
//                          
//                    {
//                        setCodigo(rs.getInt("codigo"));
//                        setCantidad(rs.getInt("cantidad"));
//                        setFechaEntrada(rs.getDate("fecha_entrada"));
//                        setFechaVencimiento(rs.getDate("fecha_vencimiento"));
//                        setProducto(new Producto() {
//                            {
//                                setCodigo(rs.getInt("producto"));
//                            }
//                        });
//
//                    }
//                };
//                return v;
//            
//            }
//        });
//    }
//
//    public Producto findProductInvoice(String numProducto) {
//        String sql = "SELECT prod.codigo, prod.num_producto, prod.descripcion, prod.precio_venta1, prod.precio_venta2 "
//                + "FROM inv_producto prod WHERE prod.num_producto = '%s'";
//        sql = String.format(sql, numProducto);
//        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
//        return (Producto) queryForObject(sql, new RowMapper() {
//            @Override
//            public Object getRow(final ResultSet rs) throws SQLException {
//                final Producto p = new Producto() {
//                    {
//                        setCodigo(rs.getInt("codigo"));
//                        setNumProducto(rs.getString("num_producto"));
//                        setDescripcion(rs.getString("descripcion"));
//                        setPrecioVenta1(rs.getDouble("precio_venta1"));
//                        setPrecioVenta2(rs.getDouble("precio_venta2"));
//                        setVencimientoList(findAllProductExpiration(rs.getInt("codigo")));
//                    }
//                };
//                return p;
//            }
//        });
//    }
//
//    @Override
//    public Producto find(Integer id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public List<Producto> findAllEquivalent() {
//        String sql = "SELECT prod.codigo, prod.descripcion, pers.nombre, pers.apellido  "
//                + "FROM inv_producto prod INNER JOIN sys_persona pers ON (pers.codigo = prod.proveedor)";
//        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
//        return (List<Producto>) query(sql, new RowMapper() {
//            @Override
//            public Object getRow(final ResultSet rs) throws SQLException {
//                Producto p = new Producto() {
//                    {
//                        setDescripcion(rs.getString("descripcion"));
//                        setCodigo(rs.getInt("codigo"));
//                        setProveedor(new Proveedor() {
//                            {
//                                setPersona(new Persona() {
//                                    {
//                                        setNombre(rs.getString("nombre"));
//                                        setApellido(rs.getString("apellido"));
//                                    }
//                                });
//                            }
//                        });
//
//                    }
//                };
//                return p;
//            }
//        });
//    }
//
//    public List<Producto> findAllDate(Date fechaIni, Date fechaFin) {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        String sql = "SELECT prod.codigo, prod.num_producto,  prod.descripcion, prod.precio_venta1, prod.existencia, "
//                + "prod.tramo, prod.fila, med.descripcion AS descMedida, alm.descripcion AS descAlmacen, pers.nombre, pers.apellido "
//                + "FROM inv_producto prod INNER JOIN sys_persona pers ON (pers.codigo = prod.proveedor) "
//                + "INNER JOIN inv_almacen alm ON (alm.codigo = prod.almacen) "
//                + "INNER JOIN inv_medida med ON (med.codigo = prod.medida) "
//                + "WHERE prod.fecha BETWEEN '%s' AND '%s'";
//        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
//        sql = String.format(sql, format.format(fechaIni), format.format(fechaFin));
//        return (List<Producto>) query(sql, new ConsultationProductRM());
//    }
//
//    @Override
//    public List<Producto> findAll() {
//        String sql = "SELECT prod.codigo, prod.num_producto,  prod.descripcion, prod.precio_venta1, prod.existencia, "
//                + "prod.tramo, prod.fila, med.descripcion AS descMedida, alm.descripcion AS descAlmacen, pers.nombre, pers.apellido "
//                + "FROM inv_producto prod "
//                + "INNER JOIN sys_persona pers ON (pers.codigo = prod.proveedor) "
//                + "INNER JOIN inv_almacen alm ON (alm.codigo = prod.almacen) "
//                + "INNER JOIN inv_medida med ON (med.codigo = prod.medida)";
//        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
//        return (List<Producto>) query(sql, new ConsultationProductRM());
//    }
//
//    @Override
//    public void create(Producto element) {
//        if (element.getCodigo() != null) {
//            update(element);
//            return;
//        }
//        String sql = "INSERT INTO inv_producto (descripcion, costo, precio_venta1, precio_venta2, "
//                + "utilidad1, utilidad2, tramo, fila, tipo, existencia, existencia_minima, nota, "
//                + "proveedor, impuesto, almacen, referencia, medida) "
//                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        setConnection(jdbcConfiguration.getConnectionJadeFarmacia());
//        biginTransaction();
//        
//        ParametersSet parametersSet = new ParametersSet() {
//            @Override
//            public void putParameters(PreparedStatement ps) throws SQLException {
//                Producto element = (Producto) getElement();
//                ps.setString(1, element.getDescripcion());
//                ps.setDouble(2, element.getCosto());
//                ps.setDouble(3, element.getPrecioVenta1());
//                ps.setDouble(4, element.getPrecioVenta2());
//                ps.setDouble(5, element.getUtilidad1());
//                ps.setDouble(6, element.getUtilidad2());
//                ps.setString(7, element.getTramo());
//                ps.setString(8, element.getFila());
//                ps.setInt(9, getCode(element.getTipo()));
//                ps.setInt(10, element.getExistencia());
//                ps.setShort(11, element.getExistenciaMinima());
//                ps.setString(12, element.getNota());
//                ps.setInt(13, element.getProveedor().getCodPersona());
//                ps.setInt(14, element.getImpuesto().getCodigo());
//                ps.setInt(15, element.getAlmacen().getCodigo());
//                ps.setInt(16, element.getReferencia().getCodigo());
//                ps.setInt(17, element.getMedida().getCodigo());
//            }
//        };
//        parametersSet.setElement(element);
//        parametersSet.setGenerateKey(true);
//        save(sql, parametersSet);
//        if (parametersSet.getKeyId() != null) {
//            element.setCodigo(parametersSet.getKeyId().intValue());
//        }
//
//        List<EquivalenteArticuloDetalle> lEquivalenteDetalleAdd = element.getEquivalenciaDetalleAddList();
//        if (lEquivalenteDetalleAdd != null && !lEquivalenteDetalleAdd.isEmpty()) {
//
//            EquivalenteArticulo equivalencia = null;
//            //Se busca un producto que tenga equivalencia en la tabla de equivalencia, 
//            //para luego asignarle esa equivalencia a los demas producto nuevo
//            for (EquivalenteArticuloDetalle ed : lEquivalenteDetalleAdd) {
//                if (ed.getCodigo() != null) {
//                    equivalencia = ed.getEquivalencia();
//                    break;
//                }
//            }
//            // Si no existe equivalencia se crea una nueva, la cual sera asignada a los nuevo producto
//            if (equivalencia == null) {
//                equivalencia = generatorEquivalent();
//            }
//
//            //se buscan todos los producto que se le va asignar una equivalencia y no tienen,
//            //para asignarle la equivalencia que le corresponde
//            List<EquivalenteArticuloDetalle> lProductAdd = null;
//            for (EquivalenteArticuloDetalle ed : lEquivalenteDetalleAdd) {
//                if (lProductAdd == null) {
//                    lProductAdd = new ArrayList<>();
//                }
//                if (ed.getCodigo() == null) {
//                    if (ed.getProducto().getCodigo() == null) {
//                        ed.setProducto(element);
//                    }
//                    ed.setEquivalencia(equivalencia);
//                    lProductAdd.add(ed);
//                }
//            }
//            if (lProductAdd != null && !lProductAdd.isEmpty()) {
//                createEquivalentDetail(lProductAdd);
//            }
//        }
//
//        if (element.getVencimiento() != null) {
//            element.getVencimiento().setProducto(element);
//            createExpiration(element.getVencimiento());
//        }
//
//        List<EquivalenteArticuloDetalle> lEquivalenteDetalleRemove = element.getEquivalenciaDetalleRemoveList();
//        if (lEquivalenteDetalleRemove != null && !lEquivalenteDetalleRemove.isEmpty()) {
//            deleteEquivalentDetail(lEquivalenteDetalleRemove);
//        }
//        endTransaction();
//    }
//
//    private void createExpiration(final Vencimiento element) {
//        String sql = "INSERT INTO inv_vencimiento (producto, fecha_entrada, fecha_vencimiento, cantidad) "
//                + "VALUES (?, ?, ?, ?)";
//
//        ParametersSet parametersSet = new ParametersSet() {
//            @Override
//            public void putParameters(PreparedStatement ps) throws SQLException {
//                ps.setInt(1, element.getProducto().getCodigo());
//                ps.setDate(2, new java.sql.Date(element.getFechaEntrada().getTime()));
//                ps.setDate(3, new java.sql.Date(element.getFechaVencimiento().getTime()));
//                ps.setInt(4, element.getCantidad());
//            }
//        };
//        save(sql, parametersSet);
//    }
//
//    private void createEquivalentDetail(final List<EquivalenteArticuloDetalle> lElement) {
//
//        String sql = "INSERT INTO inv_equivalencia_detalle (equivalencia, producto) VALUES (?, ?)";
//        BatchPreparedStatementSet batchPreparedStatementSet = new BatchPreparedStatementSet() {
//            @Override
//            public void setValues(PreparedStatement ps, int i) throws SQLException {
//                EquivalenteArticuloDetalle element = lElement.get(i);
//                ps.setInt(1, element.getEquivalencia().getCodigo());
//                ps.setInt(2, element.getProducto().getCodigo());
//            }
//
//            @Override
//            public int getSizeBatch() {
//                return lElement.size();
//            }
//        };
//        updateBatch(sql, batchPreparedStatementSet);
//    }
//
//    private void deleteEquivalentDetail(final List<EquivalenteArticuloDetalle> lElement) {
//
//        String sql = "DELETE FROM inv_equivalencia_detalle  WHERE codigo = ?";
//        BatchPreparedStatementSet batchPreparedStatementSet = new BatchPreparedStatementSet() {
//            @Override
//            public void setValues(PreparedStatement ps, int i) throws SQLException {
//                EquivalenteArticuloDetalle element = lElement.get(i);
//                ps.setInt(2, element.getProducto().getCodigo());
//            }
//
//            @Override
//            public int getSizeBatch() {
//                return lElement.size();
//            }
//        };
//        updateBatch(sql, batchPreparedStatementSet);
//    }
//
//    private EquivalenteArticulo generatorEquivalent() {
//        String sql = "INSERT INTO equivalencia (nota) VALUES (?)";
//        ParametersSet parametersSet = new ParametersSet() {
//            @Override
//            public void putParameters(PreparedStatement ps) throws SQLException {
//                ps.setString(1, "");
//            }
//        };
//        EquivalenteArticulo element = new EquivalenteArticulo();
//        parametersSet.setGenerateKey(true);
//        save(sql, parametersSet);
//        if (parametersSet.getKeyId() != null) {
//            element.setCodigo(parametersSet.getKeyId().intValue());
//        }
//        return element;
//    }
//
//    @Override
//    public void create(List<Producto> lElement) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void delete(Producto element) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void update(Producto element) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Integer getCode(TipoProducto type) {
//        for (TipoProducto tp : TipoProducto.values()) {
//            if (tp.equals(type)) {
//                return tp.getTipoProducto();
//            }
//        }
//        return null;
//    }
//}
//
//class ConsultationProductRM implements RowMapper<Producto> {
//
//    @Override
//    public Producto getRow(final ResultSet rs) throws SQLException {
//        Producto p = new Producto() {
//            {
//                setDescripcion(rs.getString("descripcion"));
//                setCodigo(rs.getInt("codigo"));
//                setNumProducto(rs.getString("num_producto"));
//                setPrecioVenta1(rs.getDouble("precio_venta1"));
//                setExistencia(rs.getInt("existencia"));
//                setTramo(rs.getString("tramo"));
//                setFila(rs.getString("fila"));
//                setMedida(new Medida() {
//                    {
//                        setDescripcion("descMedida");
//                    }
//                });
//                setAlmacen(new Almacen() {
//                    {
//                        setDescripcion(rs.getString("descAlmacen"));
//                    }
//                });
//                setProveedor(new Proveedor() {
//                    {
//                        setPersona(new Persona() {
//                            {
//                                setNombre(rs.getString("nombre"));
//                                setApellido(rs.getString("apellido"));
//                            }
//                        });
//                    }
//                });
//
//            }
//        };
//        return p;
//    }
}

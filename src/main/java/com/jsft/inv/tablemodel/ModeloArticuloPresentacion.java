/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor. TableModelEstudiosSol
 */
package com.jsft.inv.tablemodel;

import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import com.jsft.inv.entity.ArticuloPresentacion;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yiyi
 */
public final class ModeloArticuloPresentacion extends TableModelStandar<ArticuloPresentacion> {

    public ModeloArticuloPresentacion() {
        initTable();
    }

    public void initTable() {

        String Keys[] = {"Presentacion", "Costo", "Precio 1", "Precio 2", "Precio 3"};

        columnIdentifiers.addAll(Arrays.asList(Keys));

        Tipos = new Class[]{String.class, Double.class, Double.class, Double.class, Double.class};
        update();
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ArticuloPresentacion articulo = dataArray.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return articulo.getPresentacion().getDescripcion();
            case 1:
                return articulo.getCosto();
            case 2:
                return articulo.getPrecio1();
            case 3:
                return articulo.getPrecio2();
            case 4:
                return articulo.getPrecio3();
            default:
                return null;
        }
    }
}

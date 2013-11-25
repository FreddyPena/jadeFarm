/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor. TableModelEstudiosSol
 */
package com.jsft.inv.tablemodel;

import com.jsft.inv.entity.Articulo;
import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yiyi
 */
public final class ModeloEquivalente extends TableModelStandar<Articulo> {

    public ModeloEquivalente() {
        initTable();
    }

    public void initTable() {

        String Keys[] = {"Producto", "Proveedor"};

        columnIdentifiers.addAll(Arrays.asList(Keys));

        Tipos = new Class[]{String.class, String.class};
        update();
    }

    @Override
    public void update() {
            setElements(new ArrayList());        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Articulo articulo = dataArray.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return articulo.getDescripcion();
            case 1:
//                return articulo.getSuplidor().toString();
            default:
                return null;
        }
    }
}

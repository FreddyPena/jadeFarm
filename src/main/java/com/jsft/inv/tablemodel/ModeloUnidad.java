/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.tablemodel;

import com.jsft.inv.entity.Unidad;
import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yiyi
 */
public class ModeloUnidad extends TableModelStandar<Unidad> {

    public ModeloUnidad() {
        initComp();
    }

    private void initComp() {
        String key[] = {"Identificador", "Descripción"};
        columnIdentifiers.addAll(Arrays.asList(key));
        Tipos = new Class[]{String.class, String.class};
        update();
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Unidad unidad = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return unidad.getIdentificador();
            case 1:
                return unidad.getDescripcion();
            default:
                return null;
        }
    }
}

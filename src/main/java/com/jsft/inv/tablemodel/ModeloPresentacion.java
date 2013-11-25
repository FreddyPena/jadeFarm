/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.tablemodel;

import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import com.jsft.inv.entity.Presentacion;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yiyi
 */
public final class ModeloPresentacion extends TableModelStandar<Presentacion> {

    public ModeloPresentacion() {
        initComp();
    }

    private void initComp() {
        String key[] = {"Identificador", "Descripción", "Unidad"};
        columnIdentifiers.addAll(Arrays.asList(key));
        Tipos = new Class[]{String.class, String.class, String.class};
        update();
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Presentacion presentacion = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return presentacion.getIdentificador();
            case 1:
                return presentacion.getDescripcion();
            case 2: 
                return presentacion.getUnidad().getDescripcion();
            default:
                return null;
        }

    }

}

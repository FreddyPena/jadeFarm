/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.tablemodel;

import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import com.js.shared.models.InvAlmacen;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JADESOFT
 */
public final class ModeloAlmacen extends TableModelStandar<InvAlmacen> {

    public ModeloAlmacen() {
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
        InvAlmacen almacen = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return almacen.getIdentificador();
            case 1:
                return almacen.getDescripcion();
            default:
                return null;
        }

    }
}

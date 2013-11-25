/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.tablemodel;

import com.jsft.inv.entity.Familia;
import com.jsft.inv.entity.Renglon;
import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yiyi
 */
public final class ModeloRenglon extends TableModelStandar<Renglon> {

    public ModeloRenglon() {
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
        Renglon renglon = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return renglon.getIdentificador();
            case 1:
                return renglon.getDescripcion();
            default:
                return null;
        }

    }

}

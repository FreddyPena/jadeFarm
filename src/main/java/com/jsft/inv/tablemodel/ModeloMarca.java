/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.tablemodel;

import com.jsft.inv.entity.Marca;
import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yiyi
 */
public final class ModeloMarca extends TableModelStandar<Marca> {

    public ModeloMarca() {
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
        Marca marca = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return marca.getIdentificador();
            case 1:
                return marca.getDescripcion();
            default:
                return null;
        }

    }

}

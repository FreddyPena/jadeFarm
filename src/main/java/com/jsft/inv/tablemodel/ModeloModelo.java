/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.tablemodel;

import com.jsft.inv.entity.Modelo;
import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yiyi
 */
public final class ModeloModelo extends TableModelStandar<Modelo> {

    public ModeloModelo() {
        initComp();
    }

    private void initComp() {
        String key[] = {"Identificador", "Descripción", "Marca"};
        columnIdentifiers.addAll(Arrays.asList(key));
        Tipos = new Class[]{String.class, String.class, Object.class};
        update();
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Modelo modelo = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return modelo.getIdentificador();
            case 1:
                return modelo.getDescripcion();
            case 2: 
                return modelo.getMarca().getDescripcion();
            default:
                return null;
        }

    }

}

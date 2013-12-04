/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.tablesmodel;

import com.js.shared.models.InvPresentacion;
import com.js.swing.table.JTableModelJS;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JADESOFT
 */
public final class ModelPresentacion extends JTableModelJS<InvPresentacion> {

    public ModelPresentacion() {
        initComp();
    }

    private void initComp() {
        String key[] = {"Identificador", "Descripción", "Factor", "Unidad"};
        columnIdentifiers.addAll(Arrays.asList(key));
        clazz = new Class[]{String.class, String.class, Double.class, String.class};
        update();
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvPresentacion presentacion = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return presentacion.getIdentificador();
            case 1:
                return presentacion.getDescripcion();
            case 2:
                return presentacion.getFactor();
            case 3:
                return presentacion.getUnidad().getDescripcion();
            default:
                return null;
        }

    }
}

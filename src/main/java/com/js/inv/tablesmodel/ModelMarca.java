/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.tablesmodel;

import com.js.shared.models.InvMarca;
import com.js.swing.table.JTableModelJS;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JADESOFT
 */
public final class ModelMarca extends JTableModelJS<InvMarca> {

    public ModelMarca() {
        initComp();
    }

    private void initComp() {
        String key[] = {"Identificador", "Descripción"};
        columnIdentifiers.addAll(Arrays.asList(key));
        clazz = new Class[]{String.class, String.class};
        update();
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvMarca marca = dataArray.get(rowIndex);
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

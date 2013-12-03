/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.tablesmodel;

import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import com.js.shared.models.InvIngredienteActivo;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JADESOFT
 */
public final class ModelIngrActivo extends TableModelStandar<InvIngredienteActivo> {

    public ModelIngrActivo() {
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
        InvIngredienteActivo ingrediente = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ingrediente.getIdentificador();
            case 1:
                return ingrediente.getDescripcion();
            default:
                return null;
        }

    }
}

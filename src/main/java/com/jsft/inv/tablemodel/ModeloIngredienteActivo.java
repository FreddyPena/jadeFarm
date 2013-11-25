/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.tablemodel;

import com.jsft.inv.entity.IngredienteActivo;
import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yiyi
 */
public class ModeloIngredienteActivo extends TableModelStandar<IngredienteActivo> {

    public ModeloIngredienteActivo() {
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
        IngredienteActivo ingrediente = dataArray.get(rowIndex);
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

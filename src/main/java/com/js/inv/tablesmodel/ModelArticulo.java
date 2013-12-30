/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.inv.tablesmodel;

import com.js.shared.models.InvArticulo;
import com.js.swing.table.JTableModelJS;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JADESOFT
 */
public class ModelArticulo extends JTableModelJS<InvArticulo> {

    public ModelArticulo() {
        initTable();
    }

    private void initTable() {
        String Keys[] = {"Referencia", "Descripcion", "Código Barra", "Ing. Activo"};
        columnIdentifiers.addAll(Arrays.asList(Keys));
        clazz = new Class[]{String.class, String.class, String.class, String.class};
        update();
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvArticulo articulo = dataArray.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return articulo.getReferencia();
            case 1:
                return articulo.getDescripcion();
            case 2:
                return articulo.getCodigoBarra();
            case 3:
                return articulo.getIngredienteActivo().getDescripcion();
            default:
                return null;
        }
    }
}

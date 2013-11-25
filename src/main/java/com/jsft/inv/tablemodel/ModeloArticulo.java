/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.tablemodel;

import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import com.jsft.inv.entity.Articulo;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ing
 */
public class ModeloArticulo extends TableModelStandar<Articulo> {
    
    public ModeloArticulo() {
        initTable();
    }

    private void initTable() {
        String Keys[] = {"Referencia", "Descripcion", "Código Barra", "Ing. Activo"};
        columnIdentifiers.addAll(Arrays.asList(Keys));
        Tipos = new Class[]{String.class, String.class, String.class, String.class};
        update();
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Articulo articulo = dataArray.get(rowIndex);

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

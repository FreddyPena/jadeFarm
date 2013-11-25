/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.tablemodel;

import com.jsft.inv.entity.Fabricante;
import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yiyi
 */
public class ModeloFabricante extends TableModelStandar<Fabricante> {

    public ModeloFabricante() {
        initComp();
    }

    private void initComp() {
        String key[] = {"Identificador", "Nombre", "RNC", "Télefono"};
        columnIdentifiers.addAll(Arrays.asList(key));
        Tipos = new Class[]{String.class, String.class, String.class, String.class};
        update();
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fabricante fabricante = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return fabricante.getIdentificador();
            case 1:
                return fabricante.getNombre();
            case 2:
                return fabricante.getRnc();
            case 3:
                return fabricante.getTelefono1()+ "Ext: "+ fabricante.getExttel1();
            default:
                return null;
        }
    }
}

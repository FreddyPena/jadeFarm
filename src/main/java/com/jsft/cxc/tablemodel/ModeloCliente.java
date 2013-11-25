/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.cxc.tablemodel;

import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import com.jsft.gen.entity.Persona;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yiyi
 */
public final class ModeloCliente extends TableModelStandar<Persona> {

    public ModeloCliente() {
        initComp();
    }

    private void initComp() {
        String column[] = {"Codigo", "Cliente", "Identificacion", "Limite Credito", "Pendiente"};
        columnIdentifiers.addAll(Arrays.asList(column));
        Tipos = new Class[]{Integer.class, String.class, String.class, Double.class, Double.class};
        update();
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona cliente = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cliente.getCodigo();
            case 1:
                return cliente.toString();
            case 2:
                return cliente.getIdentificacion();
//            case 3:
//                return cliente.getLimiteCredito();
//            case 4:
//                return cliente.getPendiente();
            default:
                return null;
        }
    }
}

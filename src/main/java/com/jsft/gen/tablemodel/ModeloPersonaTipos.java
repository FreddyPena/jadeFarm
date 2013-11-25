/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.gen.tablemodel;

import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import com.jsft.gen.entity.PersonaTipoPersona;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Hector Ventura
 */
public final class ModeloPersonaTipos extends TableModelStandar<PersonaTipoPersona> {

    public ModeloPersonaTipos() {
        initComp();
    }

    private void initComp() {
        String key[] = {"Tipo Entidad", "Estado", "Cuenta"};
        columnIdentifiers.addAll(Arrays.asList(key));
        Tipos = new Class[]{String.class, Boolean.class, String.class};
        update();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 1 ? true : false;
    }

    @Override
    public void update() {
        setElements(new ArrayList());
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PersonaTipoPersona ca = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ca.getTipoPesona().getDescripcion();
            case 1:
                return ca.getHabilitado();
            case 2:
                return ca.getAuxiliar();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        if (columnIndex == 1 && aValue instanceof Boolean) {
            PersonaTipoPersona ca = dataArray.get(rowIndex);
            ca.setHabilitado((Boolean) aValue);

        }
    }
}

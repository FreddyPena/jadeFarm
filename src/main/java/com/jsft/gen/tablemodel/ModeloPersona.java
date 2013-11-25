/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.gen.tablemodel;

import com.jadesoft.jadelib.estandar.tablas.TableModelStandar;
import com.jsft.gen.entity.Persona;
import com.jsft.gen.manager.ManejoPersona;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Hector Ventura
 */
public final class ModeloPersona extends TableModelStandar<Persona> {

    public ModeloPersona() {
        initComp();
    }

    private void initComp() {
        String key[] = {"Código", "Nombre", "Identificación"};
        columnIdentifiers.addAll(Arrays.asList(key));
        Tipos = new Class[]{Integer.class, String.class, String.class};
       update();
    }

    @Override
    public void update() {
        dataArray = ManejoPersona.getInstancia().findAll();
        fireTableDataChanged();
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = dataArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return persona.getCodigo();
            case 1:
                return persona.toString();
            case 2:
                return persona.getIdentificacion();
            default:
                return null;
        }
    }
}

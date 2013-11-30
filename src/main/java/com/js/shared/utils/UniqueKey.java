/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.shared.utils;

/**
 *
 * @author JADESOFT
 * @param <T>
 */
public abstract class UniqueKey<T> {

    protected boolean duplicated;
    protected String field;
    protected String value;
    protected String copyValue;

    public UniqueKey() {

    }

    public abstract void setHQL(Class clazz, String field, String value);

    public abstract void setSQL(String table, String field, String value);

    public abstract boolean getDuplicated();

    protected boolean getRepeat() {
        return this.copyValue != null && this.value.equals(this.copyValue);
    }
    
    

}

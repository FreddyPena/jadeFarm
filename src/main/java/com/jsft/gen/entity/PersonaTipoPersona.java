/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.gen.entity;

import java.io.Serializable;

/**
 *
 * @author Hector Ventura
 */
public class PersonaTipoPersona implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigo;
    private String auxiliar;
    private Double limite;
    private Boolean habilitado;
    private Persona persona;
    private TipoPersona tipoPesona;

    public PersonaTipoPersona() {
    }

    public PersonaTipoPersona(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(String auxiliar) {
        this.auxiliar = auxiliar;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public TipoPersona getTipoPesona() {
        return tipoPesona;
    }

    public void setTipoPersona(TipoPersona tipoPesona) {
        this.tipoPesona = tipoPesona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaTipoPersona)) {
            return false;
        }
        PersonaTipoPersona other = (PersonaTipoPersona) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsft.gen.entity.PersonaTipoPersona[ codigo=" + codigo + " ]";
    }
}

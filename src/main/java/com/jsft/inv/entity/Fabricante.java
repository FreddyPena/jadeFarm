/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.entity;

/**
 *
 * @author Ing
 */

public class Fabricante {
    
    private Integer idFabricante;
    private String identificador;
    private String nombre;
    private String rnc;
    private String referenciaFabricante;
    private String direccion;
    private String telefono1;
    private String exttel1;
    private String telefono2;
    private String exttel2;
    private String fax;
    private String movil;
    private String contacto;
    private String telefonoContacto;
    private String extContacto;
    private String nota;
    private String correo;
    private String paginaweb;

    public Fabricante() {
    }

    public Fabricante(Integer idFabricante) {
        this.idFabricante = idFabricante;
    }

    public Integer getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Integer idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRnc() {
        return rnc;
    }

    public void setRnc(String rnc) {
        this.rnc = rnc;
    }

    public String getReferenciaFabricante() {
        return referenciaFabricante;
    }

    public void setReferenciaFabricante(String referenciaFabricante) {
        this.referenciaFabricante = referenciaFabricante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getExttel1() {
        return exttel1;
    }

    public void setExttel1(String exttel1) {
        this.exttel1 = exttel1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getExttel2() {
        return exttel2;
    }

    public void setExttel2(String exttel2) {
        this.exttel2 = exttel2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getExtContacto() {
        return extContacto;
    }

    public void setExtContacto(String extContacto) {
        this.extContacto = extContacto;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPaginaweb() {
        return paginaweb;
    }

    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFabricante != null ? idFabricante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fabricante)) {
            return false;
        }
        Fabricante other = (Fabricante) object;
        if ((this.idFabricante == null && other.idFabricante != null) || (this.idFabricante != null && !this.idFabricante.equals(other.idFabricante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

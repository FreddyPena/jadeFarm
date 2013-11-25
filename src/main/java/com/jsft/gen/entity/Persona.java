/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.gen.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Hector Ventura
 */
public class Persona implements Serializable {

    private Integer codigo;
    private String nombre;
    private String apellido;
    private Short tipoIdentificacion;
    private String identificacion;
    private String identificacion1;
    private Date fechaRegistro;
    private String direccion;
    private String telefono;
    private String telefono2;
    private String correo;
    private String fax;
    private String direccionWeb;
    private boolean habilitado;
    private String nota;
    private short tipoEntidad;
    private String estadoCivil;
    private String poliza;
    private Short precioListaDefecto;
    private Double porsientoDescuento;
    private Boolean excentoItbis;
    private Short regimenPerteneciente;
    private String sexo;
    private List<PersonaTipoPersona> personaTipoPersonaList;

    public Persona() {
    }

    public Persona(Integer codigo) {
        this.codigo = codigo;
    }

    public Persona(Integer codigo, boolean habilitado, short tipoEntidad) {
        this.codigo = codigo;
        this.habilitado = habilitado;
        this.tipoEntidad = tipoEntidad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Short getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(Short tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getIdentificacion1() {
        return identificacion1;
    }

    public void setIdentificacion1(String identificacion1) {
        this.identificacion1 = identificacion1;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDireccionWeb() {
        return direccionWeb;
    }

    public void setDireccionWeb(String direccionWeb) {
        this.direccionWeb = direccionWeb;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public short getTipoEntidad() {
        return tipoEntidad;
    }

    public void setTipoEntidad(short tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public Short getPrecioListaDefecto() {
        return precioListaDefecto;
    }

    public void setPrecioListaDefecto(Short precioListaDefecto) {
        this.precioListaDefecto = precioListaDefecto;
    }

    public Double getPorsientoDescuento() {
        return porsientoDescuento;
    }

    public void setPorsientoDescuento(Double porsientoDescuento) {
        this.porsientoDescuento = porsientoDescuento;
    }

    public Boolean getExcentoItbis() {
        return excentoItbis;
    }

    public void setExcentoItbis(Boolean excentoItbis) {
        this.excentoItbis = excentoItbis;
    }

    public Short getRegimenPerteneciente() {
        return regimenPerteneciente;
    }

    public void setRegimenPerteneciente(Short regimenPerteneciente) {
        this.regimenPerteneciente = regimenPerteneciente;
    }

    public List<PersonaTipoPersona> getPersonaTipoPersonaList() {
        return personaTipoPersonaList;
    }

    public void setPersonaTipoPersonaList(List<PersonaTipoPersona> personaTipoPersonaList) {
        this.personaTipoPersonaList = personaTipoPersonaList;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;

    }
}

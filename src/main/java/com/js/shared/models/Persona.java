/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.js.shared.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author JADESOFT
 */
@Entity
@Table(name = "persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")})
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_identificacion")
    private short tipoIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "identificacion")
    private String identificacion;
    @Size(max = 15)
    @Column(name = "num_afiliado")
    private String numAfiliado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 13)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 13)
    @Column(name = "telefono2")
    private String telefono2;
    @Size(max = 50)
    @Column(name = "correo")
    private String correo;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 13)
    @Column(name = "fax")
    private String fax;
    @Size(max = 50)
    @Column(name = "direccion_web")
    private String direccionWeb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "habilitado")
    private boolean habilitado;
    @Lob
    @Size(max = 65535)
    @Column(name = "nota")
    private String nota;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_entidad")
    private short tipoEntidad;
    @Column(name = "estado_civil")
    private Character estadoCivil;
    @Size(max = 25)
    @Column(name = "poliza")
    private String poliza;
    @Column(name = "precio_lista_defecto")
    private Short precioListaDefecto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porsiento_descuento")
    private Double porsientoDescuento;
    @Column(name = "excento_itbis")
    private Boolean excentoItbis;
    @Column(name = "regimen_perteneciente")
    private Short regimenPerteneciente;
    @Column(name = "sexo")
    private Character sexo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<InvCotizacion> invCotizacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<ReciboIngreso> reciboIngresoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<InvMovimiento> invMovimientoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<PersonaTipoPersona> personaTipoPersonaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<InvOrdenCompra> invOrdenCompraList;

    public Persona() {
    }

    public Persona(Integer codigo) {
        this.codigo = codigo;
    }

    public Persona(Integer codigo, String nombre, String apellido, short tipoIdentificacion, String identificacion, Date fechaRegistro, String direccion, boolean habilitado, short tipoEntidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.fechaRegistro = fechaRegistro;
        this.direccion = direccion;
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

    public short getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(short tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNumAfiliado() {
        return numAfiliado;
    }

    public void setNumAfiliado(String numAfiliado) {
        this.numAfiliado = numAfiliado;
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

    public Character getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Character estadoCivil) {
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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvCotizacion> getInvCotizacionList() {
        return invCotizacionList;
    }

    public void setInvCotizacionList(List<InvCotizacion> invCotizacionList) {
        this.invCotizacionList = invCotizacionList;
    }

    @XmlTransient
    @JsonIgnore
    public List<ReciboIngreso> getReciboIngresoList() {
        return reciboIngresoList;
    }

    public void setReciboIngresoList(List<ReciboIngreso> reciboIngresoList) {
        this.reciboIngresoList = reciboIngresoList;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvMovimiento> getInvMovimientoList() {
        return invMovimientoList;
    }

    public void setInvMovimientoList(List<InvMovimiento> invMovimientoList) {
        this.invMovimientoList = invMovimientoList;
    }

    @XmlTransient
    @JsonIgnore
    public List<PersonaTipoPersona> getPersonaTipoPersonaList() {
        return personaTipoPersonaList;
    }

    public void setPersonaTipoPersonaList(List<PersonaTipoPersona> personaTipoPersonaList) {
        this.personaTipoPersonaList = personaTipoPersonaList;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvOrdenCompra> getInvOrdenCompraList() {
        return invOrdenCompraList;
    }

    public void setInvOrdenCompraList(List<InvOrdenCompra> invOrdenCompraList) {
        this.invOrdenCompraList = invOrdenCompraList;
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
        return "com.js.shared.models.Persona[ codigo=" + codigo + " ]";
    }

}

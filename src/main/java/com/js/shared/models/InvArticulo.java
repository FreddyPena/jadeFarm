/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.js.shared.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Table(name = "inv_articulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvArticulo.findAll", query = "SELECT i FROM InvArticulo i")})
public class InvArticulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "barra")
    private String barra;
    @Column(name = "laboratorio")
    private Integer laboratorio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private boolean activo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "permite_vencimiento")
    private boolean permiteVencimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "venta_detallado")
    private boolean ventaDetallado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "exento_itbis")
    private boolean exentoItbis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo")
    private List<InvArticuloAlmacen> invArticuloAlmacenList;
    @JoinColumn(name = "renglon", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvRenglon renglon;
    @JoinColumn(name = "marca", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvMarca marca;
    @JoinColumn(name = "familia", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvFamilia familia;
    @JoinColumn(name = "clasificacion", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvClasificacion clasificacion;
    @JoinColumn(name = "ingrediente_activo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvIngredienteActivo ingredienteActivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo")
    private List<InvArticuloPresentacion> invArticuloPresentacionList;

    public InvArticulo() {
    }

    public InvArticulo(Integer codigo) {
        this.codigo = codigo;
    }

    public InvArticulo(Integer codigo, String descripcion, boolean activo, boolean permiteVencimiento, boolean ventaDetallado, boolean exentoItbis) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.activo = activo;
        this.permiteVencimiento = permiteVencimiento;
        this.ventaDetallado = ventaDetallado;
        this.exentoItbis = exentoItbis;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBarra() {
        return barra;
    }

    public void setBarra(String barra) {
        this.barra = barra;
    }

    public Integer getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Integer laboratorio) {
        this.laboratorio = laboratorio;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean getPermiteVencimiento() {
        return permiteVencimiento;
    }

    public void setPermiteVencimiento(boolean permiteVencimiento) {
        this.permiteVencimiento = permiteVencimiento;
    }

    public boolean getVentaDetallado() {
        return ventaDetallado;
    }

    public void setVentaDetallado(boolean ventaDetallado) {
        this.ventaDetallado = ventaDetallado;
    }

    public boolean getExentoItbis() {
        return exentoItbis;
    }

    public void setExentoItbis(boolean exentoItbis) {
        this.exentoItbis = exentoItbis;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvArticuloAlmacen> getInvArticuloAlmacenList() {
        return invArticuloAlmacenList;
    }

    public void setInvArticuloAlmacenList(List<InvArticuloAlmacen> invArticuloAlmacenList) {
        this.invArticuloAlmacenList = invArticuloAlmacenList;
    }

    public InvRenglon getRenglon() {
        return renglon;
    }

    public void setRenglon(InvRenglon renglon) {
        this.renglon = renglon;
    }

    public InvMarca getMarca() {
        return marca;
    }

    public void setMarca(InvMarca marca) {
        this.marca = marca;
    }

    public InvFamilia getFamilia() {
        return familia;
    }

    public void setFamilia(InvFamilia familia) {
        this.familia = familia;
    }

    public InvClasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(InvClasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public InvIngredienteActivo getIngredienteActivo() {
        return ingredienteActivo;
    }

    public void setIngredienteActivo(InvIngredienteActivo ingredienteActivo) {
        this.ingredienteActivo = ingredienteActivo;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvArticuloPresentacion> getInvArticuloPresentacionList() {
        return invArticuloPresentacionList;
    }

    public void setInvArticuloPresentacionList(List<InvArticuloPresentacion> invArticuloPresentacionList) {
        this.invArticuloPresentacionList = invArticuloPresentacionList;
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
        if (!(object instanceof InvArticulo)) {
            return false;
        }
        InvArticulo other = (InvArticulo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvArticulo[ codigo=" + codigo + " ]";
    }

}

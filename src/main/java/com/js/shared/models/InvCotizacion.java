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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "inv_cotizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvCotizacion.findAll", query = "SELECT i FROM InvCotizacion i")})
public class InvCotizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 45)
    @Column(name = "num_cotizacion")
    private String numCotizacion;
    @JoinColumn(name = "persona", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Persona persona;
    @JoinColumn(name = "pedido", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private InvPedido pedido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizacion")
    private List<InvDetalleCotizacion> invDetalleCotizacionList;

    public InvCotizacion() {
    }

    public InvCotizacion(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumCotizacion() {
        return numCotizacion;
    }

    public void setNumCotizacion(String numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public InvPedido getPedido() {
        return pedido;
    }

    public void setPedido(InvPedido pedido) {
        this.pedido = pedido;
    }

    @XmlTransient
    @JsonIgnore
    public List<InvDetalleCotizacion> getInvDetalleCotizacionList() {
        return invDetalleCotizacionList;
    }

    public void setInvDetalleCotizacionList(List<InvDetalleCotizacion> invDetalleCotizacionList) {
        this.invDetalleCotizacionList = invDetalleCotizacionList;
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
        if (!(object instanceof InvCotizacion)) {
            return false;
        }
        InvCotizacion other = (InvCotizacion) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.js.shared.models.InvCotizacion[ codigo=" + codigo + " ]";
    }

}

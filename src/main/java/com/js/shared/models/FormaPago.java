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
import javax.persistence.Id;
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
@Table(name = "forma_pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormaPago.findAll", query = "SELECT f FROM FormaPago f")})
public class FormaPago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Integer codigo;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formaPago")
    private List<ReciboIngresoFormapago> reciboIngresoFormapagoList;

    public FormaPago() {
    }

    public FormaPago(Integer codigo) {
        this.codigo = codigo;
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

    @XmlTransient
    @JsonIgnore
    public List<ReciboIngresoFormapago> getReciboIngresoFormapagoList() {
        return reciboIngresoFormapagoList;
    }

    public void setReciboIngresoFormapagoList(List<ReciboIngresoFormapago> reciboIngresoFormapagoList) {
        this.reciboIngresoFormapagoList = reciboIngresoFormapagoList;
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
        if (!(object instanceof FormaPago)) {
            return false;
        }
        FormaPago other = (FormaPago) object;
        return (this.codigo != null || other.codigo == null) && (this.codigo == null || this.codigo.equals(other.codigo));
    }

    @Override
    public String toString() {
        return "com.js.shared.models.FormaPago[ codigo=" + codigo + " ]";
    }

}

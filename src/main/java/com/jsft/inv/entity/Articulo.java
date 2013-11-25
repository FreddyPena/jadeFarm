/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsft.inv.entity;

import com.jsft.inv.utils.CalculoPrecio;
import java.util.List;

/**
 *
 * @author Ing
 */
public class Articulo {

    private Integer codigo;
    private String descripcion;
    private String codigoBarra;
    private String ventaDetallado;
    private String exentoItbis;
    private String activo;
    private String permiteVencimiento;
    private String permiteDescuento;
    private CalculoPrecio calculoPrecio;
    private Renglon renglon;
    private Modelo modelo;
    private Marca marca;
    private Familia familia;
    private ClasArticulo clasArticulo;
    private Fabricante fabricante;
    private IngredienteActivo ingredienteActivo;
    private String referencia;
    private List<ArticuloPresentacion> presentaciones;

    public List<ArticuloPresentacion> getPresentaciones() {
        return presentaciones;
    }

    public void setPresentaciones(List<ArticuloPresentacion> presentaciones) {
        this.presentaciones = presentaciones;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Articulo() {
    }

    public Articulo(Integer codigo) {
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

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getVentaDetallado() {
        return ventaDetallado;
    }

    public void setVentaDetallado(String ventaDetallado) {
        this.ventaDetallado = ventaDetallado;
    }

    public String getExentoItbis() {
        return exentoItbis;
    }

    public void setExentoItbis(String exentoItbis) {
        this.exentoItbis = exentoItbis;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getPermiteVencimiento() {
        return permiteVencimiento;
    }

    public void setPermiteVencimiento(String permiteVencimiento) {
        this.permiteVencimiento = permiteVencimiento;
    }

    public String getPermiteDescuento() {
        return permiteDescuento;
    }

    public void setPermiteDescuento(String permiteDescuento) {
        this.permiteDescuento = permiteDescuento;
    }

    public CalculoPrecio getCalculoPrecio() {
        return calculoPrecio;
    }

    public void setCalculoPrecio(CalculoPrecio calculoPrecio) {
        this.calculoPrecio = calculoPrecio;
    }

    public Renglon getRenglon() {
        return renglon;
    }

    public void setRenglon(Renglon renglon) {
        this.renglon = renglon;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public ClasArticulo getClasArticulo() {
        return clasArticulo;
    }

    public void setClasArticulo(ClasArticulo clasArticulo) {
        this.clasArticulo = clasArticulo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public IngredienteActivo getIngredienteActivo() {
        return ingredienteActivo;
    }

    public void setIngredienteActivo(IngredienteActivo ingredienteActivo) {
        this.ingredienteActivo = ingredienteActivo;
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
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}

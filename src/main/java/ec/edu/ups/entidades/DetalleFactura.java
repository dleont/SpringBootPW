/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.io.Serializable;

/**
 *
 * @author johan
 */
@Entity
public class DetalleFactura implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoDetalle;
    private String descripcion;
    private double precioUnitario;
    private int cantidad;
    private double precioTotal;
    
    @OneToOne
    @JoinColumn
    private Producto producto;
    
    @ManyToOne
    @JoinColumn
    private Factura facturadetalle;

    public DetalleFactura() {
    }

    
    public DetalleFactura(String descripcion, double precioUnitario, int cantidad, double precioTotal, Producto producto, Factura facturadetalle) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.producto = producto;
        this.facturadetalle = facturadetalle;
    }

    public int getCodigoDetalle() {
        return codigoDetalle;
    }

    public void setCodigoDetalle(int codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Factura getFacturadetalle() {
        return facturadetalle;
    }

    public void setFacturadetalle(Factura facturadetalle) {
        this.facturadetalle = facturadetalle;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "codigoDetalle=" + codigoDetalle + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad + ", precioTotal=" + precioTotal + ", producto=" + producto + ", facturadetalle=" + facturadetalle + '}';
    }
    
    
    
    
}
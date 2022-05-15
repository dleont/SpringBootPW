/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author johan
 */
public class Sucursal {
    
    private int codigo;
    private String nombre;
    private String doreccion;
    private double latencia;
    private double longitud;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "usuario")
    private Set<Usuario> usuario = new HashSet<Usuario>();
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "pedido")
    private Set<Pedido> pedido = new HashSet<Pedido>();

    public Sucursal() {
    }

    public Sucursal(String nombre, String doreccion, double latencia, double longitud) {
        this.nombre = nombre;
        this.doreccion = doreccion;
        this.latencia = latencia;
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDoreccion() {
        return doreccion;
    }

    public void setDoreccion(String doreccion) {
        this.doreccion = doreccion;
    }

    public double getLatencia() {
        return latencia;
    }

    public void setLatencia(double latencia) {
        this.latencia = latencia;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Set<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Set<Usuario> usuario) {
        this.usuario = usuario;
    }

    public Set<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(Set<Pedido> pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "nombre=" + nombre + ", doreccion=" + doreccion + ", latencia=" + latencia + ", longitud=" + longitud + ", usuario=" + usuario + ", pedido=" + pedido + '}';
    }
   
    
    
    
}

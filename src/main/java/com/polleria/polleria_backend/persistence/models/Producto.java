package com.polleria.polleria_backend.persistence.models;

import com.polleria.polleria_backend.persistence.enums.TipoProductoEnum;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(name = "nombre_pedido")
    private String nombreProducto;

    @Column(name = "precio_pedido")
    private float precioProducto;

    @Enumerated(EnumType.STRING)
    private TipoProductoEnum tipoProducto;

    @ManyToMany (mappedBy = "productos")
    private List<Pedido> pedidos;

    //Constructores

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, float precioProducto, TipoProductoEnum tipoProducto, List<Pedido> pedidos) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.tipoProducto = tipoProducto;
        this.pedidos = pedidos;
    }

    //Getters y setters


    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public TipoProductoEnum getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProductoEnum tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}

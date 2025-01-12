package com.polleria.polleria_backend.persistence.models;

import com.polleria.polleria_backend.persistence.enums.TipoPedidoEnum;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(name = "nombre_pedido")
    private String nombrePedido;

    @Column(name = "precio_pedido")
    private float precioProducto;

    @Enumerated(EnumType.STRING)
    private TipoPedidoEnum tipoPedido;

    @ManyToMany (mappedBy = "productos")
    private List<Pedido> pedidos;

    //Constructores

    public Producto() {
    }

    public Producto(int idProducto, String nombrePedido, float precioProducto, TipoPedidoEnum tipoPedido, List<Pedido> pedidos) {
        this.idProducto = idProducto;
        this.nombrePedido = nombrePedido;
        this.precioProducto = precioProducto;
        this.tipoPedido = tipoPedido;
        this.pedidos = pedidos;
    }

    //Getters y setters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public TipoPedidoEnum getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedidoEnum tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}

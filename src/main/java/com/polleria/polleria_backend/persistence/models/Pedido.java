package com.polleria.polleria_backend.persistence.models;

import com.polleria.polleria_backend.persistence.enums.PedidoEnum;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long idPedido;

    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    @Column(name = "fecha_entrega")
    private Date fechaEntrega;

    @Column(name = "total_pagar")
    private float totalPagar;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_pedido")
    private PedidoEnum estadPedido;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_usuario")
    private Usuario cliente;

    @OneToMany
    @JoinColumn(name = "id_motorizado", referencedColumnName = "id_usuario")
    private Usuario motorizado;

    @ManyToMany
    @JoinTable(
            name = "pedido_producto",
            joinColumns = @JoinColumn(name = "id_pedido"),
            inverseJoinColumns = @JoinColumn(name = "id_producto")
    )
    private List<Producto> productos;

    //Contructores

    public Pedido() {
    }

    public Pedido(Long idPedido, Date fechaPedido, Date fechaEntrega, float totalPagar, PedidoEnum estadPedido, Usuario cliente, Usuario motorizado, List<Producto> productos) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.totalPagar = totalPagar;
        this.estadPedido = estadPedido;
        this.cliente = cliente;
        this.motorizado = motorizado;
        this.productos = productos;
    }

    //Getters y setters

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public PedidoEnum getEstadPedido() {
        return estadPedido;
    }

    public void setEstadPedido(PedidoEnum estadPedido) {
        this.estadPedido = estadPedido;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Usuario getMotorizado() {
        return motorizado;
    }

    public void setMotorizado(Usuario motorizado) {
        this.motorizado = motorizado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

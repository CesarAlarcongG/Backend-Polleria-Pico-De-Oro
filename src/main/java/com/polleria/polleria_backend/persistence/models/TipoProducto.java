package com.polleria.polleria_backend.persistence.models;

import com.polleria.polleria_backend.persistence.enums.TipoPedidoEnum;
import jakarta.persistence.*;

@Entity
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPedido;

    @Enumerated(EnumType.STRING)
    private TipoPedidoEnum tipoPedido;

    //Constructores

    public TipoProducto() {
    }

    public TipoProducto(int idTipoPedido, TipoPedidoEnum tipoPedido) {
        this.idTipoPedido = idTipoPedido;
        this.tipoPedido = tipoPedido;
    }

    //Getters y setters

    public int getIdTipoPedido() {
        return idTipoPedido;
    }

    public void setIdTipoPedido(int idTipoPedido) {
        this.idTipoPedido = idTipoPedido;
    }

    public TipoPedidoEnum getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedidoEnum tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
}

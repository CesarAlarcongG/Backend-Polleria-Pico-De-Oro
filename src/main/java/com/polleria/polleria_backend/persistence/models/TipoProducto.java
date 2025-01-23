package com.polleria.polleria_backend.persistence.models;

import com.polleria.polleria_backend.persistence.enums.TipoProductoEnum;
import jakarta.persistence.*;

@Entity
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPedido;

    @Enumerated(EnumType.STRING)
    private TipoProductoEnum tipoProducto;

    //Constructores

    public TipoProducto() {
    }

    public TipoProducto(int idTipoPedido, TipoProductoEnum tipoPedido) {
        this.idTipoPedido = idTipoPedido;
        this.tipoProducto = tipoPedido;
    }

    //Getters y setters


    public int getIdTipoPedido() {
        return idTipoPedido;
    }

    public void setIdTipoPedido(int idTipoPedido) {
        this.idTipoPedido = idTipoPedido;
    }

    public TipoProductoEnum getTipoPedido() {
        return tipoProducto;
    }

    public void setTipoPedido(TipoProductoEnum tipoPedido) {
        this.tipoProducto = tipoPedido;
    }
}

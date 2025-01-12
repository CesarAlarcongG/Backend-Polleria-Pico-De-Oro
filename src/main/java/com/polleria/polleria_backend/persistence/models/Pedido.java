package com.polleria.polleria_backend.persistence.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long idPedido;

    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    @Column(name = "fecha_entrega")
    private Date fechaentrega;

    @Column(name = "total_pagar")
    private float totalPagar;


}

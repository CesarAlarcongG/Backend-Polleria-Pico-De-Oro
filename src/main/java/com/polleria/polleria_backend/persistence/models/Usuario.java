package com.polleria.polleria_backend.persistence.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "contraseña", nullable = false)
    private String contraseña;

    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    private Rol idRol;

    //Constructores

    public Usuario() {
    }

    public Usuario(Long idUsuario, String correo, String contraseña, Rol idRol, List<Pedido> pedidos) {
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.idRol = idRol;
    }

    //Getters y setters


    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }
}

package com.polleria.polleria_backend.persistence.models;

import com.polleria.polleria_backend.persistence.enums.RolEnum;
import jakarta.persistence.*;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private int idRol;

    @Enumerated(value = EnumType.STRING)
    private RolEnum rol;

    public Rol() {
    }

    public Rol(int idRol, RolEnum rol) {
        this.idRol = idRol;
        this.rol = rol;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public RolEnum getRolEnum() {
        return rol;
    }

    public void setRolEnum(RolEnum rol) {
        this.rol = rol;
    }
}

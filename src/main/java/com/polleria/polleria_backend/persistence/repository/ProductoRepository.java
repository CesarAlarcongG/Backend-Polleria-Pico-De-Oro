package com.polleria.polleria_backend.persistence.repository;

import com.polleria.polleria_backend.persistence.models.Producto;
import com.polleria.polleria_backend.service.ProductoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findAllByTipoProducto(String tipoProducto);
    Producto findByNombreProducto(String nombreProducto);
}

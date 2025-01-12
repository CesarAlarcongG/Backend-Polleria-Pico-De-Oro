package com.polleria.polleria_backend.persistence.repository;

import com.polleria.polleria_backend.persistence.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Integer, Producto> {
}

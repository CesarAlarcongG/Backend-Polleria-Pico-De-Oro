package com.polleria.polleria_backend.service;

import com.polleria.polleria_backend.persistence.models.Producto;
import com.polleria.polleria_backend.persistence.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> obtenerTodosLosProductos(){
        return productoRepository.findAll();
    }

    public List<Producto> obtenerProductoPorTipo(String tipoProducto) {
       return null;
    }
}

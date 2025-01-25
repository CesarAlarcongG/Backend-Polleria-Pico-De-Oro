package com.polleria.polleria_backend.service;

import com.polleria.polleria_backend.dto.ProductoDTO;
import com.polleria.polleria_backend.persistence.enums.TipoProductoEnum;
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
    public Producto guardarProducto(ProductoDTO productoDTO){
        Producto producto = new Producto();
        producto.setNombreProducto(productoDTO.getNombre());
        producto.setPrecioProducto(productoDTO.getPrecio());
        TipoProductoEnum tipoProducto = TipoProductoEnum.valueOf(productoDTO.getTipoProducto().toUpperCase().replace(" ", "_"));
        producto.setTipoProducto(tipoProducto);
        return productoRepository.save(producto);
    }

    public Producto obtenerProductoPorNombre(String nombre){
        return productoRepository.findByNombreProducto(nombre);
    }
    public List<Producto> obtenerTodosLosProductos(){
        return productoRepository.findAll();
    }

    public List<Producto> obtenerProductoPorTipo(String tipoProducto) {
       return null;
    }
}

package com.polleria.polleria_backend.controller;

import com.polleria.polleria_backend.dto.ProductoDTO;
import com.polleria.polleria_backend.persistence.models.Producto;
import com.polleria.polleria_backend.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {


    //Inyección de dependencias
    private ProductoService productoService;

    public ProductosController(ProductoService productoService){
        this.productoService = productoService;
    }

    //1. Registro de producto
    @PostMapping("/registrarPlato")
    public ResponseEntity<?> registrarPlatos(@RequestBody ProductoDTO productoDTO){
        //1.1 Verificar si el plato ya existe
        if(productoService.obtenerProductoPorNombre(productoDTO.getNombre()) != null)
            return new ResponseEntity<>("Ya existe el plato", HttpStatus.CONFLICT);

        //1.2 Registramos el pedido
        if (productoService.guardarProducto(productoDTO) != null)
            return new ResponseEntity<>("El Producto se registro con exito", HttpStatus.ACCEPTED);
        else
            return new ResponseEntity<>("Error al registrar el producto", HttpStatus.CONFLICT);

    }

    //2. Obetner pedidos
    @GetMapping("/listado")
    public ResponseEntity<?> obtenerTodosLosProductosc(){
        List<Producto> listadoPedidos = productoService.obtenerTodosLosProductos();

        if(listadoPedidos == null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(listadoPedidos, HttpStatus.FOUND);
    }
    @GetMapping("/listado/{tipo}")
    public ResponseEntity<?> obtenerProductosPorTipoc(@PathVariable String tipo){
        List<Producto> listadoProductos = productoService.obtenerProductoPorTipo(tipo);
        if(listadoProductos == null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(listadoProductos, HttpStatus.FOUND);
    }


}

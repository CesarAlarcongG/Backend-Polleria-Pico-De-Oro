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

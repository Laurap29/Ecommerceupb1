package com.upb.Controlador;

import com.upb.Modelo.Entidades.Producto;
import com.upb.Servicio.ProductoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/productos")
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    public ProductoControlador(ProductoServicio productoServicio) {

        this.productoServicio = productoServicio;
    }

    @GetMapping("/producto")
    public List<Producto> getTodosProducto(){

        return productoServicio.getTodosProducto();
    }

    @GetMapping("/{id}")
    public Producto getProductoId(@PathVariable Long id) {
        return productoServicio.getTodosProductoId(id);
    }

}

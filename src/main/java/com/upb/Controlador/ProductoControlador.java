package com.upb.Controlador;

import com.upb.Modelo.Entidades.Producto;
import com.upb.Servicio.ProductoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    public ProductoControlador(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }
    @GetMapping("/productomanual")
    public List<Producto> getTodosProductoManual(){
        return productoServicio.getTodosProductoManual();
    }

    @GetMapping("/producto")
    public List<Producto> getTodosProducto(){
        return productoServicio.getTodosProducto();
    }

}

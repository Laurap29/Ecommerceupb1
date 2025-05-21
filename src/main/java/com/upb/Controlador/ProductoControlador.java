package com.upb.Controlador;

import com.upb.Modelo.Entidades.Producto;
import com.upb.Servicio.ProductoServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarOrden(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setID(id);
        Producto productoActualizado = productoServicio.updateProducto(producto);
        return new ResponseEntity<>(productoActualizado, HttpStatus.OK);
    }


}

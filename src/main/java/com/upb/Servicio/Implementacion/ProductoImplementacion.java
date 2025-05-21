package com.upb.Servicio.Implementacion;

import com.upb.Modelo.Entidades.Producto;
import com.upb.Modelo.Repositorio.Producto_repositorio;
import com.upb.Servicio.ProductoServicio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoImplementacion implements ProductoServicio {

    private final Producto_repositorio productoRepositorio;

    public ProductoImplementacion(Producto_repositorio productoRepositorio) {
        this.productoRepositorio = productoRepositorio;
    }

    @Override
    public List<Producto> getTodosProducto() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto getTodosProductoId(Long id) {
        return productoRepositorio.encontrarId(id);
    }

    @Override
    public Producto updateProducto(Producto producto) {
        Optional<Producto> ProductoExistente = productoRepositorio.findById(producto.getID());
        if (ProductoExistente.isPresent()) {
            Producto existingProduct = ProductoExistente.get();
            existingProduct.setNombre_prod(producto.getNombre_prod());
            existingProduct.setDescripcion(producto.getDescripcion());
            existingProduct.setFk_categoria_id(producto.getFk_categoria_id());
            return productoRepositorio.save(existingProduct);
        } else {
            throw new RuntimeException("No se ha encontrado esta orden");
        }
    }
}

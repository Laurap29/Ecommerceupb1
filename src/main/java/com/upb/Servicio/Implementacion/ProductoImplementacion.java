package com.upb.Servicio.Implementacion;

import com.upb.Modelo.Entidades.Producto;
import com.upb.Modelo.Repositorio.Producto_repositorio;
import com.upb.Servicio.ProductoServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoImplementacion implements ProductoServicio {

    private final Producto_repositorio productoRepositorio;

    public ProductoImplementacion(Producto_repositorio productoRepositorio) {
        this.productoRepositorio = productoRepositorio;
    }

    @Override
    public List<Producto> getTodosProducto(){
        return productoRepositorio.findAll();
    }

    @Override
    public List<Producto> getTodosProductoManual(){
        return productoRepositorio.traerTodo();
    }


}

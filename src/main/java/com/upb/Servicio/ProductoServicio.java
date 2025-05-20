package com.upb.Servicio;


import com.upb.Modelo.Entidades.Producto;
import com.upb.Modelo.Repositorio.Categoria_repositorio;

import java.util.List;

public interface ProductoServicio {

    List<Producto> getTodosProducto();

    Producto getTodosProductoId(Long id);

}

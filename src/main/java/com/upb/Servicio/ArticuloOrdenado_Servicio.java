package com.upb.Servicio;

import com.upb.Modelo.Entidades.Articulo_ordenado;

import java.util.List;

public interface ArticuloOrdenado_Servicio {

    List<Articulo_ordenado> getTodosArticulos();

    Articulo_ordenado getArticulobyId(Long id);

    Articulo_ordenado updateArticulo(Articulo_ordenado articuloOrdenado);

}


package com.upb.Servicio;

import com.upb.Modelo.Entidades.Articulo_ordenado;

import java.util.List;

public interface ArticuloOrdenado_Servicio {

    List<Articulo_ordenado> getTodosArticulos();

    List<Articulo_ordenado> getTodosArticulosManual();

}


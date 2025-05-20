package com.upb.Servicio;

import com.upb.Modelo.Entidades.Categoria;

import java.util.List;

public interface CategoriaServicio {

    List<Categoria> getTodasCategoria();

    Categoria getCategoriabyId(Long id);
}

package com.upb.Controlador;

import com.upb.Modelo.Entidades.Categoria;
import com.upb.Servicio.CategoriaServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CategoriaControlador {

    private final CategoriaServicio categoriaServicio;

    public CategoriaControlador(CategoriaServicio categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    @GetMapping("/categoriamanual")
    public List<Categoria> getTodasCategoriaManual(){
        return categoriaServicio.getTodosCategoriaManual();
    }

    @GetMapping("/categoria")
    public List<Categoria> getTodasCategoria(){
        return categoriaServicio.getTodasCategoria();
    }
}

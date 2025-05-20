package com.upb.Controlador;

import com.upb.Modelo.Entidades.Categoria;
import com.upb.Servicio.CategoriaServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/categorias")
public class CategoriaControlador {

    private final CategoriaServicio categoriaServicio;

    public CategoriaControlador(CategoriaServicio categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    @GetMapping("/categoria")
    public List<Categoria> getTodasCategoria(){
        return categoriaServicio.getTodasCategoria();
    }

    @GetMapping("/{id}")
    public Categoria getTodosCategoriaId(@PathVariable Long id) {
        return categoriaServicio.getCategoriabyId(id);
    }

}

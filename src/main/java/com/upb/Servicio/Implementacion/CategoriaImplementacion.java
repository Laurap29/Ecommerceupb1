package com.upb.Servicio.Implementacion;


import com.upb.Modelo.Entidades.Categoria;
import com.upb.Modelo.Repositorio.Categoria_repositorio;
import com.upb.Servicio.CategoriaServicio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaImplementacion implements CategoriaServicio {

    private final Categoria_repositorio categoriaRepositorio;

    public CategoriaImplementacion(Categoria_repositorio categoriaRepositorio) {
        this.categoriaRepositorio = categoriaRepositorio;
    }

    @Override
    public List<Categoria> getTodasCategoria(){
        return categoriaRepositorio.findAll();
    }

    @Override
    public Categoria getCategoriabyId(Long id){
        return categoriaRepositorio.encontrarId(id);
    }

    @Override
    public Categoria updateCategoria(Categoria categoria) {
        Optional<Categoria> CategoriaExistente = categoriaRepositorio.findById(categoria.getID());
        if (CategoriaExistente.isPresent()) {
            Categoria existingCategory = CategoriaExistente.get();
            existingCategory.setNombre_cat(categoria.getNombre_cat());
            return categoriaRepositorio.save(existingCategory);
        } else {
            throw new RuntimeException("No se ha encontrado esta categoria");

        }
    }





}

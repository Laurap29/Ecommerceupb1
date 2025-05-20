package com.upb.Servicio.Implementacion;


import com.upb.Modelo.Entidades.Categoria;
import com.upb.Modelo.Repositorio.Categoria_repositorio;
import com.upb.Servicio.CategoriaServicio;
import org.springframework.stereotype.Service;

import java.util.List;

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




}

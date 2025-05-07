package com.upb.Servicio.Implementacion;

import com.upb.Modelo.Entidades.Articulo_ordenado;
import com.upb.Modelo.Repositorio.Articulo_ordenado_repositorio;
import com.upb.Servicio.ArticuloOrdenado_Servicio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticuloOrdenado_Implementacion implements ArticuloOrdenado_Servicio {

    private final Articulo_ordenado_repositorio articuloOrdenadoRepositorio;

    public ArticuloOrdenado_Implementacion(Articulo_ordenado_repositorio articuloOrdenadoRepositorio) {
        this.articuloOrdenadoRepositorio = articuloOrdenadoRepositorio;
    }

    @Override
    public List<Articulo_ordenado> getTodosArticulos() {
        return articuloOrdenadoRepositorio.findAll();
    }
    @Override
    public List<Articulo_ordenado> getTodosArticulosManual() {
        return articuloOrdenadoRepositorio.traerTodo();
    }
}

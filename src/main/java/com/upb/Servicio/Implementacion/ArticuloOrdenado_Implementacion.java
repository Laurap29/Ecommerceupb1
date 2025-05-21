package com.upb.Servicio.Implementacion;

import com.upb.Modelo.Entidades.Articulo_ordenado;
import com.upb.Modelo.Repositorio.Articulo_ordenado_repositorio;
import com.upb.Servicio.ArticuloOrdenado_Servicio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Articulo_ordenado getArticulobyId(Long id) {
        return articuloOrdenadoRepositorio.encontrarId(id);
    }

    @Override
    public Articulo_ordenado updateArticulo(Articulo_ordenado articuloOrdenado) {
        Optional<Articulo_ordenado> articuloExistente = articuloOrdenadoRepositorio.findById(articuloOrdenado.getID());
        if (articuloExistente.isPresent()) {
            Articulo_ordenado existingArticle = articuloExistente.get();
            existingArticle.setCantidad_arti(articuloOrdenado.getCantidad_arti());
            existingArticle.setPrecio(articuloOrdenado.getPrecio());
            existingArticle.setFk_ordenes_id(articuloExistente.get().getFk_ordenes_id());
            existingArticle.setFk_productos_id(articuloOrdenado.getFk_productos_id());
            return articuloOrdenadoRepositorio.save(existingArticle);
        } else {
            throw new RuntimeException("No se ha encontrado esta orden");

        }
    }





}

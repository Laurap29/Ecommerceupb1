package com.upb.Controlador;

import com.upb.Modelo.Entidades.Articulo_ordenado;
import com.upb.Servicio.ArticuloOrdenado_Servicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ArticuloOrdenado_Controlador {

    private final ArticuloOrdenado_Servicio articuloOrdenadoServicio;

    public ArticuloOrdenado_Controlador(ArticuloOrdenado_Servicio articuloOrdenadoServicio) {
        this.articuloOrdenadoServicio = articuloOrdenadoServicio;
    }

    @GetMapping("/articulo")
    public List<Articulo_ordenado> getTodosArticulos(){
        return articuloOrdenadoServicio.getTodosArticulos();
    }
}

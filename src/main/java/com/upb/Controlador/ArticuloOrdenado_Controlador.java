package com.upb.Controlador;

import com.upb.Modelo.Entidades.Articulo_ordenado;
import com.upb.Servicio.ArticuloOrdenado_Servicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/articulos")
public class ArticuloOrdenado_Controlador {

    private final ArticuloOrdenado_Servicio articuloOrdenadoServicio;

    public ArticuloOrdenado_Controlador(ArticuloOrdenado_Servicio articuloOrdenadoServicio) {
        this.articuloOrdenadoServicio = articuloOrdenadoServicio;
    }

    @GetMapping("/articulo")
    public List<Articulo_ordenado> getTodosArticulos(){
        return articuloOrdenadoServicio.getTodosArticulos();
    }

    @GetMapping("/{id}")
    public Articulo_ordenado getTodosArticuloId(@PathVariable Long id) {
        return articuloOrdenadoServicio.getArticulobyId(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Articulo_ordenado> actualizarArticulo(@PathVariable Long id, @RequestBody Articulo_ordenado articuloOrdenado) {
        articuloOrdenado.setID(id);
        Articulo_ordenado articuloActualizado = articuloOrdenadoServicio.updateArticulo(articuloOrdenado);
        return new ResponseEntity<>(articuloActualizado, HttpStatus.OK);
    }


}
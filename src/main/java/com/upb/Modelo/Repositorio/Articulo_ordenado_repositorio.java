package com.upb.Modelo.Repositorio;

import com.upb.Modelo.Entidades.Articulo_ordenado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface Articulo_ordenado_repositorio extends Repository<Articulo_ordenado, Long> {

    List<Articulo_ordenado> findAll();

    @Query(value = "select  * from Articulos_ordenados where Cantidad_arti > 2",nativeQuery = true)
    List<Articulo_ordenado> traerTodo();
}

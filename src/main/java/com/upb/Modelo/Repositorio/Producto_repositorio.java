package com.upb.Modelo.Repositorio;

import com.upb.Modelo.Entidades.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface Producto_repositorio extends Repository<Producto, Long> {

    List<Producto> findAll();

    @Query(value = "select * from Productos where Nombre_prod = 'Juegos'", nativeQuery = true)
    List<Producto> traerTodo();
}



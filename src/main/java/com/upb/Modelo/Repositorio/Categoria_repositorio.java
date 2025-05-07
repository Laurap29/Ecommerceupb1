package com.upb.Modelo.Repositorio;

import com.upb.Modelo.Entidades.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface Categoria_repositorio extends Repository<Categoria,Long> {

    List<Categoria> findAll();

    @Query(value = "select * from Categorias where ID = 5", nativeQuery = true)
    List<Categoria> traerTodo();
}

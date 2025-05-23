package com.upb.Modelo.Repositorio;

import com.upb.Modelo.Entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Categoria_repositorio extends JpaRepository<Categoria,Long> {

    List<Categoria> findAll();

    @Query(value = "select  * from Categorias where ID = :id",nativeQuery = true)
    Categoria encontrarId(@Param("id") Long id);

}


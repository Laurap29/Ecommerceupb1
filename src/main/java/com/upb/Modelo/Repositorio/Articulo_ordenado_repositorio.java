package com.upb.Modelo.Repositorio;

import com.upb.Modelo.Entidades.Articulo_ordenado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Articulo_ordenado_repositorio extends JpaRepository<Articulo_ordenado, Long> {

    List<Articulo_ordenado> findAll();

    @Query(value = "select  * from Articulos_ordenados where ID = :id",nativeQuery = true)
    Articulo_ordenado encontrarId(@Param("id") Long id);

}

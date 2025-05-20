package com.upb.Modelo.Repositorio;

import com.upb.Modelo.Entidades.Articulo_ordenado;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Articulo_ordenado_repositorio extends Repository<Articulo_ordenado, Long> {

    List<Articulo_ordenado> findAll();

    @Query(value = "select  * from Articulos_ordenados where ID = :id",nativeQuery = true)
    Articulo_ordenado encontrarId(@Param("id") Long id);

}

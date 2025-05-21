package com.upb.Modelo.Repositorio;

import com.upb.Modelo.Entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Producto_repositorio extends JpaRepository<Producto, Long> {

    List<Producto> findAll();

    @Query(value = "select  * from Productos where ID = :id", nativeQuery = true)
    Producto encontrarId(@Param("id") Long id);
}



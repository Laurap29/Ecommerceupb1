package com.upb.Modelo.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Productos")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String Nombre_prod;
    private String Descripcion;
    private Long fk_categoria_id;

}

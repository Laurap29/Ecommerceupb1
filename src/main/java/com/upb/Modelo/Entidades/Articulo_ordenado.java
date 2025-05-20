package com.upb.Modelo.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Articulos_ordenados")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Articulo_ordenado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private Long Cantidad_arti;
    private Long Precio;
    private Long fk_ordenes_id;
    private Long fk_productos_id;
}

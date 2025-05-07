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
    Long ID;
    Long Cantidad_arti;
    Long Precio;
    Long fk_ordenes_id;
    Long fk_productos_id;
}

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
    Long ID;
    String Nombre_prod;
    String Descripcion;
    Long fk_categoria_id;

}

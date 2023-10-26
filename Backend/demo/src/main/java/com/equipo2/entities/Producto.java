package com.equipo2.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "productos")
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private Double precio;
    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private Categoria categoria;*/
    @Column
    private String origen;
   /* @Column
    private Boolean cancelacion;*/
   /* @Column

    private List<String> imagenes = new ArrayList<>();*/

}

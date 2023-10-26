package com.equipo2.repository;

import com.equipo2.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

    boolean existsByNombre(String nombre);
}

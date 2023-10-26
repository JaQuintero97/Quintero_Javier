package com.equipo2.service;

import com.equipo2.entities.Producto;
import com.equipo2.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto guardarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public Optional<Producto> buscarProductoPorId(long id){
        return productoRepository.findById(id);
    }

    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }

    public void eliminarProducto(Long id){
        productoRepository.deleteById(id);
    }

    public boolean existsByNombre(String nombre){
        return productoRepository.existsByNombre(nombre);
    }
}

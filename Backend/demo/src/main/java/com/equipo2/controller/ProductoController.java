package com.equipo2.controller;

import com.equipo2.entities.Producto;
import com.equipo2.exception.BadRequestException;
import com.equipo2.exception.ResourceNotFoundException;
import com.equipo2.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<Producto> registrarProducto(@RequestBody Producto producto) throws BadRequestException {
        if(productoService.existsByNombre(producto.getNombre())){
            throw new BadRequestException("Ya existe un producto con este nombre.");
        } else {
            return ResponseEntity.ok(productoService.guardarProducto(producto));
        }
    }

    @GetMapping
    public ResponseEntity<List<Producto>> listarProductos(){
        return ResponseEntity.ok(productoService.listarProductos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarProducto(@PathVariable Long id) throws BadRequestException{
        Optional<Producto> productoBuscado = productoService.buscarProductoPorId(id);
        if (productoBuscado.isPresent()) {
            return ResponseEntity.ok(productoBuscado.get());
        } else {
            throw new BadRequestException("El ID ingresado es incorrecto, no existe");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarProducto(@PathVariable Long id) throws ResourceNotFoundException {
        Optional<Producto> productoBuscado = productoService.buscarProductoPorId(id);
        if (productoBuscado.isPresent()) {
            productoService.eliminarProducto(id);
            return ResponseEntity.ok().body("Se eliminó el producto con id: " + id);
        } else {
           throw new ResourceNotFoundException("No existe el id del producto que deseas eliminar");
        }
    }
}

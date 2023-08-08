package com.example.clase23.controller;

import com.example.clase23.model.Odontologo;
import com.example.clase23.model.Paciente;
import com.example.clase23.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    private OdontologoService odontologoService;
    @Autowired
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }
    @PostMapping
    public Odontologo registrarOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.guardaOdontologo(odontologo);
    }
    @GetMapping("/{id}")
    public Odontologo buscarOdontologo(@PathVariable Integer id){
        return odontologoService.buscarOdontologo(id);
    }

    @PutMapping
    public String actualizarOdontologo(@RequestBody Odontologo odontologo){
        Odontologo odontologoBuscado = odontologoService.buscarOdontologo(odontologo.getId());
        if (odontologoBuscado!=null){
            odontologoService.actualizarOdontologo(odontologo);
            return "Odontologo actualizado con exito" + odontologo.getNombre() + " es el Odontologo actualizado.";
        }
        return "Odontologo no encontrado, no pudimos actualizar.";
    }

    @GetMapping
    public List<Odontologo> listarOdontologos(){
     return odontologoService.listarOdontologos();
    }

    @DeleteMapping("/{id}")
    public String eliminarOdontologo(@PathVariable Integer id){
        odontologoService.eliminarOdontologo(id);
        return "El odontologo se eliminó correctamente";
    }
}

package com.example.clase23.dao;

import com.example.clase23.model.Odontologo;

import java.util.List;

public interface IDao<T> {
    T guardar(T t);
    T buscar(Integer id);
    void actualizar(T t);
    void eliminar(Integer id);
    List<T> listarTodos();
    T buscarXString(String valor);

}

package dao;

import model.Odontologo;

import java.util.List;

public interface IDao<T> {
    T guardar(T t);
    List<T> listar();

}

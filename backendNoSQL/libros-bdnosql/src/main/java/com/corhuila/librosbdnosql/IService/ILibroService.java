package com.corhuila.librosbdnosql.IService;

import com.corhuila.librosbdnosql.Document.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {
    public List<Libro> findAll();
    public Optional<Libro> findById(String id);
    public Libro save(Libro libro);
    public void update(Libro libro, String id);
    public void delete(String id);
}

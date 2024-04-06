package com.corhuila.librosbdsql.IService;

import com.corhuila.librosbdsql.Entity.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {
    public List<Libro> findAll();
    public Optional<Libro> findById(Long id);
    public Libro save(Libro libro);
    public void update(Libro libro, Long id);
    public void delete(Long id);
}

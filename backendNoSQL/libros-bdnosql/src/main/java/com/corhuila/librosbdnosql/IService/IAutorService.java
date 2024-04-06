package com.corhuila.librosbdnosql.IService;

import com.corhuila.librosbdnosql.Document.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {
    public List<Autor> findAll();
    public Optional<Autor> findById(String id);
    public Autor save(Autor autor);
    void update(Autor autor, String id);
    void delete(String id);
}

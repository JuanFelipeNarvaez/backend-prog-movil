package com.corhuila.librosbdsql.IService;

import com.corhuila.librosbdsql.Entity.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {
    public List<Autor> findAll();
    public Optional<Autor> findById(Long id);
    public Autor save(Autor autor);
    void update(Autor autor, Long id);
    void delete(Long id);
}

package com.corhuila.librosbdnosql.IRepository;

import com.corhuila.librosbdnosql.Document.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ILibroRepository extends MongoRepository<Libro, String> {
}

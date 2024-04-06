package com.corhuila.librosbdnosql.IRepository;

import com.corhuila.librosbdnosql.Document.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends MongoRepository<Autor, String> {
}

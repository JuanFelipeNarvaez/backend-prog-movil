package com.corhuila.librosbdsql.IRepository;

import com.corhuila.librosbdsql.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long>{
}

package com.corhuila.librosbdsql.IRepository;

import com.corhuila.librosbdsql.Entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository<Autor, Long> {
}

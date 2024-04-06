package com.corhuila.librosbdsql.Service;

import com.corhuila.librosbdsql.Entity.Libro;
import com.corhuila.librosbdsql.IRepository.ILibroRepository;
import com.corhuila.librosbdsql.IService.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private ILibroRepository repository;

    @Override
    public List<Libro> findAll() {
        return repository.findAll();
    }
    @Override
    public Optional<Libro> findById(Long id) {
        return repository.findById(id);
    }
    @Override
    public Libro save(Libro libro) {
        return repository.save(libro);
    }

    @Override
    public void update(Libro libro, Long id) {
        Optional<Libro> lib = repository.findById(id);

        if (!lib.isEmpty()){
            Libro libroUpdate = lib.get();
            libroUpdate.setTitulo(libro.getTitulo());
            libroUpdate.setIsbn(libro.getIsbn());
            libroUpdate.setGenero(libro.getGenero());
            libroUpdate.setAñoDePublicacion(libro.getAñoDePublicacion());
            libroUpdate.setSinopsis(libro.getSinopsis());
            libroUpdate.setAutor(libro.getAutor());
        }else{
            System.out.println("No existe el libro");
        }
    }
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

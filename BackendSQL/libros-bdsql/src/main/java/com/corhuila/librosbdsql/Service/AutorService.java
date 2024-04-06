package com.corhuila.librosbdsql.Service;

import com.corhuila.librosbdsql.Entity.Autor;
import com.corhuila.librosbdsql.IRepository.IAutorRepository;
import com.corhuila.librosbdsql.IService.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService implements IAutorService {
    @Autowired
    private IAutorRepository repository;

    @Override
    public List<Autor> findAll(){
        return repository.findAll();
    }

    @Override
    public Optional<Autor> findById(Long id){
        return repository.findById(id);
    }

    @Override
    public Autor save(Autor autor){
        return repository.save(autor);
    }

    @Override
    public void update(Autor autor, Long id){
        Optional<Autor> aut = repository.findById(id);

        if (!aut.isEmpty()){
            Autor autorUpdate = aut.get();
            autorUpdate.setNombre(autor.getNombre());
            autorUpdate.setApellido(autor.getApellido());
            autorUpdate.setNacionalidad(autor.getNacionalidad());
            autorUpdate.setFecha_De_Nacimiento(autor.getFecha_De_Nacimiento());
            autorUpdate.setBiografia(autor.getBiografia());

            repository.save(autorUpdate);
        }else{
            System.out.println("No existe el autor");
        }
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}
package com.example.demo.repository;
import com.example.demo.model.Libro;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
public interface libroRepository extends CrudRepository<Libro, Long>{
    
    Optional<Libro> findByTitulo(String titulo);
    Boolean existsByTitulo(String titulo);

}

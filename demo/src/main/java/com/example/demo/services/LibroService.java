package com.example.demo.services;
import com.example.demo.model.Libro;
import com.example.demo.repository.libroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LibroService {
    @Autowired
    libroRepository libroRepository;

    public Libro findById(Long id) {
        return libroRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Librpo no encontrado"));
    }

    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

}

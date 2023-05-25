
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.model.Libro;
import com.example.demo.repository.libroRepository;

@RestController
@RequestMapping("/crud")
public class LibroController {

    @Autowired
    libroRepository libroRepository;

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Libro findLibro(@PathVariable String titulo){
        return libroRepository.findByTitulo(titulo).orElse(null);
    }

    @GetMapping("/read")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Libro> libros(){
        return (java.util.List<Libro>) libroRepository.findAll();
    }

    @PostMapping("/create")
    @CrossOrigin(origins = "http://localhost:4200")
    public Libro create(@RequestBody Libro newLibro){
        return libroRepository.save(newLibro);
    }


    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void delete(@PathVariable Long id){
        libroRepository.deleteById(id);
    }
}
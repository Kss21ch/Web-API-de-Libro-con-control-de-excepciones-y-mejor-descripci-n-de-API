package com.tuuniversidad.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.tuuniversidad.biblioteca.models.Libro;

@Repository
public class LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepository(){
        libros.add(new Libro(10l, "Boku No Hero Academia", "Kōhei Horikoshi", "Shūeisha", 2014));
        libros.add(new Libro(11l, "Kimetsu no Yaiba", "Koyoharu Gotōge", "Shūeisha", 2016));
        libros.add(new Libro(12l, "Black Clover", "Yūki Tabata (guion) Setta Kobayashi (dibujo)", "Shūeisha", 2015));
        libros.add(new Libro(13l, "Haikyū!!", "\tHaruichi Furudate", "Shūeisha", 2012));
    }
    

    public List<Libro> findAll() {
        return libros;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void save(Libro libro) {
        libros.add(libro);
    }
}

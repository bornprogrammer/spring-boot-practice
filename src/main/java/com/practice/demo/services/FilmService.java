package com.practice.demo.services;

import com.practice.demo.models.Director;
import com.practice.demo.models.Film;
import com.practice.demo.repositories.DirectorRepository;
import com.practice.demo.repositories.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    public FilmRepository filmRepository;
    public DirectorRepository directorRepository;

    public FilmService(FilmRepository filmRepository, DirectorRepository directorRepository) {
        this.filmRepository = filmRepository;
        this.directorRepository = directorRepository;
    }

    public Film create(Film film) {
//        var director = this.directorRepository.findById(film.getDirector());
        return this.filmRepository.save(film);
    }

    public List<Film> getFilms() {
        return this.filmRepository.findAll();

    }

}

package com.practice.demo.controllers;

import com.practice.demo.models.Director;
import com.practice.demo.models.Film;
import com.practice.demo.services.DirectorService;
import com.practice.demo.services.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    protected FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping("")
    public Film create(@RequestBody Film film) {
        return this.filmService.create(film);
    }

    @GetMapping("")
    public List<Film> getFilms() {
        return this.filmService.getFilms();

    }

}

package com.practice.demo.controllers;

import com.practice.demo.models.Director;
import com.practice.demo.services.DirectorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/directors")
public class DirectorController {

    protected DirectorService directorService;

    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }

    @PostMapping("")
    public Director create(@RequestBody Director director) {
        return this.directorService.create(director);
    }

    @GetMapping("")
    public List<Director> getDirectors() {
        return this.directorService.getDirectors();
    }

}

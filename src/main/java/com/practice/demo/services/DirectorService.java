package com.practice.demo.services;

import com.practice.demo.models.Director;
import com.practice.demo.repositories.DirectorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    public DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    public Director create(Director director) {
        return this.directorRepository.save(director);
    }

    public List<Director> getDirectors() {
        return this.directorRepository.findAll();
    }

}

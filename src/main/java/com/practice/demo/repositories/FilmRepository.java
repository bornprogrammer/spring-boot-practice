package com.practice.demo.repositories;

import com.practice.demo.models.Director;
import com.practice.demo.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FilmRepository extends JpaRepository<Film, UUID> {

}


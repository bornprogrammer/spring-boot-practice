package com.practice.demo.repositories;

import com.practice.demo.models.Actor;
import com.practice.demo.models.Director;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DirectorRepository extends JpaRepository<Director, UUID> {

}


package com.practice.demo.services;

import com.practice.demo.annotations.FirstAnno;
import com.practice.demo.models.Actor;
import com.practice.demo.repositories.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@FirstAnno
public class ActorService {

    protected ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public Actor createActor(final Actor actor) {
        var createdActor = this.actorRepository.save(actor);
        return createdActor;
    }

    public List<Actor> getAllActors() {
        var actors = this.actorRepository.findAll();
        return actors;
    }
}


package com.practice.demo.controllers;

import com.practice.demo.dtos.ActorDTO;
import com.practice.demo.enums.Status;
import com.practice.demo.services.ActorService;
import com.practice.demo.models.Actor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/actors")
public class ActorController {

    protected ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("")
    public List<Actor> getAllActors() {
        return this.actorService.getAllActors();
    }

    @PostMapping("")
    public Actor createActor(@RequestBody @Validated ActorDTO actorDTO) {
        var actor = new Actor();
        actor.setEmail(actorDTO.getEmail());
        actor.setName(actorDTO.getName());
        actor.setStatus(Status.ACTIVE);
        actor.setAge(actorDTO.getAge());
        return this.actorService.createActor(actor);
    }

}

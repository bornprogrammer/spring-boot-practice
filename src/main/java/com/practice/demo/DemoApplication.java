package com.practice.demo;

import com.practice.demo.enums.Status;
import com.practice.demo.models.Actor;
import com.practice.demo.repositories.ActorRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Log
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ActorRepository actorRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return (arg) -> {
            this.performDBOperations();
        };
    }

    @Override
    public void run(String... args) throws Exception {
        this.performDBOperations();
    }

    protected void performDBOperations() {
        Actor actor = Actor.builder().age(35).email("test@test.com").build();
        actor.setStatus(Status.ACTIVE);
        actorRepository.save(actor);


    }
}

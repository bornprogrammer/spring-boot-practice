package com.practice.demo.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.practice.demo.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "directors")
@NoArgsConstructor
@AllArgsConstructor
public class Director implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String email;

    @Column
    private String name;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "director")
    @JsonManagedReference()
    private List<Film> film = new ArrayList<>();
}

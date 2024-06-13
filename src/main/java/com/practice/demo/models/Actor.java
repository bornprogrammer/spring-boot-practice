package com.practice.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.practice.demo.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "actors")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 128)
    private String email;

    @Column(nullable = false)
    private Integer age;

    @Column()
    @Builder.Default
    private String name = "ankit";

    @Column(length = 32)
    @Enumerated(EnumType.STRING)
    @JsonIgnore
    private Status status;

    @CreationTimestamp
    @Column(nullable = false, name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}

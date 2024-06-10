package com.practice.demo.dtos;

import com.practice.demo.validators.ValidAge;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ActorDTO {

    @NotNull()
    @NotEmpty()
    private String email;

    @NotNull()
    @NotEmpty()
    private String name;

    @ValidAge(minimumAge = 20, maximumAge = 50)
    private Integer age;
}

package com.practice.demo.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ActorAgeValidator.class)
public @interface ValidAge {
    String message() default "";

    int minimumAge() default 5;

    int maximumAge() default 85;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

package com.practice.demo.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ActorAgeValidator implements ConstraintValidator<ValidAge, Integer> {

    private Integer minimumAge;
    private Integer maximumAge;

    private String message;

    @Override
    public void initialize(ValidAge constraintAnnotation) {
        this.minimumAge = constraintAnnotation.minimumAge();
        this.maximumAge = constraintAnnotation.maximumAge();
        this.message = "Age must be between " + minimumAge + " and " + maximumAge;
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        context.disableDefaultConstraintViolation();
        //build new violation message and add it
        context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return value > minimumAge && value < maximumAge;
    }
}

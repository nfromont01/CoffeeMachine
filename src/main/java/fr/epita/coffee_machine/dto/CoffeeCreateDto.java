package fr.epita.coffee_machine.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CoffeeCreateDto(
        @NotBlank(message = "Coffee name should cannot be null")
        String name,
        @Positive(message = "Price should be positive")
        int price
) {}

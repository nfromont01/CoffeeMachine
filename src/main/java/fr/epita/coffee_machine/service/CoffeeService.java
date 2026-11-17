package fr.epita.coffee_machine.service;

import fr.epita.coffee_machine.dto.CoffeeDto;

import java.util.List;
import java.util.Optional;

public interface CoffeeService {
    List<CoffeeDto> allCoffees();
    Optional<CoffeeDto> oneCoffee(Long id);
    CoffeeDto create(CoffeeDto dto); /// WARNING
//    CoffeeDto update(CoffeeDto dto);
}

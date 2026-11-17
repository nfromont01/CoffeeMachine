package fr.epita.coffee_machine.service;

import fr.epita.coffee_machine.dto.CoffeeDto;

import java.util.List;

public interface CoffeeService {
    List<CoffeeDto> allCoffees();
}

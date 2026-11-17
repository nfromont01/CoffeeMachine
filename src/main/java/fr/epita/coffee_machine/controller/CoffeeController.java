package fr.epita.coffee_machine.controller;

import fr.epita.coffee_machine.dto.CoffeeDto;
import fr.epita.coffee_machine.entity.Coffee;
import fr.epita.coffee_machine.repository.CoffeeRepository;
import fr.epita.coffee_machine.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CoffeeController {

    private final CoffeeService service;

    @GetMapping("/coffees")
    List<CoffeeDto> coffees() {
//        CoffeeDto bob = new  CoffeeDto(2L, "Bob", 88);
//        bob.name();

        return service.allCoffees();
    }
}

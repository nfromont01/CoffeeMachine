package fr.epita.coffee_machine.controller;

import fr.epita.coffee_machine.dto.CoffeeDto;
import fr.epita.coffee_machine.entity.Coffee;
import fr.epita.coffee_machine.repository.CoffeeRepository;
import fr.epita.coffee_machine.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CoffeeController {

    private final CoffeeService service;

    @GetMapping("/coffees")
    List<CoffeeDto> coffees() {




        return service.allCoffees();
    }

    @GetMapping("/coffees/{id}")
    ResponseEntity<CoffeeDto> coffee(@PathVariable Long id) {
        return service.oneCoffee(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

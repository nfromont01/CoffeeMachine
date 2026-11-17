package fr.epita.coffee_machine.controller;

import fr.epita.coffee_machine.dto.CoffeeCreateDto;
import fr.epita.coffee_machine.dto.CoffeeDto;
import fr.epita.coffee_machine.entity.Coffee;
import fr.epita.coffee_machine.repository.CoffeeRepository;
import fr.epita.coffee_machine.service.CoffeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("coffees")
@RequiredArgsConstructor
public class CoffeeController {

    private final CoffeeService service;

    @PostMapping
    CoffeeDto create(@RequestBody @Valid CoffeeCreateDto dto) {
        return service.create(dto);
    }

    @GetMapping
    List<CoffeeDto> coffees() {
        return service.allCoffees();
    }

    @GetMapping("{id}")
    ResponseEntity<CoffeeDto> coffee(@PathVariable Long id) {
        return service.oneCoffee(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

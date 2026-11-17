package fr.epita.coffee_machine.service;

import fr.epita.coffee_machine.dto.CoffeeDto;
import fr.epita.coffee_machine.entity.Coffee;
import fr.epita.coffee_machine.mapper.CoffeeMapper;
import fr.epita.coffee_machine.repository.CoffeeRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeRepository repository;
    private final CoffeeMapper mapper;

    @PostConstruct
    void initDb() {
        repository.saveAll(List.of(
                new Coffee("Espresso", 98),
                new Coffee("Latte", 76),
                new Coffee("Robusta", 54)
            )
        );
    }

    @Override
    public List<CoffeeDto> allCoffees() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }
}

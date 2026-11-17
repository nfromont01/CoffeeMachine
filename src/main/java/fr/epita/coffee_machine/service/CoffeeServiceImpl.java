package fr.epita.coffee_machine.service;

import fr.epita.coffee_machine.dto.CoffeeDto;
import fr.epita.coffee_machine.entity.Coffee;
import fr.epita.coffee_machine.mapper.CoffeeMapper;
import fr.epita.coffee_machine.repository.CoffeeRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<CoffeeDto> oneCoffee(Long id) {
        return repository.findById(id).map(mapper::toDto);
    }

    @Override
    public CoffeeDto create(CoffeeDto dto) {
        return null;
    }
}

package fr.epita.coffee_machine.repository;

import fr.epita.coffee_machine.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

}

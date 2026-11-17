package fr.epita.coffee_machine.mapper;

import fr.epita.coffee_machine.dto.CoffeeDto;
import fr.epita.coffee_machine.entity.Coffee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CoffeeMapper {
    CoffeeDto toDto(Coffee coffee);
}

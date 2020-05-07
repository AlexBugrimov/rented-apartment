package dev.bug.backend.web;

import dev.bug.backend.model.Tariff;
import dev.bug.backend.web.dto.TariffDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Mapper {

    @Autowired
    private ModelMapper modelMapper;

    public TariffDto toTariffDto(Tariff tariff) {
        return modelMapper.map(tariff, TariffDto.class);
    }

    public List<TariffDto> toTariffDtoList(List<Tariff> tariffs) {
        return tariffs
                .stream()
                .map(this::toTariffDto)
                .collect(Collectors.toList());
    }
}

package dev.bug.backend.web;

import dev.bug.backend.model.Tariff;
import dev.bug.backend.web.dto.TariffDto;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public TariffDto toTariffDto(Tariff tariff) {
        return new TariffDto()
                .setCounterType(tariff.getCounterType())
                .setValue(tariff.getValue())
                .setActNow(tariff.isActNow())
                .setUnit(tariff.getUnit())
                .setCreatedAt(tariff.getCreatedAt())
                .setUpdatedAt(tariff.getUpdatedAt());
    }
}

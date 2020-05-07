package dev.bug.backend.web.dto;

import dev.bug.backend.model.CounterType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class TariffDto {

    private CounterType counterType;
    private BigDecimal value;
    private boolean isActNow;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}

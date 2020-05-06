package dev.bug.backend.web;

import dev.bug.backend.model.CounterType;
import dev.bug.backend.model.Tariff;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class TestDataHelper {

    List<Tariff> createTariffs() {
        return Arrays.asList(
                new Tariff()
                        .setId(100L)
                        .setActNow(true)
                        .setCounterType(CounterType.HOT_WATER)
                        .setCreatedAt(LocalDate.now())
                        .setUnit("Литр")
                        .setValue(new BigDecimal("20.6")),
                new Tariff()
                        .setId(200L)
                        .setActNow(true)
                        .setCounterType(CounterType.COLD_WATER)
                        .setCreatedAt(LocalDate.now())
                        .setUnit("Литр")
                        .setValue(new BigDecimal("66.9")),
                new Tariff()
                        .setId(300L)
                        .setActNow(true)
                        .setCounterType(CounterType.ELECTRICITY)
                        .setCreatedAt(LocalDate.now())
                        .setUnit("Вт.")
                        .setValue(new BigDecimal("33.2"))
        );
    }
}

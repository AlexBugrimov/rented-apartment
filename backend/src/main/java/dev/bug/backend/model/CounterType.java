package dev.bug.backend.model;

import lombok.Getter;
import lombok.ToString;

@ToString(of = "label")
public enum CounterType {

    COLD_WATER("холодная вода", "Литр"),
    HOT_WATER("горячая вода", "Литр"),
    ELECTRICITY("электроэнергия", "Вт");

    CounterType(final String label, final String unit) {
        this.label = label;
        this.unit = unit;
    }

    @Getter
    private final String label;

    @Getter
    private final String unit;
}

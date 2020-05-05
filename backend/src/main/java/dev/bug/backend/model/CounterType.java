package dev.bug.backend.model;

import lombok.Getter;
import lombok.ToString;

@ToString(of = "value")
public enum CounterType {

    COLD_WATER("холодная вода"),
    HOT_WATER("горячая вода"),
    ELECTRICITY("электроэнергия");

    CounterType(String value) {
        this.value = value;
    }

    @Getter
    private final String value;
}

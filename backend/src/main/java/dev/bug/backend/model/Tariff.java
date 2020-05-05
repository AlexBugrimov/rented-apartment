package dev.bug.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CounterType counterType;

    @Column(length = 32)
    private String unit;

    @Column(columnDefinition = "Decimal(8, 2) default '0.00'")
    private BigDecimal value;

    private boolean isActNow;

    private LocalDate createdAt;

    private LocalDate updatedAt;
}

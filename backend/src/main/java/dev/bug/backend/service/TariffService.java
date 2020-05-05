package dev.bug.backend.service;

import dev.bug.api.ra.openapi.dto.Tariff;

import java.util.List;

public interface TariffService {

    List<Tariff> getTariffs();
}

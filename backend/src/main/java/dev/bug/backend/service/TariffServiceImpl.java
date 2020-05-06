package dev.bug.backend.service;

import dev.bug.backend.model.Tariff;
import dev.bug.backend.repository.TariffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffServiceImpl implements TariffService {

    @Autowired
    private TariffRepository tariffRepository;

    @Override
    public List<Tariff> getTariffs() {
        return tariffRepository.findAll();
    }
}

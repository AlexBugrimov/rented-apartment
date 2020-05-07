package dev.bug.backend.web;

import dev.bug.api.ra.openapi.TariffsApi;
import dev.bug.backend.model.Tariff;
import dev.bug.backend.service.TariffServiceImpl;
import dev.bug.backend.web.dto.TariffDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tariffs")
public class TariffController {

    @Autowired
    private Mapper mapper;

    @Autowired
    private TariffServiceImpl tariffService;

    @GetMapping
    public ResponseEntity<List<TariffDto>> getTariffs() {
        final List<TariffDto> tariffs = mapper
                .toTariffDtoList(tariffService.getTariffs());
        return ResponseEntity.ok(tariffs);
    }
}

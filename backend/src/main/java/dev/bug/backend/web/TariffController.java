package dev.bug.backend.web;

import dev.bug.api.ra.openapi.TariffsApi;
import dev.bug.backend.service.TariffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TariffController implements TariffsApi {

    @Autowired
    private TariffServiceImpl tariffService;

    @Override
    public ResponseEntity<Object> getTariffs() {
        return ResponseEntity.ok(tariffService.getTariffs());
    }
}

package dev.bug.backend.web;

import dev.bug.backend.BaseTest;
import dev.bug.backend.model.Tariff;
import dev.bug.backend.web.dto.TariffDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class MapperTest extends BaseTest {

    @Autowired
    private Mapper mapper;

    @Test
    public void successConvertToTariffDto() {
        final Tariff expectedTariff = testDataHelper.createTariff();
        final TariffDto actualTariff = mapper.toTariffDto(expectedTariff);

        assertThat(expectedTariff.getCounterType())
                .isEqualTo(actualTariff.getCounterType());
        assertThat(expectedTariff.getValue())
                .isEqualTo(actualTariff.getValue());
        assertThat(expectedTariff.isActNow())
                .isEqualTo(actualTariff.isActNow());
    }
}
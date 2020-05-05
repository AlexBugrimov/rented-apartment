package dev.bug.backend.web;

import dev.bug.backend.BaseTest;
import dev.bug.backend.model.Tariff;
import dev.bug.backend.repository.TariffRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;

import java.util.Collections;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class TariffControllerTest extends BaseTest {

    @MockBean
    private TariffRepository tariffRepository;

    @Test
    public void getAllTariffs_thenStatus200() throws Exception {
        given(tariffRepository.findAll()).willReturn(Collections.singletonList(new Tariff()));

        mockMvc.perform(get("/api/v1/tariffs")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
}
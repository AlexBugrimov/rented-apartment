package dev.bug.backend.web;

import dev.bug.backend.BaseTest;
import dev.bug.backend.repository.TariffRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class TariffControllerTest extends BaseTest {

    @MockBean
    private TariffRepository tariffRepository;

    @Autowired
    private TestDataHelper testDataHelper;

    @Test
    @DisplayName("Получить все транзакции со статусом 200")
    public void getAllTariffs_thenStatus200() throws Exception {
        given(tariffRepository.findAll()).willReturn(testDataHelper.createTariffs());

        mockMvc.perform(get("/tariffs")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
}
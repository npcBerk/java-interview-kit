package interviewkit.spring.item;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class ItemControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    void createsAndReadsItem() throws Exception {
        mvc.perform(post("/api/items").contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"kalem\",\"quantity\":3}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name").value("kalem"));

        mvc.perform(get("/api/items").param("q", "KAL"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].quantity").value(3));
    }

    @Test
    void rejectsBlankName() throws Exception {
        mvc.perform(post("/api/items").contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"\",\"quantity\":1}"))
                .andExpect(status().isBadRequest());
    }

    @Test
    void returns404ForMissingItem() throws Exception {
        mvc.perform(get("/api/items/999")).andExpect(status().isNotFound());
    }
}

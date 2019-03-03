package lee.minjae.testjooq.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@WebFluxTest(TestController.class)
public class TestControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void totalCountTest() {
        this.webTestClient.get()
                .uri("/totalCount")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk()
                .expectBody(Integer.class).isEqualTo(0);
    }
}

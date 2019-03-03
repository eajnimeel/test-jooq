package lee.minjae.testjooq.controller;

import lee.minjae.testjooq.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    private TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    @GetMapping("/totalCount")
    public Mono<Integer> totalCount() {
        return service.getTotalCount().log();
    }
}

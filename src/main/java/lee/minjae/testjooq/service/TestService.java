package lee.minjae.testjooq.service;

import reactor.core.publisher.Mono;

public interface TestService {

    Mono<Integer> getTotalCount();
}

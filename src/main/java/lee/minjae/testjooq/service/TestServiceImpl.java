package lee.minjae.testjooq.service;

import lee.minjae.testjooq.repository.TestRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TestServiceImpl implements TestService {

    private TestRepository repository;

    public TestServiceImpl(TestRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Integer> getTotalCount() {
        return Mono.fromCallable(() -> repository.getTotalCount())
                .log();
    }
}

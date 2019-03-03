package lee.minjae.testjooq.repository;

import static lee.minjae.testjooq.jooq.tables.Dictionary.DICTIONARY;
import static org.assertj.core.api.Assertions.assertThat;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.SelectJoinStep;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

@RunWith(SpringRunner.class)
//@JooqTest
@SpringBootTest
public class TestRepositoryTest {

//    @Autowired
//    private DSLContext create;

    @Autowired
    TestRepository testRepository;

    @Test
    public void getTotalCount() {

//        SelectJoinStep<Record1<Integer>> from = this.create.selectCount().from(DICTIONARY);
//        assertThat(create.fetchCount(from)).isEqualTo(0);

        Integer totalCount = testRepository.getTotalCount();
        assertThat(totalCount).isEqualTo(0);
    }
}

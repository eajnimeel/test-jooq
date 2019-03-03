package lee.minjae.testjooq.repository;

import static lee.minjae.testjooq.jooq.tables.Dictionary.DICTIONARY;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    private DSLContext create;

    public TestRepository(DSLContext create) {
        this.create = create;
    }

    public Integer getTotalCount() {
//        아래와 같음
//        return this.create.fetchCount(create.selectFrom(DICTIONARY));
        return this.create.selectCount()
                .from(DICTIONARY)
                .fetchOne(0, Integer.class);

    }
}

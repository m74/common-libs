package ru.com.m74.sql.codegen.test;

import ru.com.m74.sql.codegen.Select;
import ru.com.m74.sql.codegen.spring.Builder;

/**
 *
 * @author mixam
 * @since 15.07.16 16:54
 */
public class Test {
    private final Builder builder = new Builder();

    @org.junit.Test
    public void test() {
        Select q = builder
                .select("a.*")
                .from("VSG_ACTION a")
                .where("id=1")
                .and("name='test'")
                .groupBy("id")
                .orderBy("id");

        assert "select a.* from VSG_ACTION a where (id=1) and (name='test') group by id order by id"
                .equals(q.toString());

        q.field("nr.id");
        q.join("n_registry as nr");


        assert "select a.*, nr.id from VSG_ACTION a join n_registry as nr where (id=1) and (name='test') group by id order by id"
                .equals(q.toString());

        q.select("count(*)");
        assert "select count(*) from VSG_ACTION a join n_registry as nr where (id=1) and (name='test') group by id order by id"
                .equals(q.toString());

        q.and("user_name like :query");
        assert "select count(*) from VSG_ACTION a join n_registry as nr where (id=1) and (name='test') and (user_name like :query) group by id order by id"
                .equals(q.toString());

    }
}

package ru.com.m74.sql.codegen.spring;

import ru.com.m74.sql.codegen.Delete;
import ru.com.m74.sql.codegen.Insert;
import ru.com.m74.sql.codegen.Select;
import ru.com.m74.sql.codegen.Update;

/**
 * @author mixam
 * @since 01.07.16 23:17
 */
public class Builder {
    public Select select(String... fields) {
        return new Select().select(fields);
    }

    public Insert insert() {
        return new Insert();
    }

    public Update update(String table) {
        return new Update(table);
    }

    public Delete delete(String table) {
        return new Delete(table);
    }
}

package ru.com.m74.sql.codegen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mixam
 * @since 02.07.16 0:18
 */
public class Update {
    private String table;
    private List<String> values = new ArrayList<>();
    private Where where = null;

    public Update(String table) {
        this.table = table;
    }

    public Update set(String column, Object value) {
        values.add("set " + column + "=" + String.valueOf(value));
        return this;
    }

    /**
     * Обнулить условия и добавить новое
     *
     * @param str
     * @return
     */
    public Update where(String str) {
        this.where = new Where(str);
        return this;
    }

    public Update and(String... str) {
        where.and(str);
        return this;
    }

    @Override
    public String toString() {
        return "update " + table + " " + String.join(",", values) + " " + where;
    }
}

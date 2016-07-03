package ru.com.m74.sql.codegen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mixam
 * @since 02.07.16 0:03
 */
public class Insert {
    private String table;
    List<String> fields = new ArrayList<>();
    List<String> values = new ArrayList<>();

    public Insert into(String table) {
        this.table = table;
        return this;
    }

    public Insert value(String key, Object value) {
        fields.add(key);
        values.add(String.valueOf(value));
        return this;
    }

    @Override
    public String toString() {
        return "insert into " + table + "(" + String.join(",", fields) + ") values(" + String.join(",", values) + ")";
    }
}

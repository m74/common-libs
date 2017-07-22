package ru.com.m74.sql.codegen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mixam
 * @since 01.07.16 23:50
 */
public class Where {
    private List<String> conditions = new ArrayList<>();

    public Where(String... conditions) {
        and(conditions);
    }

    public void and(String... conditions) {
        for (String condition : conditions) {
            this.conditions.add("(" + condition + ")");
        }
    }

    @Override
    public String toString() {
        return toString(" ");
    }

    public String toString(String delim) {
        return "where" + delim + String.join(delim + "and ", conditions);

    }
}

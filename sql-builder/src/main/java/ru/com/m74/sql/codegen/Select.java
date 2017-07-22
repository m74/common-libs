package ru.com.m74.sql.codegen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author mixam
 * @since 01.07.16 9:02
 */
public class Select {
    private List<String> fields = new ArrayList<>();
    private String tableName = null;
    private List<String> joins = new ArrayList<>();
    private Where where = null;
    private String group = null;
    private String orderBy = null;

    /**
     * Очистить список полей и добавить новые
     *
     * @param fields
     * @return
     */
    public Select select(String... fields) {
        this.fields.clear();
        field(fields);
        return this;
    }

    /**
     * Добавить поля в результат запроса
     *
     * @param fields
     * @return
     */
    public Select field(String... fields) {
        Collections.addAll(this.fields, fields);
        return this;
    }

    public Select from(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public Select groupBy(String group) {
        this.group = group;
        return this;
    }

    public Select orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Select join(String... joins) {
        for (String join : joins) {
            this.joins.add("join " + join);
        }
        return this;
    }

    public Select leftJoin(String... joins) {
        for (String join : joins) {
            this.joins.add("left join " + join);
        }
        return this;
    }

    /**
     * Обнулить условия и добавить новое
     *
     * @param str
     * @return
     */
    public Select where(String... str) {
        this.where = new Where(str);
        return this;
    }

    public Select and(String... str) {
        if (where != null) where.and(str);
        else where(str);
        return this;
    }

    @Override
    public String toString() {
        return toString(" ");
    }

    public String toPrettyString() {
        return toString("\n");
    }

    public String toString(String delim) {
        if (tableName == null) throw new RuntimeException("TableName is null");

        String sql = "select" + delim;
        sql += (fields.isEmpty() ? "*" : String.join(delim + ",", fields)) +
                delim + "from " + tableName;

        if (!joins.isEmpty())
            sql += delim + String.join(delim, joins);

        if (where != null) sql += delim + where.toString(delim);

        if (group != null)
            sql += delim + "group by " + group;

        if (orderBy != null)
            sql += delim + "order by " + orderBy;

        return sql;
    }

}

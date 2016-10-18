package ru.com.m74.utilities;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Collection;

public class TK {
    /**
     * Конвертировать строку из iso8859-1 в utf8
     *
     * @param str
     * @return
     */
    public static String iso2utf(String str) {
        try {
            return new String(str.getBytes("iso8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /**
     * Current timestamp without nanos.
     *
     * @return
     */
    public static Timestamp currentTimestamp() {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        now.setNanos(0);
        return now;
    }


    /**
     * Пустой ли объект
     *
     * @param o
     * @return
     */

    public static boolean isEmpty(Object o) {
        if (o instanceof Collection<?>)
            return ((Collection<?>) o).isEmpty();
        if (o instanceof String)
            return ((String) o).isEmpty();
        if (o instanceof Number)
            return ((Number) o).intValue() == 0;
        return o == null;
    }

}

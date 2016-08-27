package ru.com.m74.utilities;

import java.sql.Timestamp;
import java.util.Collection;

public class TK {
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

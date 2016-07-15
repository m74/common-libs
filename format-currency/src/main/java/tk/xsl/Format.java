package tk.xsl;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import mixam.text.format.CurrencyFormat;

public class Format {
	public static String date(String date) {
		return date(date, "dd.MM.yy");
	}

	public static String date(String date, String pattern) {
		try {
			return date(Date.valueOf(date), pattern);
		} catch (Exception ex) {
			try {
				return date(Timestamp.valueOf(date), pattern);
			} catch (Exception ex1) {
				try {
					return date(new SimpleDateFormat("yyyyMMdd").parse(date),
							pattern);
				} catch (Exception ex2) {
					return date;
				}
			}
		}
	}

	public static String date(String date, String pattern, String parserPattern)
			throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat(parserPattern);
		return date(f.parse(date), pattern);
	}

	/**
	 * Дата прописью с месяцем в родительном падеже
	 * 
	 * @param date
	 * @return
	 */
	public static String dateStr(String date) {
		String m = date(date, "MMMM");
		m = m.replaceFirst("ь$", "я");
		m = m.replaceFirst("й$", "я");
		m = m.replaceFirst("т$", "та");
		return date(date, "dd") + " " + m + " " + date(date, "yyyy") + " г.";
	}

	/**
	 * Название месяца в родительном падеже
	 * 
	 * @param date
	 * @return
	 */
	public static String monthStr(String date) {
		String m = date(date, "MMMM");
		m = m.replaceFirst("ь$", "я");
		m = m.replaceFirst("й$", "я");
		m = m.replaceFirst("т$", "та");
		return m.toLowerCase();
	}

	public static String percent(String val) {
		return val.isEmpty() ? val : val + " %";
	}

	public static String date(java.util.Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}

	public static String date(java.util.Date date) {
		return date(date, "dd.MM.yy");
	}

	private static final java.text.DecimalFormat mfmt = new java.text.DecimalFormat(
			"#,##0.00");

	public static String moneyColor(String val) {
		return moneyColor(val, "{0}");
	}

	public static String moneyColor(String val, String format) {
		try {
			double v = Double.parseDouble(val);
			return "<span class=\"" + className(v) + "\">"
					+ money(v, format, true) + "</span>";
		} catch (NumberFormatException ex) {
			return val;
		}
	}

	public static String numberColor(String val) {
		return numberColor(val, true);
	}

	public static String numberColor(String val, boolean showNull) {
		return numberColor(val, showNull, "#,##0");
	}

	private static String className(double v) {
		if (v < 0)
			return "negative";
		if (v > 0)
			return "positive";
		return "zero";
	}

	public static String numberColor(String val, boolean showNull, String format) {
		try {
			double v = Double.parseDouble(val);

			return "<span class=\"" + className(v) + "\">"
					+ number(val, showNull, format) + "</span>";
		} catch (NumberFormatException ex) {
			return val;
		}
	}

	public static String number(String val, String fmt) {
		return number(val, true, fmt);
	}

	public static String number(String val, boolean showNull, String fmt) {
		try {
			double v = Double.parseDouble(val);
			if (!showNull && v == 0)
				return "";

			return new java.text.DecimalFormat(fmt).format(v);
		} catch (NumberFormatException ex) {
			return val;
		}
	}

	public static String number(String v) {
		return number(v, "#,##0");
	}

	public static String money(String val) {
		return money(val, "{0}", true);
	}

	public static String moneyWithoutZero(String val) {
		return money(val, "{0}", false);
	}

	public static String moneyWithoutZero(String val, String format) {
		return money(val, format, false);
	}

	public static String money(String val, String format) {
		return money(val, format, true);
	}

	public static String money(String val, String format, boolean showZero) {
		try {
			double v = Double.parseDouble(val);

			if (v == 0 && !showZero)
				return "";

			return money(v, format, showZero);
		} catch (NumberFormatException ex) {
			return val;
		}
	}

	private static String money(double v, String format, boolean showZero) {
		return Double.isNaN(v) ? "NaN" : MessageFormat.format(format,
				mfmt.format(v));
	}

	private static final CurrencyFormat fmtarr[] = new CurrencyFormat[] {
			CurrencyFormat.getInstance(), new CurrencyFormat(true, false, true) };
	static {
		fmtarr[1].showEmpty = true;
	}

	public static String moneyStr(String val) {
		return moneyAsString(val, 0);
	}

	public static String moneyStr(String val, int index) {
		return moneyAsString(val, index);
	}

	public static String moneyAsString(String val, int index) {
		double v = 0;
		try {
			v = Double.parseDouble(val);
		} catch (NumberFormatException ex) {
		}
		return fmtarr[index].format(v);
	}

	public static String moneyAsString(String val) {
		return moneyAsString(val, 0);
	}

	/**
	 * Содержимое массива без символов '[' и ']' в начале и в конце
	 * 
	 * @param val
	 * @return
	 */
	public static String array(String val) {
		if (val == null)
			return null;
		val = val.substring(1, val.length() - 1);
		return val;
	}

	public static String bankAccount(String val) {
		if (val.length() != 20)
			return "Invalid: " + val;
		return val.substring(0, 5) + " " + val.substring(5, 8) + " "
				+ val.substring(8, 12) + " " + val.substring(12, 16) + " "
				+ val.substring(16, 20);
	}
}

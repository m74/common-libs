package mixam.text.format;

import java.math.BigDecimal;
import java.text.*;

/**
 * Форматирование денежного значения прописью. Только рубли и копейки! (Пока)
 */
public class CurrencyFormat extends java.text.Format {

	private static final long serialVersionUID = -976266283271499699L;
	private final boolean rubAsString;
	private final boolean kopAsString;
	private final boolean longCurrencyNames;
	public boolean showEmpty = false;
	public boolean stringValueTitled = true;

	/**
	 * 
	 * @param rubAsString
	 *            Если true, то форматировать значение рублей в виде строки.
	 *            Если false, то в вде числа.
	 * @param kopAsString
	 *            Если true, то форматировать значение копеек в виде строки.
	 *            Если false, то в вде числа.
	 * @param longCurrencyNames
	 *            Название валюты полностью или кратко (рублей или руб.)
	 */

	public CurrencyFormat(boolean rubAsString, boolean kopAsString,
			boolean longCurrencyNames) {
		this.rubAsString = rubAsString;
		this.kopAsString = kopAsString;
		this.longCurrencyNames = longCurrencyNames;
	}

	public CurrencyFormat() {
		this(true, true, true);
	}

	public String format(int num) {
		return format((double) num);
	}

	public String format(double num) {
		return format(new Double(num));
	}

	public StringBuffer format(Object obj, StringBuffer buff, FieldPosition pos) {
		if (!(obj instanceof Number))
			throw new IllegalArgumentException("Argument is not number!");

		double val = ((Number) obj).doubleValue();
		long r = ((Number) obj).longValue();

		BigDecimal bd = new BigDecimal(val - r);
		bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);

		int k = (int) (bd.floatValue() * 100);

		return format((int) r, k, buff);
	}

	private static final String mmap[][] = new String[][] {
			{ "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь",
					"восемь", "девять", "десять", "одиннадцать", "двенадцать",
					"тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
					"семнадцать", "восемнадцать", "девятнадцать" },
			{ null, null, "двадцать", "тридцать", "сорок", "пятьдесят",
					"шестьдесят", "семьдесят", "восемьдесят", "девяносто" },
			{ null, "сто", "двести", "триста", "четыреста", "пятьсот",
					"шестьсот", "семьсот", "восемьсот", "девятьсот" },
			{ null, "", "", "", "", "", "", "", "", "" } };

	private static final String wmap[][] = new String[][] {
			{ "ноль", "одна", "две", "три", "четыре", "пять", "шесть", "семь",
					"восемь", "девять", "десять", "одиннадцать", "двенадцать",
					"тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
					"семнадцать", "восемнадцать", "девятнадцать" },
			{ null, null, "двадцать", "тридцать", "сорок", "пятьдесят",
					"шестьдесят", "семьдесят", "восемьдесят", "девяносто" },
			{ null, "сто", "двести", "триста", "четыреста", "пятьсот",
					"шестьсот", "семьсот", "восемьсот", "девятьсот" },
			{ null, "", "", "", "", "", "", "", "", "" } };

	private StringBuffer format(int rub, int kop, StringBuffer buff) {
		if (showEmpty || rub > 0 || kop == 0) {
			if (rubAsString)
				convert(rub, buff, true);
			else
				buff.append(rub);
			buff.append(" ");
			if (longCurrencyNames)
				append(rub, buff, "рубль", "рубля", "рублей");
			else
				buff.append("руб.");
		}
		if (showEmpty || kop > 0 || rub == 0) {
			if (showEmpty || rub > 0 || kop == 0)
				buff.append(" ");
			if (kopAsString)
				convert(kop, buff, false);
			else {
				if (kop < 10)
					buff.append(0);
				buff.append(kop);
			}
			buff.append(" ");
			if (longCurrencyNames)
				append(kop, buff, "копейка", "копейки", "копеек");
			else
				buff.append("коп.");
		}
		if (stringValueTitled)
			buff.setCharAt(0, Character.toUpperCase(buff.charAt(0)));
		return buff;
	}

	/**
	 * Преобразование чиста в строку
	 * 
	 * @param val
	 *            Числовое значение
	 * @param buff
	 *            Результат
	 * @param type
	 *            мужской или женский род
	 * @return Отформатированная строка
	 */
	public static StringBuffer convert(long val, StringBuffer buff, boolean type) {
		String map[][] = type ? mmap : wmap;
		if (val < 20) {
			buff.append(map[0][(int) val]);
		} else if (val < 100) {
			long x = val / 10;
			buff.append(map[1][(int) x]);
			val = val - x * 10;
			if (val > 0) {
				buff.append(" ");
				convert(val, buff, type);
			}
		} else if (val < 1000) {
			long x = val / 100;
			buff.append(map[2][(int) x]);
			val = val - x * 100;
			if (val > 0) {
				buff.append(" ");
				convert(val, buff, type);
			}
		} else if (val < 1000000) {
			long x = val / 1000;
			val = val - x * 1000;
			convert(x, buff, false);
			buff.append(" ");
			append(x, buff, "тысяча", "тысячи", "тысяч");
			if (val > 0) {
				buff.append(" ");
				convert(val, buff, type);
			}
		} else if (val < 1000000000) {
			long x = val / 1000000;
			val = val - x * 1000000;
			convert(x, buff, true);
			buff.append(" ");
			append(x, buff, "миллион", "миллиона", "миллионов");
			if (val > 0) {
				buff.append(" ");
				convert(val, buff, type);
			}
		} else if (val < 1000000000000.0) {
			long x = val / 1000000000;
			val = val - x * 1000000000;
			convert(x, buff, true);
			buff.append(" ");
			append(x, buff, "миллиард", "миллиарда", "миллиардов");
			if (val > 0) {
				buff.append(" ");
				convert(val, buff, type);
			}
		} else {
			throw new IllegalArgumentException(String.valueOf(val));
		}
		return buff;
	}

	/**
	 * Склонение существительных.
	 * 
	 * @param str1
	 *            Именительный падеж единственное число
	 * @param str2
	 *            Родительный падеж единственное число
	 * @param str3
	 *            Родительный падеж множественное число
	 */
	private static StringBuffer append(long val, StringBuffer buff,
			String str1, String str2, String str3) {
		char ca[] = String.valueOf(val).toCharArray();

		if (ca.length > 1 && ca[ca.length - 2] == '1') // 111 214 1213
			buff.append(str3);
		else
			switch ((int) (ca[ca.length - 1] - '0')) {
			case 1:
				buff.append(str1);
				break;
			case 2:
			case 3:
			case 4:
				buff.append(str2);
				break;
			default:
				buff.append(str3);
			}
		return buff;
	}

	public Object parseObject(String source, ParsePosition pos) {
		throw new RuntimeException("Not implemented!");
	}

	private static final CurrencyFormat defaultInstance = new CurrencyFormat();

	public static CurrencyFormat getInstance() {
		return defaultInstance;
	}

}

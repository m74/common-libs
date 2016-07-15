/*
 * RandomGenerator.java
 *
 * Created on 29 Январь 2009 г., 13:50
 *
 * Используется при генерации паролей.
 */

package mixam.toolkit;

import java.util.Random;

/**
 * 
 * @author mixam
 */
public class RandomGenerator {
	private final Random r = new Random();
	private final String str;
	private final int length;

	/**
	 * 
	 * @param str
	 *            Набор символов, из которых будет генерироваться строка.
	 * @param length
	 *            длина генерируемой строки
	 */
	public RandomGenerator(String str, int length) {
		this.str = str;
		this.length = length;
	}

	/**
	 * Генерировать строку.
	 * 
	 * @return строка
	 */
	public String generate() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++)
			sb.append(str.charAt(r.nextInt(str.length() - 1)));
		return sb.toString();
	}
}

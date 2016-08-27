package mixam.toolkit;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class ClassTools {
	/**
	 * Получить $class в конструкции Example&lt;$class&gt;
	 * 
	 * @param cls
	 *            Базовый класс (Example)
	 * @return
	 */
	public static Class<?> findClassTypeParameter(Class<?> cls) {
		try {
			ParameterizedType type = (ParameterizedType) cls
					.getGenericSuperclass();
			Type arg = type.getActualTypeArguments()[0];
			return (Class<?>) (arg instanceof TypeVariable ? ((TypeVariable<?>) arg)
					.getBounds()[0] : arg);
		} catch (ClassCastException ex) {
			return findClassTypeParameter((Class<?>) cls.getSuperclass());
		}
	}
}

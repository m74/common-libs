/*
 * BeanTools.java
 *
 * Created on 12 Февраль 2008 г., 9:44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package mixam.toolkit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import mixam.webtools.Logger;

/**
 * 
 * @author Максим
 */
public class BeanTools {

	/**
	 * Получить список всех Field, в которых присутствует Annotation
	 * 
	 * @param cls
	 * @param a
	 * @return
	 * @throws SecurityException
	 */
	public static List<Field> getFields(Class<?> cls, Class<? extends Annotation> a) throws SecurityException {
		ArrayList<Field> fields = new ArrayList<Field>();
		while (cls != null) {
			for (Field f : cls.getDeclaredFields()) {
				// if ((f.getModifiers() & Modifier.STATIC) == 0)
				if (f.isAnnotationPresent(a))
					fields.add(f);
			}
			cls = cls.getSuperclass();
		}
		return fields;
	}

	/**
	 * Получить значение свойства объекта. через метод getField() или (если
	 * такого метода нет) через свойство field;
	 */
	private static Object getValue(Object instance, String name) {

		try {
			return getter(instance.getClass(), name).invoke(instance);
		} catch (NoSuchMethodException e) {
			return getFieldValue(instance, name);
		} catch (IllegalArgumentException e) {
			throw new ToolkitException(e);
		} catch (SecurityException e) {
			throw new ToolkitException(e);
		} catch (IllegalAccessException e) {
			throw new ToolkitException(e);
		} catch (InvocationTargetException e) {
			throw new ToolkitException(e);
		}
	}

	public static String getString(Object instance, String propertyPath) {
		Object v = getProperty(instance, propertyPath);
		return v != null ? v.toString() : "";
	}

	public static String strval(Object instance, String propertyPath) throws ToolkitException {
		return getString(instance, propertyPath);
	}

	public static Object val(Object instance, String propertyPath) throws ToolkitException {
		return getProperty(instance, propertyPath);
	}

	public static Object getProperty(Object instance, String propertyPath) throws ToolkitException {

		if (instance == null)
			return null;
		if (propertyPath == null || propertyPath.trim().length() == 0)
			return instance;

		String path[] = propertyPath.split("\\.");
		for (String propertyName : path) {
			instance = getValue(instance, propertyName);
			if (instance == null)
				break;
		}
		return instance;
	}

	/**
	 * Получить свойство объекта. Не только в его классе но и в классе предка.
	 * 
	 * @param cls
	 * @param name
	 * @return
	 * @throws SecurityException
	 */
	public static Field getField(Class<?> cls, String name) throws SecurityException {
		if (cls == null)
			return null;
		try {
			return cls.getDeclaredField(name);
		} catch (NoSuchFieldException e) {
			return getField(cls.getSuperclass(), name);
		}
	}

	public static Object getFieldValue(Object instance, String name) throws ToolkitException {
		try {
			Field f = getField(instance.getClass(), name);
			if (f == null)
				throw new ToolkitException("Field '" + name + "' not found in " + instance.getClass());
			f.setAccessible(true);
			return f.get(instance);
		} catch (IllegalArgumentException e) {
			throw new ToolkitException(e);
		} catch (SecurityException e) {
			throw new ToolkitException(e);
		} catch (IllegalAccessException e) {
			throw new ToolkitException(e);
		}
	}

	public static boolean setProperty(Object instance, String propertyPath, Object value) {
		Class<?> valueClass = findReturnType(instance.getClass(), propertyPath);

		String path[] = propertyPath.split("\\.");
		for (int i = 0; i < path.length - 1; i++) {
			instance = getProperty(instance, path[i]);
		}
		String propertyName = path[path.length - 1];

		Object oldValue = getProperty(instance, propertyName);

		if ((oldValue == value) || (oldValue != null && oldValue.equals(value)))
			return false;

		try {
			Logger.debug(BeanTools.class, propertyPath + "=" + value);
			Method m = instance.getClass().getMethod(createMetodName("set", propertyName), valueClass);
			m.invoke(instance, value);
			return true;
		} catch (IllegalArgumentException ex) {
			throw new ToolkitException(ex);
		} catch (IllegalAccessException ex) {
			throw new ToolkitException(ex);
		} catch (InvocationTargetException ex) {
			throw new ToolkitException(ex.getTargetException());
		} catch (SecurityException ex) {
			throw new ToolkitException(ex);
		} catch (NoSuchMethodException ex) {
			try {
				Field f = getField(instance.getClass(), propertyName);
				if (f == null)
					throw new ToolkitException("Field not found: " + propertyName);
				f.setAccessible(true);
				f.set(instance, value);
				return true;
			} catch (SecurityException e) {
				throw new ToolkitException(e);
			} catch (IllegalArgumentException e) {
				throw new ToolkitException(e);
			} catch (IllegalAccessException e) {
				throw new ToolkitException(e);
			}

		}
	}

	// public static boolean updateProperty(Object oldInstance,
	// Object newInstance, String propertyName) throws ToolkitException {
	// Object ov = getProperty(oldInstance, propertyName);
	// Object nv = getProperty(newInstance, propertyName);
	// if (ov == nv)
	// return false;
	// if (ov != null && ov.equals(nv))
	// return false;
	//
	// setProperty(oldInstance, propertyName, nv);
	// return true;
	// }

	/**
	 * 
	 * @param cls
	 * @param propertyPath
	 * @return
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	public static Method findMethod(Class<?> cls, String propertyPath) throws SecurityException, NoSuchMethodException {
		// logger.debug("find method: " + objectClass + ", path: " +
		// propertyPath);
		String propertyName = propertyPath;
		Method method = null;

		String path[] = propertyPath.split("\\.");
		for (int i = 0; i < path.length - 1; i++) {
			method = getter(cls, path[i]);
			cls = method.getReturnType();
			propertyName = path[i + 1];
		}
		// logger.debug("find method: " + objectClass + ", name: " +
		// propertyName);

		try {
			method = getter(cls, propertyName);
			return method;
		} catch (NoSuchMethodException ex) {
			// logger.debug("not found!");
			Class<?> sc = cls.getSuperclass();
			// logger.debug("super: " + sc);

			if (sc == null)
				throw ex;

			return findMethod(sc, propertyName);
		}
	}

	public static Member findMember(Class<?> objectClass, String propertyPath)
			throws SecurityException, NoSuchMemberException {
		// logger.debug("find member: " + objectClass + ", path: " +
		// propertyPath);
		String propertyName = propertyPath;

		String path[] = propertyPath.split("\\.");
		for (int i = 0; i < path.length - 1; i++) {
			try {
				Method method = getter(objectClass, path[i]);
				objectClass = method.getReturnType();
			} catch (NoSuchMethodException e) {
				try {
					objectClass = objectClass.getDeclaredField(path[i]).getType();
				} catch (NoSuchFieldException e2) {
					throw new NoSuchMemberException(path[i]);
				}
			}
			propertyName = path[i + 1];
		}
		// logger.debug("find member: " + objectClass + ", name: " +
		// propertyName);

		try {
			return getter(objectClass, propertyName);
		} catch (NoSuchMethodException ex) {
			try {
				return objectClass.getDeclaredField(propertyName);
			} catch (NoSuchFieldException e) {
				// logger.debug("not found!");

				Class<?> sc = objectClass.getSuperclass();
				// logger.debug("super: " + sc);

				if (sc == null)
					throw new NoSuchMemberException(propertyName);

				return findMember(sc, propertyPath);
			}
		}
	}

	/**
	 * 
	 * @param objectClass
	 * @param propertyPath
	 * @return
	 * @throws NoSuchFieldException
	 */
	public static Field findField(Class<?> objectClass, String propertyPath) throws NoSuchFieldException {
		// logger.debug("find field: " + objectClass + ", path: " +
		// propertyPath);
		String propertyName = propertyPath;

		String path[] = propertyPath.split("\\.");
		for (int i = 0; i < path.length - 1; i++) {
			objectClass = objectClass.getDeclaredField(path[i]).getType();
			propertyName = path[i + 1];
		}
		// logger.debug("find field: " + objectClass + ", name: " +
		// propertyName);

		try {
			Field f = objectClass.getDeclaredField(propertyName);
			// logger.debug("field found: " + f);
			return f;
		} catch (NoSuchFieldException ex) {
			// logger.debug("not found!");
			Class<?> sc = objectClass.getSuperclass();
			// logger.debug("super: " + sc);

			if (sc == null)
				throw ex;
			return findField(sc, propertyPath);
		}
	}

	private static AnnotationTarget getDeclaredMember(Class<?> cls, String name) throws NoSuchMemberException {
		try {
			return new AnnotationTarget(cls.getDeclaredField(name));
		} catch (NoSuchFieldException e) {
			try {
				return new AnnotationTarget(cls.getDeclaredMethod(createMetodName("get", name)));
			} catch (NoSuchMethodException e1) {
				throw new NoSuchMemberException(name);
			}
		}
	}

	/**
	 * Найти Field или Method и вернуть его как AnnotationTarget
	 * 
	 * @param objectClass
	 * @param propertyPath
	 * @return
	 * @throws ToolkitException
	 */
	public static AnnotationTarget findAnnotationTarget(Class<?> objectClass, String propertyPath)
			throws ToolkitException {
		// logger.debug("find member: " + objectClass + ", path: " +
		// propertyPath);
		String propertyName = propertyPath;

		String path[] = propertyPath.split("\\.");
		for (int i = 0; i < path.length - 1; i++) {
			AnnotationTarget m = getDeclaredMember(objectClass, path[i]);
			objectClass = m.getType();

			propertyName = path[i + 1];
		}
		// logger.debug("find field: " + objectClass + ", name: " +
		// propertyName);

		try {
			AnnotationTarget f = getDeclaredMember(objectClass, propertyName);
			// logger.debug("Member found: " + f);
			return f;
		} catch (NoSuchMemberException ex) {
			// logger.debug("not found!");
			Class<?> sc = objectClass.getSuperclass();
			// logger.debug("super: " + sc);

			if (sc == null)
				throw ex;
			return findAnnotationTarget(sc, propertyName);
		}
	}

	public static <T extends Annotation> T findAnnotation(Class<?> cls, Class<T> ac) {
		T a = cls.getAnnotation(ac);

		// Logger.getLogger("BeanTools#findAnnotation").debug(
		// "cls: " + cls + ", a: " + a);
		if (a != null)
			return a;
		else if (cls.getSuperclass() == null)
			return null;
		else
			return findAnnotation(cls.getSuperclass(), ac);
	}

	public static Class<?> getParameterizedClass(Type type) {
		ParameterizedType pt = (ParameterizedType) type;
		return (Class<?>) pt.getActualTypeArguments()[0];
	}

	public static Class<?> findReturnType(Class<?> objectClass, String propertyPath) throws ToolkitException {

		Member m = findMember(objectClass, propertyPath);

		if (m instanceof Field)
			return ((Field) m).getType();
		if (m instanceof Method)
			return ((Method) m).getReturnType();

		throw new ToolkitException("Incorrect type of member: " + m.getClass());
	}

	protected static String createMetodName(String prefix, String propertyName) {
		String mname = prefix + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
		return mname;
	}

	public static Method getter(Class<?> cls, String propertyName) throws SecurityException, NoSuchMethodException {
		try {
			return cls.getMethod(createMetodName("get", propertyName));
		} catch (NoSuchMethodException ex) {
			return cls.getMethod(createMetodName("is", propertyName));
		}
	}

	private static final DateFormat tsfmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	private static final DateFormat dfmt = new SimpleDateFormat("dd.MM.yy");
	private static final Calendar cal = Calendar.getInstance();

	@SuppressWarnings("unchecked")
	public static <T> T cast(String value, Class<T> type) throws ToolkitException {

		if (type == null) {
			return (T) value;
		} else if (value == null) {
			return null;
		} else if (type.isArray()) {

			String sarr[] = value.split(",");
			T oarr = (T) Array.newInstance(type.getComponentType(), sarr.length);

			for (int i = 0; i < sarr.length; i++) {
				Array.set(oarr, i, cast(sarr[i], type.getComponentType()));
			}

			return oarr;
		} else if (type.equals(String.class)) {
			return (T) (value.length() != 0 ? value : null);
		} else if (value == null || value.equals("null") || value.trim().length() == 0) {
			return null;
		} else if (type.equals(Integer.class)) {
			return (T) new Integer(value);
		} else if (type.equals(int.class)) {
			return (T) new Integer(value);
		} else if (type.equals(Short.class)) {
			return (T) new Short(value);
		} else if (type.equals(short.class)) {
			return (T) new Short(value);
		} else if (type.equals(Long.class)) {
			return (T) new Long(value);
		} else if (type.equals(long.class)) {
			return (T) new Long(value);
		} else if (type.equals(Double.class)) {
			return (T) new Double(value);
		} else if (type.equals(double.class)) {
			return (T) new Double(value);
		} else if (type.equals(boolean.class)) {
			return (T) new Boolean(value);
		} else if (type.equals(Boolean.class)) {
			return (T) new Boolean(value);
		} else if (type.equals(java.sql.Date.class)) {
			cal.setTimeInMillis(System.currentTimeMillis());
			if (value.equals("today")) {
				return (T) new java.sql.Date(cal.getTimeInMillis());
			}
			if (value.equals("yesterday")) {
				cal.add(Calendar.DAY_OF_YEAR, -1);
				return (T) new java.sql.Date(cal.getTimeInMillis());
			}
			if (value.equals("tomorrow")) {
				cal.add(Calendar.DAY_OF_YEAR, 1);
				return (T) new java.sql.Date(cal.getTimeInMillis());
			}

			try {
				return (T) new java.sql.Date(tsfmt.parse(value).getTime());
				// return (T) java.sql.Timestamp.valueOf(value);
			} catch (Exception e) {
				try {
					return (T) java.sql.Date.valueOf(value);
				} catch (IllegalArgumentException ex) {
					value = value.replaceAll("/", ".");
					try {
						return (T) new java.sql.Date(dfmt.parse(value).getTime());
					} catch (ParseException exx) {
						throw new ToolkitException(exx);
					}
				}
			}
		}
		throw new ToolkitException("Can not convert: " + value + " to " + type);

	}

}

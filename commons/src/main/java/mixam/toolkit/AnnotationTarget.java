package mixam.toolkit;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Field или Method, описывающий поле базы данных
 * 
 * @author mixam
 * 
 */
public class AnnotationTarget {
	private final AccessibleObject member;

	public AnnotationTarget(AccessibleObject member) {
		this.member = member;
	}

	public Class<?> getType() {
		if (member instanceof Field)
			return ((Field) member).getType();
		else if (member instanceof Method)
			return ((Method) member).getReturnType();
		else
			throw new RuntimeException();
	}

	public Type getGenericType() {
		if (member instanceof Field)
			return ((Field) member).getGenericType();
		else if (member instanceof Method)
			return ((Method) member).getGenericReturnType();
		else
			throw new RuntimeException();
	}

	public boolean isAnnotationPresents(Class<? extends Annotation> a) {
		return member.isAnnotationPresent(a);
	}

	public <T extends Annotation> T getAnnotation(Class<T> a) {
		return member.getAnnotation(a);
	}

	public Annotation[] getAnnotations() {
		return member.getAnnotations();
	}
}

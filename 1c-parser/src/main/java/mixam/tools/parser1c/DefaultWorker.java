package mixam.tools.parser1c;

import mixam.toolkit.BeanTools;
import ru.com.m74.utilities.TK;

import java.lang.reflect.Field;
import java.util.Arrays;

public abstract class DefaultWorker<E> extends Worker<E> {

    public DefaultWorker(String start, String end) {
        super(start, end);
    }

    private static boolean contains(ParserKey key, String val) {
        if (TK.isEmpty(val) || key == null)
            return false;

        if (key.value().equals(val))
            return true;
        for (String keyV : key.values()) {
            if (val.equals(keyV))
                return true;
        }
        return false;
    }

    protected Field findField(Class<?> cls, String key) {
        if (cls == null)
            return null;
        for (Field f : cls.getDeclaredFields()) {
            ParserKey pk = f.getAnnotation(ParserKey.class);
            if (contains(pk, key))
                return f;
        }
        return findField(cls.getSuperclass(), key);
    }

    @Override
    public void handlePair(E entity, String key, String val) throws Exception {
        if (entity != null) {
            Field f = findField(entity.getClass(), key);
            if (f != null) {
                // Если тип = массив строк, то значения накапливаются
                if (f.getType() == String[].class) {
                    String[] cval = (String[]) BeanTools.getProperty(entity, f.getName());
                    String nval[];
                    if (cval == null) {
                        nval = new String[]{val};
                    } else {
                        nval = Arrays.copyOf(cval, cval.length + 1);
                        nval[nval.length - 1] = val;
                    }

                    BeanTools.setProperty(entity, f.getName(), nval);
                } else {
                    BeanTools.setProperty(entity, f.getName(), BeanTools.cast(val, f.getType()));
                }
            }
        }
    }
}

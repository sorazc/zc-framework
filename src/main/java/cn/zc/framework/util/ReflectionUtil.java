package cn.zc.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zc on 2017/6/24.
 */
public class ReflectionUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionUtil.class);

    /**
     * create instance of cls
     * @param cls
     * @return instance
     */
    public static Object newInstance(Class<?> cls) {
        Object instance;
        try {
            instance = cls.newInstance();
        } catch (Exception e) {
            LOGGER.error("new instance failure", e);
            throw new RuntimeException(e);
        }
        return instance;
    }

    /**
     * invoke method
     * @param obj
     * @param method
     * @param args   parameters
     * @return result of method
     */
    public static Object invokeMethod(Object obj, Method method, Object... args) {
        Object result;
        method.setAccessible(true);
        try {
            result = method.invoke(obj, args);
        } catch (IllegalAccessException e) {
            LOGGER.error("new instance failure", e);
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            LOGGER.error("new instance failure", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * set field value
     * @param obj
     * @param field
     * @param value
     */
    public static void setField(Object obj, Field field, Object value) {
        try {
            field.setAccessible(true);
            field.set(obj, value);
        } catch (IllegalAccessException e) {
            LOGGER.error("new instance failure", e);
            throw new RuntimeException(e);
        }
    }
}

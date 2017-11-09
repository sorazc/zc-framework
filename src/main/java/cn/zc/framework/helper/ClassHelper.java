package cn.zc.framework.helper;

import cn.zc.framework.annotation.Controller;
import cn.zc.framework.annotation.Service;
import cn.zc.framework.util.ClassUtil;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zc on 2017/6/21.
 */
public final class ClassHelper {

    /**
     * all class under base package
     */
    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    /**
     * @return set of service class
     */
    public static Set<Class<?>> getServiceClassSet() {
        return getClassSetByAnnotation(Service.class);
    }

    /**
     * @return set of controller class
     */
    public static Set<Class<?>> getControllerClassSet() {
        return getClassSetByAnnotation(Controller.class);
    }

    /**
     * include service classes and controller classes
     * @return bean class set
     */
    public static Set<Class<?>> getBeanClassSet() {
        Set<Class<?>> classSet = new HashSet<>();
        classSet.addAll(getServiceClassSet());
        classSet.addAll(getControllerClassSet());
        return classSet;
    }

    public static Set<Class<?>> getClassSetBySuper(Class<?> superClass) {
        Set<Class<?>> classSet = new HashSet<>();
        for (Class<?> cls : CLASS_SET) {
            if (cls.isAssignableFrom(superClass) && !superClass.equals(cls)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

    public static Set<Class<?>> getClassSetByAnnotation(Class<? extends Annotation> annotationClass) {
        Set<Class<?>> classSet = new HashSet<>();
        for (Class<?> cls : CLASS_SET) {
            if (cls.isAnnotationPresent(annotationClass)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

}

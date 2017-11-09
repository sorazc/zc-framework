package cn.zc.framework.helper;

import cn.zc.framework.annotation.Aspect;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

public final class AopHeler {

    private static Set<Class<?>> createTargetClassSet(Aspect aspect) throws Exception {
        Set<Class<?>> targetClassSet = new HashSet<>();

        Class<? extends Annotation> annotation = aspect.value();
        if (annotation != null && !annotation.equals(Aspect.class)) {
            targetClassSet.addAll(ClassHelper.getClassSetByAnnotation(annotation));
        }

        return targetClassSet;
    }

}

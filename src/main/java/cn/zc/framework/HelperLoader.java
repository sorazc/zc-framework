package cn.zc.framework;

import cn.zc.framework.helper.BeanHelper;
import cn.zc.framework.helper.ClassHelper;
import cn.zc.framework.helper.ControllerHelper;
import cn.zc.framework.helper.IocHelper;
import cn.zc.framework.util.ClassUtil;

/**
 * Created by zc on 2017/6/25.
 *
 * Init the helpers
 */
public final class HelperLoader {

    public static void init(){
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }

}

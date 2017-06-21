package cn.zc.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by zc on 2017/6/19.
 */
public class CastUtil {

    public static int getInt(String str) {
        return getInt(str, 0);
    }
    
    /**
     *
     */
    public static int getInt(String str, int defaultValue) {
        int value = defaultValue;
        if (StringUtils.isNumeric(str)) {
            value = Integer.parseInt(str);
        }
        return value;
    }

}

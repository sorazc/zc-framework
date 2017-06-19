package cn.zc.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
public class CastUtil {

    public static int castInt(String str) {
        return castInt(str, 0);
    }

    public static int castInt(String str, int defaultValue) {
        int value = defaultValue;
        if (StringUtils.isNumeric(str)) {
            value = Integer.parseInt(str);
        }
        return value;
    }

}

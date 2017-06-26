package cn.zc.framework.util;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zc on 2017/6/26.
 */
public class JsonUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);

    public static <T> String toJson(T pojo) {
        String json = null;
        try {
            json = JSON.toJSONString(pojo);
        } catch (Exception e) {
            LOGGER.error("pojo to json failure", e);
            throw new RuntimeException(e);
        }
        return json;
    }

    public static <T> T fromJson(String json, Class<T> type) {
        T pojo;
        try {
            pojo = JSON.parseObject(json, type);
        } catch (Exception e) {
            LOGGER.error("json to pojo failure", e);
            throw new RuntimeException(e);
        }
        return pojo;
    }

}

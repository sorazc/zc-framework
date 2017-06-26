package cn.zc.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/26 0026.
 */
public class View {

    /**
     * view path
     */
    private String path;

    /**
     * data model
     */
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        this.model = new HashMap<>();
    }

    public View add(String key, Object value) {
        this.model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}

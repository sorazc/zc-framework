package cn.zc.framework.bean;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/26 0026.
 *
 *  Parameter of request
 */
public class Param {

    private Map<String, Object> paraMap;

    public Param(Map<String, Object> paraMap) {
        this.paraMap = paraMap;
    }

    public Map<String, Object> getParaMap() {
        return paraMap;
    }
}


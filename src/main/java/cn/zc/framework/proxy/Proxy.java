package cn.zc.framework.proxy;

public interface Proxy {

    Object doProxy(ProxyChain proxyChain) throws Throwable;

}

package org.itstack.demo.desgin.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        Class<?>[] classes = interfaceClass.getInterfaces();
//        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
        /*
        传入三个参数
            类加载器
            需要代理的接口class
            实现了InvocationHandler的代理对象
         */
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{interfaceClass}, handler);
    }

}

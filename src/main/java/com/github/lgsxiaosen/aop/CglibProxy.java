package com.github.lgsxiaosen.aop;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author sen
 * 2020/3/2 09:43
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("打印开始时间：" + start);
        Object res = methodProxy.invokeSuper(o, objects);
        long end = System.currentTimeMillis();
        System.out.println("打印结束时间：" + end);
        return res;
    }
}

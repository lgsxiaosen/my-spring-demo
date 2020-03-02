package com.github.lgsxiaosen.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author sen
 * 2020/3/2 09:19
 */
public class PrintAopServiceHandler implements InvocationHandler {

    private Object target;

    public PrintAopServiceHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("打印开始时间：" + start);
        Object res = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("打印结束时间：" + end);
        return res;
    }
}

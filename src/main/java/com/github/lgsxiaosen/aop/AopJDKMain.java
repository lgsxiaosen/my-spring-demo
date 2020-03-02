package com.github.lgsxiaosen.aop;

import java.lang.reflect.Proxy;

/**
 * @author sen
 * 2020/3/2 09:30
 */
public class AopJDKMain {

    public static void main(String[] args){
        PrintAopService printAopService = new PrintAopServiceImpl();

        PrintAopServiceHandler handler = new PrintAopServiceHandler(printAopService);

        PrintAopService printAopService1 = (PrintAopService) Proxy.newProxyInstance(printAopService.getClass().getClassLoader(), printAopService.getClass().getInterfaces(), handler);

        printAopService1.saySomething(1, "测试aop");

    }
}

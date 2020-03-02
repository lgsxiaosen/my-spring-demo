package com.github.lgsxiaosen.aop;

/**
 * @author sen
 * 2020/3/2 09:51
 */
public class CglibMain {

    public static void main(String[] args){
        CglibProxy cglibProxy = new CglibProxy();

        PrintAopServiceImpl aopService = (PrintAopServiceImpl) cglibProxy.getProxy(PrintAopServiceImpl.class);

        aopService.cgLibTest("cglib");

    }
}

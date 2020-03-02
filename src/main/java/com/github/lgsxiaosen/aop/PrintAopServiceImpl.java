package com.github.lgsxiaosen.aop;

/**
 * @author sen
 * 2020/3/2 09:18
 */
public class PrintAopServiceImpl implements PrintAopService {


    @Override
    public void saySomething(int number, String name) {
        System.out.println("aop测试，序号：" + number + ", 名字：" + name);
    }

    public void cgLibTest(String name){
        System.out.println("CGLib测试：name=" + name);
    }

}

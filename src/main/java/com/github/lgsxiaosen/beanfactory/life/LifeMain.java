package com.github.lgsxiaosen.beanfactory.life;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author sen
 * 2020/2/27 09:30
 */
public class LifeMain {

    public static void main(String[] args){
        // 装载配置文件并启动容器
        Resource res = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((DefaultListableBeanFactory)beanFactory);
        reader.loadBeanDefinitions(res);
        // 像容器注册MyBeanPostProcessor后处理器
        ((DefaultListableBeanFactory) beanFactory).addBeanPostProcessor(new MyBeanPostProcessor());
        // 像容器注册MyBeanInstantiationAwareBeanPostProcessor后处理器
        ((DefaultListableBeanFactory) beanFactory).addBeanPostProcessor(new MyBeanInstantiationAwareBeanPostProcessor());

        // 第一次从容器中获取car，将触发容器实例化bean，引起bean生命周期方法的调用
        CarBeanLife car = (CarBeanLife) beanFactory.getBean("car-life");
        car.printCar();
        car.setColor("green");

        // 第二次从容器获取car，直接从缓存池中获取
        CarBeanLife car2 = (CarBeanLife) beanFactory.getBean("car-life");

        // 查看car和car2是否指向同一引用
        System.out.println("car==car2:" + (car==car2));

        // 关闭容器
        ((DefaultListableBeanFactory) beanFactory).destroySingletons();
    }
}

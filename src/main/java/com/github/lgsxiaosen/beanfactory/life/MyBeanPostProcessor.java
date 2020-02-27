package com.github.lgsxiaosen.beanfactory.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.Objects;

/**
 * @author sen
 * 2020/2/27 08:59
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("car-life".equals(beanName)){
            CarBeanLife car = (CarBeanLife) bean;
            if (Objects.isNull(car.getColor())){
                System.out.println("调用BeanPostProcessor.postProcessBeforeInitialization方法设置颜色");
                car.setColor("black");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("car-life".equals(beanName)){
            CarBeanLife car = (CarBeanLife) bean;
            if (car.getSpeed()>300){
                System.out.println("调用BeanPostProcessor.postProcessAfterInitialization修改速度");
                car.setSpeed(300);
            }
        }
        return bean;
    }
}

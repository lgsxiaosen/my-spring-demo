package com.github.lgsxiaosen.beanfactory.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author sen
 * 2020/2/26 09:15
 */
public class CarBeanLife implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    private String type;

    private String color;

    private int speed;

    private BeanFactory beanFactory;

    private String beanName;

    public CarBeanLife(){
        System.out.println("调用CarBeanLife构造函数");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware接口方法设置beanFactory");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("调用BeanNameAware接口方法设置beanName");
        this.beanName = s;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destroy方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet方法");
    }

    public void myInit(){
        System.out.println("调用init-method方法指定的myInit方法设置速度为400");
        this.speed = 400;
    }

    public void myDestroy(){
        System.out.println("调用destroy-method方法指定的myDestroy方法");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("设置car类型");
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CarBeanLife{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    public void printCar(){
        System.out.println(this.toString());
    }
}

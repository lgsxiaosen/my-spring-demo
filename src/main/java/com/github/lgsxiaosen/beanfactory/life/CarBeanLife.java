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

    }

    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
}

package com.github.lgsxiaosen.context;

import com.github.lgsxiaosen.po.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sen
 * 2020/2/26 08:46
 */
public class ApplicationContextTest {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
        Car car = context.getBean("car-bean", Car.class);
        System.out.println(car.toString());
    }
}

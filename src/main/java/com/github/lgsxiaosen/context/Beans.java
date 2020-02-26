package com.github.lgsxiaosen.context;

import com.github.lgsxiaosen.po.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sen
 * 2020/2/26 08:41
 */
@Configuration
public class Beans {

    @Bean(name = "car-bean")
    public Car buildCar(){
        Car car = new Car();
        car.setColor("red");
        car.setSpeed(1000);
        car.setType("BMW");
        return car;
    }
}

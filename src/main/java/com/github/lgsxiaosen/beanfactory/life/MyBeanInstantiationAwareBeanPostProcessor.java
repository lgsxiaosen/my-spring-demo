package com.github.lgsxiaosen.beanfactory.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * @author sen
 * 2020/2/27 08:37
 */
public class MyBeanInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    /**
     * 实例化bean前调用
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("car-life".equals(beanName)){
            System.out.println("实例化前调用InstantiationAwareBeanPostProcessorAdapter.postProcessBeforeInstantiation");
        }

        return super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    /**
     * 实例化bean后调用
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("car-life".equals(beanName)){
            System.out.println("实例化后调用InstantiationAwareBeanPostProcessorAdapter.postProcessAfterInstantiation");
        }
        return super.postProcessAfterInstantiation(bean, beanName);
    }

    /**
     * 在设置某个属性值后调用
     * @param pvs
     * @param pds
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if ("car-life".equals(beanName)){
            System.out.println("对car-life的某个属性处理时调用InstantiationAwareBeanPostProcessorAdapter.postProcessPropertyValues");
        }
        return super.postProcessPropertyValues(pvs, pds, bean, beanName);
    }
}

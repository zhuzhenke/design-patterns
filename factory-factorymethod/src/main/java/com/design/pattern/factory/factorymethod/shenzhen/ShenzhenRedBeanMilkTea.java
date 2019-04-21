package com.design.pattern.factory.factorymethod.shenzhen;


import com.design.pattern.factory.factorymethod.MilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class ShenzhenRedBeanMilkTea extends MilkTea {


    public ShenzhenRedBeanMilkTea(String store, String name) {
        super(name);
        System.out.println("this is from " + store);

    }

    public ShenzhenRedBeanMilkTea(String name) {
        super(name);
    }
}

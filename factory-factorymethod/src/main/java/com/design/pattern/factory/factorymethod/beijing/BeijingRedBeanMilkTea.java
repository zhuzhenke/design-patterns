package com.design.pattern.factory.factorymethod.beijing;


import com.design.pattern.factory.factorymethod.MilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class BeijingRedBeanMilkTea extends MilkTea {


    public BeijingRedBeanMilkTea(String store, String name) {
        super(name);
        System.out.println("this is from " + store);
    }

    public BeijingRedBeanMilkTea(String name) {
        super(name);
    }
}

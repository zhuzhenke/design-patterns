package com.design.pattern.factory.factorymethod.shenzhen;


import com.design.pattern.factory.factorymethod.MilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class ShenzhenCoconutMilkTea extends MilkTea {


    public ShenzhenCoconutMilkTea(String store, String name) {
        super(store + " " + name);
        System.out.println("this is from " + store);

    }
}

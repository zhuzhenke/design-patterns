package com.design.pattern.factory.abstractfactory.milktea;


import com.design.pattern.factory.abstractfactory.MilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class BeijingCoconutMilkTea extends MilkTea {


    public BeijingCoconutMilkTea(String store, String name) {
        super(name);
        System.out.println("this is from " + store);

    }

    public BeijingCoconutMilkTea(String name) {
        super(name);
    }
}

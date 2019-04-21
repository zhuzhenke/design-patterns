package com.design.pattern.factory.abstractfactory.milktea;

import com.design.pattern.factory.abstractfactory.MilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class ShenzhenCoconutMilkTea extends MilkTea {


    public ShenzhenCoconutMilkTea(String store, String name) {
        super(name);
        System.out.println("this is from " + store);

    }

    public ShenzhenCoconutMilkTea(String name) {
        super(name);
    }
}

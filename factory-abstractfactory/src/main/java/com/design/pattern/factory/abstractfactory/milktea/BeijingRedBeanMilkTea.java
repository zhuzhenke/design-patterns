package com.design.pattern.factory.abstractfactory.milktea;


import com.design.pattern.factory.abstractfactory.MaterialFactory;
import com.design.pattern.factory.abstractfactory.MilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class BeijingRedBeanMilkTea extends MilkTea {

    private MaterialFactory materialFactory;

    @Override
    public void prepare() {
        System.out.println("preparing materials with" + this.getClass().getSimpleName());
        super.milk = materialFactory.getMilk();
        super.tea = materialFactory.getTea();
    }

    public BeijingRedBeanMilkTea(String store, String name, MaterialFactory materialFactory) {
        super(name);
        System.out.println("this is from " + store);
        this.materialFactory = materialFactory;
    }

}

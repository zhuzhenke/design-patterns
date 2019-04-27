package com.design.pattern.factory.abstractfactory;

import com.design.pattern.factory.abstractfactory.material.Milk;
import com.design.pattern.factory.abstractfactory.material.Tea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public abstract class MilkTea {

    private String name;

    protected Milk milk;

    protected Tea tea;

    public MilkTea(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void addMaterials() {
        System.out.println(name + " addMaterials");
    }

    public void pack() {
        System.out.println(name + " pack");
    }

    public void delivery() {
        System.out.println(name + " delivery");
    }

}

package com.design.pattern.factory.abstractfactory;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class MilkTea {

    private String name;

    public MilkTea(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println(name + " prepare");
    }

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

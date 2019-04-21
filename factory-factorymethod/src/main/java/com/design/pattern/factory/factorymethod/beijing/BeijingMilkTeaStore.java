package com.design.pattern.factory.factorymethod.beijing;


import com.design.pattern.factory.factorymethod.AbstractMilkTeaStore;
import com.design.pattern.factory.factorymethod.MilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class BeijingMilkTeaStore extends AbstractMilkTeaStore {

    private BeijingSimpleMilkTeaFactory milkTeaFactory;

    public BeijingMilkTeaStore(BeijingSimpleMilkTeaFactory milkTeaFactory) {
        this.milkTeaFactory = milkTeaFactory;
    }

    @Override
    protected MilkTea createMilkTea(String type) {
        return milkTeaFactory.createMilkTea(type);
    }
}

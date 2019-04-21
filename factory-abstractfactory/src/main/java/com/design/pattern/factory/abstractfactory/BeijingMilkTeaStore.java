package com.design.pattern.factory.abstractfactory;


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

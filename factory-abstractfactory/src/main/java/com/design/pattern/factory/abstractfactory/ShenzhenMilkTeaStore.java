package com.design.pattern.factory.abstractfactory;


/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class ShenzhenMilkTeaStore extends AbstractMilkTeaStore {

    private ShenzhenSimpleMilkTeaFactory milkTeaFactory;

    public ShenzhenMilkTeaStore(ShenzhenSimpleMilkTeaFactory milkTeaFactory) {
        this.milkTeaFactory = milkTeaFactory;
    }

    @Override
    protected MilkTea createMilkTea(String type) {
        return milkTeaFactory.createMilkTea(type);
    }
}

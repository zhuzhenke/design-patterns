package com.design.pattern.factory.factorymethod;


/**
 * Expanding Stores: Multi-Store Model
 * 工厂方法让类将实例化推迟到子类
 * <p>
 * 一般也可以提供一个默认的工厂方法，这么一来当没有子类时，可以使用默认的工厂方法来创建产品
 *
 * @author zhuzhenke
 * @date 2019/4/21
 */
public abstract class AbstractMilkTeaStore {

    public void buyMilkTea(String type) {
        /**
         * 工厂方法模式：通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的。
         */
        MilkTea milkTea = createMilkTea(type);

        milkTea.prepare();
        milkTea.addMaterials();
        milkTea.pack();
        milkTea.delivery();
    }

    /**
     * 工厂方法是抽象的
     * 这里工厂方法返回一个产品(奶茶).超类中定义的方法，通常使用工厂方法的返回值
     * 工厂方法将客户(buyMilkTea方法)和实际创建具体产品的代码分隔开来
     */
    protected abstract MilkTea createMilkTea(String type);
}

package com.design.pattern.factory.factorymethod;



/**
 * Expanding Stores: Multi-Store Model
 *
 * @author zhuzhenke
 * @date 2019/4/21
 */
public abstract class AbstractMilkTeaStore {

    public void buyMilkTea(String type) {
        MilkTea milkTea = createMilkTea(type);

        milkTea.prepare();
        milkTea.addMaterials();
        milkTea.pack();
        milkTea.delivery();
    }

    protected abstract MilkTea createMilkTea(String type);
}

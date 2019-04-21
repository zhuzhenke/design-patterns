package com.design.pattern.factory.simplefactory;


/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class MilkTeaStoreV2 {

    private SimpleMilkTeaFactory simpleMilkTeaFactory;

    public MilkTeaStoreV2(SimpleMilkTeaFactory simpleMilkTeaFactory) {
        this.simpleMilkTeaFactory = simpleMilkTeaFactory;
    }

    public void buyMilkTea(String type) {
        MilkTea milkTea = simpleMilkTeaFactory.createMilkTea(type);

        milkTea.prepare();
        milkTea.addMaterials();
        milkTea.pack();
        milkTea.delivery();
    }
}

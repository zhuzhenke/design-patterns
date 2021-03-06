package com.design.pattern.factory.factorymethod.shenzhen;


import com.design.pattern.factory.factorymethod.MilkTea;
import com.design.pattern.factory.factorymethod.types.MilkTeaTypeEnum;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class ShenzhenSimpleMilkTeaFactory {

    private String storeName = "Shenzhen Store";

    public MilkTea createMilkTea(String type) {
        MilkTea milkTea = null;
        if (MilkTeaTypeEnum.RedBeanMilkTea.name().equals(type)) {
            milkTea = new ShenzhenRedBeanMilkTea(storeName, type);
        } else if (MilkTeaTypeEnum.CoconutMilkTea.name().equals(type)) {
            milkTea = new ShenzhenRedBeanMilkTea(storeName, type);
        }
        return milkTea;
    }
}

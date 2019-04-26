package com.design.pattern.factory.factorymethod.beijing;


import com.design.pattern.factory.factorymethod.MilkTea;
import com.design.pattern.factory.factorymethod.shenzhen.ShenzhenRedBeanMilkTea;
import com.design.pattern.factory.factorymethod.types.MilkTeaTypeEnum;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class BeijingSimpleMilkTeaFactory {

    private String storeName = "Beijing Store";

    public MilkTea createMilkTea(String type) {
        MilkTea milkTea = null;
        if (MilkTeaTypeEnum.RedBeanMilkTea.name().equals(type)) {
            milkTea = new BeijingRedBeanMilkTea(storeName, type);
        } else if (MilkTeaTypeEnum.CoconutMilkTea.name().equals(type)) {
            milkTea = new BeijingRedBeanMilkTea(storeName, type);
        }
        return milkTea;
    }
}

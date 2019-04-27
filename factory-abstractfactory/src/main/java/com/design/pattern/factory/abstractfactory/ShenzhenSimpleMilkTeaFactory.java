package com.design.pattern.factory.abstractfactory;

import com.design.pattern.factory.abstractfactory.milktea.ShenzhenRedBeanMilkTea;
import com.design.pattern.factory.abstractfactory.types.MilkTeaTypeEnum;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class ShenzhenSimpleMilkTeaFactory {

    private String storeName = "Shenzhen Store";

    public MilkTea createMilkTea(String type) {
        MilkTea milkTea = null;

        MaterialFactory materialFactory = new ShenzhenMaterialFactory();

        if (MilkTeaTypeEnum.RedBeanMilkTea.name().equals(type)) {
            milkTea = new ShenzhenRedBeanMilkTea(storeName, type, materialFactory);
        } else if (MilkTeaTypeEnum.CoconutMilkTea.name().equals(type)) {
            milkTea = new ShenzhenRedBeanMilkTea(storeName, type, materialFactory);
        }
        return milkTea;
    }
}

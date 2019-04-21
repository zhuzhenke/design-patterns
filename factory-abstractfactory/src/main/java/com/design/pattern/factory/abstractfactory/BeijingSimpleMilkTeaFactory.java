package com.design.pattern.factory.abstractfactory;


import com.design.pattern.factory.abstractfactory.material.Milk;
import com.design.pattern.factory.abstractfactory.material.Tea;
import com.design.pattern.factory.abstractfactory.material.beijing.BeijingMilk;
import com.design.pattern.factory.abstractfactory.material.beijing.BeijingTea;
import com.design.pattern.factory.abstractfactory.material.shenzhen.ShenzhenMilk;
import com.design.pattern.factory.abstractfactory.material.shenzhen.ShenzhenTea;
import com.design.pattern.factory.abstractfactory.milktea.ShenzhenRedBeanMilkTea;
import com.design.pattern.factory.abstractfactory.types.MilkTeaTypeEnum;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class BeijingSimpleMilkTeaFactory {

    private String storeName = "Beijing Store";

    public MilkTea createMilkTea(String type) {
        MilkTea milkTea = null;

        Milk milk = new BeijingMilk();
        Tea tea = new BeijingTea();
        if (MilkTeaTypeEnum.RedBeanMilkTea.name().equals(type)) {
            milkTea = new ShenzhenRedBeanMilkTea(storeName, type);
        } else if (MilkTeaTypeEnum.CoconutMilkTea.name().equals(type)) {
            milkTea = new ShenzhenRedBeanMilkTea(storeName, type);
        }
        return milkTea;
    }
}

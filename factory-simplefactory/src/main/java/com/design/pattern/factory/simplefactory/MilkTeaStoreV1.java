package com.design.pattern.factory.simplefactory;


import com.design.pattern.factory.simplefactory.types.CoconutMilkTea;
import com.design.pattern.factory.simplefactory.types.MilkTeaTypeEnum;
import com.design.pattern.factory.simplefactory.types.RedBeanMilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class MilkTeaStoreV1 {

    public void buyMilkTea(String type) {
        MilkTea milkTea = null;
        if (MilkTeaTypeEnum.RedBeanMilkTea.name().equals(type)) {
            milkTea = new RedBeanMilkTea();
        } else if (MilkTeaTypeEnum.CoconutMilkTea.name().equals(type)) {
            milkTea = new CoconutMilkTea();
        }

        milkTea.prepare();
        milkTea.addMaterials();
        milkTea.pack();
        milkTea.delivery();
    }
}

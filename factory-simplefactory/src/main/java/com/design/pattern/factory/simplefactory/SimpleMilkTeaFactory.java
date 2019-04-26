package com.design.pattern.factory.simplefactory;


import com.design.pattern.factory.simplefactory.types.CoconutMilkTea;
import com.design.pattern.factory.simplefactory.types.MilkTeaTypeEnum;
import com.design.pattern.factory.simplefactory.types.RedBeanMilkTea;

/**
 * 简单工厂其实不是一种设计模式，反而像是一种编码习惯
 * 简单工厂在这里主要的作用是将创建过程的代码放在一个类中，方便管理。后续需要修改只要在这里改就行了
 * 同时也是一个解耦功能，将实例化的代码从客户代码中删除。
 *
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class SimpleMilkTeaFactory {

    public MilkTea createMilkTea(String type) {
        MilkTea milkTea = null;
        if (MilkTeaTypeEnum.RedBeanMilkTea.name().equals(type)) {
            milkTea = new RedBeanMilkTea();
        } else if (MilkTeaTypeEnum.CoconutMilkTea.name().equals(type)) {
            milkTea = new CoconutMilkTea();
        }
        return milkTea;
    }
}

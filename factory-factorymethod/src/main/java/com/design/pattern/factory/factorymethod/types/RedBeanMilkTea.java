package com.design.pattern.factory.factorymethod.types;


import com.design.pattern.factory.factorymethod.MilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class RedBeanMilkTea extends MilkTea {

    public RedBeanMilkTea() {
        super(MilkTeaTypeEnum.RedBeanMilkTea.name());
    }
}

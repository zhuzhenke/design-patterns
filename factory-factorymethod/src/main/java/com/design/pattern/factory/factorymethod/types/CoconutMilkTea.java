package com.design.pattern.factory.factorymethod.types;


import com.design.pattern.factory.factorymethod.MilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class CoconutMilkTea extends MilkTea {

    public CoconutMilkTea() {
        super(MilkTeaTypeEnum.CoconutMilkTea.name());
    }
}

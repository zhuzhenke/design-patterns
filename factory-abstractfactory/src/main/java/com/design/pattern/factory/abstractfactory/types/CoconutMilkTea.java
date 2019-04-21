package com.design.pattern.factory.abstractfactory.types;

import com.design.pattern.factory.abstractfactory.MilkTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class CoconutMilkTea extends MilkTea {

    public CoconutMilkTea() {
        super(MilkTeaTypeEnum.CoconutMilkTea.name());
    }
}

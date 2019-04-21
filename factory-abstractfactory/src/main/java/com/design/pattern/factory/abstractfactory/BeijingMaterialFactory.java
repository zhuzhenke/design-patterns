package com.design.pattern.factory.abstractfactory;

import com.design.pattern.factory.abstractfactory.material.Milk;
import com.design.pattern.factory.abstractfactory.material.Tea;
import com.design.pattern.factory.abstractfactory.material.beijing.BeijingMilk;
import com.design.pattern.factory.abstractfactory.material.beijing.BeijingTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class BeijingMaterialFactory implements MaterialFactory {
    @Override
    public Milk getMilk() {
        return new BeijingMilk();
    }

    @Override
    public Tea getTea() {
        return new BeijingTea();
    }
}

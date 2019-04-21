package com.design.pattern.factory.abstractfactory;

import com.design.pattern.factory.abstractfactory.material.Milk;
import com.design.pattern.factory.abstractfactory.material.Tea;
import com.design.pattern.factory.abstractfactory.material.shenzhen.ShenzhenMilk;
import com.design.pattern.factory.abstractfactory.material.shenzhen.ShenzhenTea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class ShenzhenMaterialFactory implements MaterialFactory {
    @Override
    public Milk getMilk() {
        return new ShenzhenMilk();
    }

    @Override
    public Tea getTea() {
        return new ShenzhenTea();
    }
}

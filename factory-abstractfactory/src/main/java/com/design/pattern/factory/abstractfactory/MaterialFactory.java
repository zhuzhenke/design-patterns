package com.design.pattern.factory.abstractfactory;

import com.design.pattern.factory.abstractfactory.material.Milk;
import com.design.pattern.factory.abstractfactory.material.Tea;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public interface MaterialFactory {
    Milk getMilk();

    Tea getTea();
}

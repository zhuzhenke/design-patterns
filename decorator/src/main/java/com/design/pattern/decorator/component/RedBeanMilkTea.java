package com.design.pattern.decorator.component;

import com.design.pattern.decorator.MilkTea;
import com.design.pattern.decorator.CostConstants;

/**
 * @author zhuzhenke
 * @date 2019/4/20
 */
public class RedBeanMilkTea extends MilkTea {

    @Override
    public String getDescription() {
        return "Red Bean";
    }

    @Override
    public Long cost() {
        return CostConstants.RED_BEAN_MILK_TEA;
    }
}

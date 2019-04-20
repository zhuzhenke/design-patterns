package com.design.pattern.decorator.component;

import com.design.pattern.decorator.MilkTea;
import com.design.pattern.decorator.CostConstants;

/**
 * @author zhuzhenke
 * @date 2019/4/20
 */
public class CoconutMilkTea extends MilkTea {

    @Override
    public String getDescription() {
        return "Coconut";
    }

    @Override
    public Long cost() {
        return CostConstants.COCONUT_MILK_TEA;
    }
}

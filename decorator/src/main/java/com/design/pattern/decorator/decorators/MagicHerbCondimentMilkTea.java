package com.design.pattern.decorator.decorators;

import com.design.pattern.decorator.CondimentMilkTea;
import com.design.pattern.decorator.MilkTea;
import com.design.pattern.decorator.CostConstants;

/**
 * @author zhuzhenke
 * @date 2019/4/20
 */
public class MagicHerbCondimentMilkTea extends CondimentMilkTea {

    private MilkTea milkTea;

    public MagicHerbCondimentMilkTea(MilkTea milkTea) {
        this.milkTea = milkTea;
    }


    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", Magic Herb";
    }

    @Override
    public Long cost() {
        return milkTea.cost() + CostConstants.MAGIC_HERB_CONDIMENT_MILK_TEA ;
    }
}

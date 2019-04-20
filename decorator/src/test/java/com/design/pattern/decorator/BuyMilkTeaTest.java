package com.design.pattern.decorator;

import com.design.pattern.decorator.component.CoconutMilkTea;
import com.design.pattern.decorator.component.RedBeanMilkTea;
import com.design.pattern.decorator.decorators.MagicHerbCondimentMilkTea;
import com.design.pattern.decorator.decorators.PearlCondimentMilkTea;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/20
 */
public class BuyMilkTeaTest {

    @Test
    public void testNullCondiment() {
        MilkTea milkTea = new CoconutMilkTea();
        System.out.println("description : " + milkTea.getDescription());
        System.out.println("cost : " + milkTea.cost());
        Assert.assertEquals(CostConstants.COCONUT_MILK_TEA, milkTea.cost());
    }

    @Test
    public void testOneCondiment() {
        MilkTea milkTea = new MagicHerbCondimentMilkTea(new RedBeanMilkTea());
        System.out.println("description : " + milkTea.getDescription());
        System.out.println("cost : " + milkTea.cost());
        Long expectCost = CostConstants.MAGIC_HERB_CONDIMENT_MILK_TEA
                + CostConstants.RED_BEAN_MILK_TEA;
        Assert.assertEquals(expectCost, milkTea.cost());
    }

    @Test
    public void testTwoCondiment() {
        MilkTea milkTea = new MagicHerbCondimentMilkTea(new PearlCondimentMilkTea(new RedBeanMilkTea()));
        System.out.println("description : " + milkTea.getDescription());
        System.out.println("cost : " + milkTea.cost());
        Long expectCost = CostConstants.MAGIC_HERB_CONDIMENT_MILK_TEA
                + CostConstants.PEARL_CONDIMENT_MILK_TEA
                + CostConstants.RED_BEAN_MILK_TEA;
        Assert.assertEquals(expectCost, milkTea.cost());
    }

    @Test
    public void testManyCondiment() {
        MilkTea milkTea = new MagicHerbCondimentMilkTea(new PearlCondimentMilkTea(new MagicHerbCondimentMilkTea(new PearlCondimentMilkTea(new RedBeanMilkTea()))));
        System.out.println("description : " + milkTea.getDescription());
        System.out.println("cost : " + milkTea.cost());
        Long expectCost = CostConstants.MAGIC_HERB_CONDIMENT_MILK_TEA * 2
                + CostConstants.PEARL_CONDIMENT_MILK_TEA * 2
                + CostConstants.RED_BEAN_MILK_TEA;
        Assert.assertEquals(expectCost, milkTea.cost());
    }


}

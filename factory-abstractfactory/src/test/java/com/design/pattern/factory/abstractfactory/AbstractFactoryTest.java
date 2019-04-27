package com.design.pattern.factory.abstractfactory;

import com.design.pattern.factory.abstractfactory.types.MilkTeaTypeEnum;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class AbstractFactoryTest {
    @Test
    public void testMultipleStoreWithInDependencyMaterials() {
        AbstractMilkTeaStore milkTeaStore = new ShenzhenMilkTeaStore(new ShenzhenSimpleMilkTeaFactory());
        milkTeaStore.buyMilkTea(MilkTeaTypeEnum.RedBeanMilkTea.name());
        milkTeaStore.buyMilkTea(MilkTeaTypeEnum.CoconutMilkTea.name());

        System.out.println();
        milkTeaStore = new BeijingMilkTeaStore(new BeijingSimpleMilkTeaFactory());
        milkTeaStore.buyMilkTea(MilkTeaTypeEnum.RedBeanMilkTea.name());
        milkTeaStore.buyMilkTea(MilkTeaTypeEnum.CoconutMilkTea.name());
    }
}

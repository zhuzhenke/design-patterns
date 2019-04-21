package com.design.pattern.factory.factorymethod;


import com.design.pattern.factory.factorymethod.beijing.BeijingMilkTeaStore;
import com.design.pattern.factory.factorymethod.beijing.BeijingSimpleMilkTeaFactory;
import com.design.pattern.factory.factorymethod.shenzhen.ShenzhenMilkTeaStore;
import com.design.pattern.factory.factorymethod.shenzhen.ShenzhenSimpleMilkTeaFactory;
import com.design.pattern.factory.factorymethod.types.MilkTeaTypeEnum;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class FactoryMethodStoreTest {
    @Test
    public void testMultipleStore() {
        AbstractMilkTeaStore milkTeaStore = new ShenzhenMilkTeaStore(new ShenzhenSimpleMilkTeaFactory());
        milkTeaStore.buyMilkTea(MilkTeaTypeEnum.RedBeanMilkTea.name());
        milkTeaStore.buyMilkTea(MilkTeaTypeEnum.CoconutMilkTea.name());

        milkTeaStore = new BeijingMilkTeaStore(new BeijingSimpleMilkTeaFactory());
        milkTeaStore.buyMilkTea(MilkTeaTypeEnum.RedBeanMilkTea.name());
        milkTeaStore.buyMilkTea(MilkTeaTypeEnum.CoconutMilkTea.name());
    }
}

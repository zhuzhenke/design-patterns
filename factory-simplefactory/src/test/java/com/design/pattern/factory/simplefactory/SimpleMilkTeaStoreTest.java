package com.design.pattern.factory.simplefactory;


import com.design.pattern.factory.simplefactory.types.MilkTeaTypeEnum;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class SimpleMilkTeaStoreTest {

    @Test
    public void testMilkTeaStoreV1() {
        new MilkTeaStoreV1().buyMilkTea(MilkTeaTypeEnum.CoconutMilkTea.name());
    }

    @Test
    public void testMilkTeaStoreV2() {
        new MilkTeaStoreV2(new SimpleMilkTeaFactory())
                .buyMilkTea(MilkTeaTypeEnum.RedBeanMilkTea.name());
    }
}

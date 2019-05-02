package com.design.pattern.iterator;

import org.junit.Test;

import java.util.Iterator;

/**
 * @author zhuzhenke
 * @date 2019/5/2
 */
public class IteratorTest {
    @Test
    public void testMilkTeaIterator() {


        MilkTeaStoreA milkTeaStoreA = new MilkTeaStoreA();
        MilkTea milkTeaARedBean = new MilkTea("StoreA red bean", "red bean milk tea");
        MilkTea milkTeaAGreenBean = new MilkTea("StoreA green bean", "green bean milk tea");
        milkTeaStoreA.addMilkTea(milkTeaARedBean);
        milkTeaStoreA.addMilkTea(milkTeaAGreenBean);

        MilkTeaStoreA milkTeaStoreB = new MilkTeaStoreA();
        MilkTea milkTeaBPearl = new MilkTea("StoreB pearl", "pearl milk tea");
        MilkTea milkTeaBMango = new MilkTea("StoreB mango", "mango milk tea");
        milkTeaStoreB.addMilkTea(milkTeaBPearl);
        milkTeaStoreB.addMilkTea(milkTeaBMango);


        //iterator A
        Iterator<MilkTea> milkTeaIteratorA = milkTeaStoreA.iterator();
        while (milkTeaIteratorA.hasNext()) {
            milkTeaIteratorA.next().printDetails();
        }

        //iterator B
        Iterator<MilkTea> milkTeaIteratorB = milkTeaStoreB.iterator();
        while (milkTeaIteratorB.hasNext()) {
            milkTeaIteratorB.next().printDetails();
        }

    }
}

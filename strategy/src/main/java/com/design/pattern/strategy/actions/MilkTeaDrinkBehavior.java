package com.design.pattern.strategy.actions;

/**
 * @author zhuzhenke
 * @date 2019/4/25
 */
public class MilkTeaDrinkBehavior implements DrinkBehavior {
    @Override
    public void drink() {
        System.out.println("I am drinking milkTea");
    }
}

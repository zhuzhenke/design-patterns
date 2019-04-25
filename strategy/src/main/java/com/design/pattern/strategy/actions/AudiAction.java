package com.design.pattern.strategy.actions;

/**
 * @author zhuzhenke
 * @date 2019/4/25
 */
public class AudiAction implements DriveAction {

    @Override
    public void drive() {
        System.out.println("I am driving with Audi");
    }
}

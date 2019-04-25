package com.design.pattern.strategy.actions;

/**
 * @author zhuzhenke
 * @date 2019/4/25
 */
public class MotorAction implements DriveAction {

    @Override
    public void drive() {
        System.out.println("I am driving with Motor");
    }
}

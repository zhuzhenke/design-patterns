package com.design.pattern.strategy;

import com.design.pattern.strategy.actions.DrinkBehavior;
import com.design.pattern.strategy.actions.DriveAction;

/**
 * @author zhuzhenke
 * @date 2019/4/25
 */
public abstract class Person {
    private DrinkBehavior drinkBehavior;
    private DriveAction driveAction;

    public void setDrinkBehavior(DrinkBehavior drinkBehavior) {
        this.drinkBehavior = drinkBehavior;
    }

    public void setDriveAction(DriveAction driveAction) {
        this.driveAction = driveAction;
    }

    public void drive() {
        driveAction.drive();
    }

    public void drink() {
        drinkBehavior.drink();
    }

    public abstract void introduce();

}

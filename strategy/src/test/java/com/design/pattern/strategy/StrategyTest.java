package com.design.pattern.strategy;

import com.design.pattern.strategy.actions.*;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/25
 */
public class StrategyTest {
    @Test
    public void testStrategy() {
        DriveAction audiAction = new AudiAction();
        DriveAction motorAction = new MotorAction();

        DrinkBehavior milkTeaDrinkBehavior = new MilkTeaDrinkBehavior();
        DrinkBehavior coffeeDrinkBehavior = new CoffeeDrinkBehavior();

        Person peter = new Peter();
        peter.setDrinkBehavior(coffeeDrinkBehavior);
        peter.setDriveAction(motorAction);
        peter.introduce();
        peter.drink();
        peter.drive();

        Person paul = new Paul();
        paul.setDriveAction(audiAction);
        paul.setDrinkBehavior(milkTeaDrinkBehavior);
        paul.introduce();
        paul.drive();
        paul.drink();

    }
}

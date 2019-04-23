package com.design.pattern.command;

import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/23
 */
public class RemoteControlTest {
    @Test
    public void testCommand() {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Television television = new Television();

        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.pressButton();

        remoteControl.setCommand(new TelevisionOnCommand(television));
        remoteControl.pressButton();
        remoteControl.undoPressButton();

    }
}

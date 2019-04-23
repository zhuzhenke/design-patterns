package com.design.pattern.command;

/**
 * @author zhuzhenke
 * @date 2019/4/23
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void undoPressButton() {
        command.undo();
    }
}

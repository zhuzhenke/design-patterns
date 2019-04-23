package com.design.pattern.command;

/**
 * @author zhuzhenke
 * @date 2019/4/23
 */
public class TelevisionOnCommand implements Command {
    private Television television;

    public TelevisionOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();
    }

    @Override
    public void undo() {
        television.off();
    }
}

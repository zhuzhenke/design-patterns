package com.design.pattern.command;

/**
 * @author zhuzhenke
 * @date 2019/4/23
 */
public class TelevisionOffCommand implements Command {
    private Television television;

    public TelevisionOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }

    @Override
    public void undo() {
        television.on();
    }
}

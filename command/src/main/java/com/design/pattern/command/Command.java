package com.design.pattern.command;

/**
 * @author zhuzhenke
 * @date 2019/4/23
 */
public interface Command {
    void execute();

    void undo();
}

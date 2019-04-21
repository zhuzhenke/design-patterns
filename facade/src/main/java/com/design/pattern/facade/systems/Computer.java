package com.design.pattern.facade.systems;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class Computer {
    public void chooseMovie(){
        System.out.println("choose movie via computer");
    }

    public void turnOn(){
        System.out.println("turn on the computer");
    }

    public void turnOff(){
        System.out.println("turn off the computer");
    }
}

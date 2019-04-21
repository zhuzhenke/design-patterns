package com.design.pattern.adapter;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class Voltage12 {

    private Integer voltage = 12;

    public Voltage12(){
        System.out.println("I am Voltage12");
    }

    public Integer getVoltage() {
        return voltage;
    }
}

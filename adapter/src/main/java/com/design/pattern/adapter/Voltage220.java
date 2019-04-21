package com.design.pattern.adapter;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class Voltage220 {
    private Integer voltage = 220;

    public Voltage220(){
        System.out.println("I am Voltage220");
    }

    public Integer getVoltage() {
        return voltage;
    }
}

package com.design.pattern.adapter;

/**
 * 类适配器实现
 *
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class Voltage220To12AdapterV1 extends Voltage220 implements VoltageAdapter {

    @Override
    public Voltage12 adapterToVoltage12() {
        Integer voltage12 = super.getVoltage() - 208;
        System.out.println(this.getClass().getSimpleName()
                + " adapter Voltage220 to Voltage12");
        return new Voltage12();
    }
}

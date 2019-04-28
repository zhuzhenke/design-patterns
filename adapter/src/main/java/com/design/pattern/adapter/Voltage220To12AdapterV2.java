package com.design.pattern.adapter;

/**
 * 对象适配器实现
 *
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class Voltage220To12AdapterV2 implements VoltageAdapter {

    private Voltage220 voltage220;

    public Voltage220To12AdapterV2(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public Voltage12 adapterToVoltage12() {
        Integer voltage12 = voltage220.getVoltage() - 208;
        System.out.println(this.getClass().getSimpleName()
                + " adapter Voltage220 to Voltage12");
        return new Voltage12();
    }
}

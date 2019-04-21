package com.design.pattern.adapter;

import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/21
 */
public class AdapterPatternTest {
    @Test
    public void testAdapter() {
        new Voltage220To12AdapterV1().adapterToVoltage12();

        new Voltage220To12AdapterV2(new Voltage220()).adapterToVoltage12();
    }
}
